/**
 * @Title: DistributedLock.java
 * @Package com.cw.zookeeper.lock
 * @Description: zookeeper分布式锁
 * Copyright: Copyright (c) 2014 
 * Company:YY Inc
 * 
 * @author WuLiangzhi
 * @date Jan 18, 2017 10:22:44 AM
 * @version V1.0
 */

package com.cw.zookeeper.lock;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;

import org.apache.commons.collections.CollectionUtils;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.Stat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cw.platform.util.StringUtil;

/**
 * @ClassName: DistributedLock
 * @Description: zookeeper分布式锁
 * @author WuLiangzhi
 * @date Jan 18, 2017 10:22:44 AM
 * 
 */

public class DistributedLock implements Watcher {

	private static final Logger logger = LoggerFactory.getLogger(DistributedLock.class);

	private String nodeRoot = "/locks"; // 锁根节点
	private String connectString = "127.0.0.1:2181"; // zookeeper服务器ip和端口
	private int sessionTimeout = 10 * 60 * 1000; // 超时时间

	private ZooKeeper zooKeeper; // ZooKeeper客户端
	private String lockName; // 锁名称
	private String myNode; // 当前节点路径
	private String waitNode; // 等待节点路径(序号比当前节点小1的前一个节点)
	
	private CountDownLatch connectedSemaphore = new CountDownLatch(1);

	public DistributedLock(String lockName) {
		this.lockName = lockName;
		try {
			zooKeeper = new ZooKeeper(connectString, sessionTimeout, this);
			Stat stat = zooKeeper.exists(nodeRoot, false);
			if (stat == null) {
				String nodeRootData = "data_" + nodeRoot;
				zooKeeper.create(nodeRoot, nodeRootData.getBytes(),
						ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
			}
		} catch (IOException e) {
			logger.error(e.getMessage(), e);
		} catch (KeeperException e) {
			logger.error(e.getMessage(), e);
		} catch (InterruptedException e) {
			logger.error(e.getMessage(), e);
		}
	}

	public boolean lock() {
		boolean lockRet = false;
		String lockPath = nodeRoot + "/" + lockName;
		try {
			String myNodeData = "data_" + lockName;
			myNode = zooKeeper.create(lockPath, myNodeData.getBytes(),
					ZooDefs.Ids.OPEN_ACL_UNSAFE,
					CreateMode.EPHEMERAL_SEQUENTIAL);
			logger.info("lock, lockPath={}, myNode={}", lockPath, myNode);

			lockRet = checkMinPath();
		} catch (KeeperException e) {
			logger.error(e.getMessage(), e);
		} catch (InterruptedException e) {
			logger.error(e.getMessage(), e);
		}

		logger.info("lock, lockRet={}", lockRet);
		return lockRet;
	}

	public boolean checkMinPath() throws KeeperException, InterruptedException {
		boolean isMin = false;
		List<String> allChilds = zooKeeper.getChildren(nodeRoot, false);
		if (CollectionUtils.isEmpty(allChilds) || StringUtil.isEmpty(myNode)) {
			logger.error("当前节点 myNode[{}] 已不存在", myNode);
		} else {
			Collections.sort(allChilds);
			for (int i = 0; i < allChilds.size(); i++) {
				String childNodePath = allChilds.get(i);
				logger.info("i={}, childNodePath={}", i, childNodePath);
			}

			String myNodeSubPath = myNode.replace(nodeRoot + "/", ""); // 当前节点的子节点路径(不包含根节点路径)
			if (myNodeSubPath.equals(allChilds.get(0))) {
				logger.info("lock success");
				isMin = true;
			} else {
				this.waitNode = nodeRoot + "/" + (Long.valueOf(myNodeSubPath) - 1);
				try {
					// 排在我前面的 waitNode 已失踪，幸福来得太突然?
					if (zooKeeper.exists(waitNode, false) == null) {
						logger.info("子节点中，排在我前面的"+waitNode+"已失踪，幸福来得太突然？");
						return checkMinPath();
					} else { //观察前一个节点
						zooKeeper.getData(waitNode, true, new Stat());
					}
				} catch (KeeperException e) {
					logger.error(e.getMessage(), e);
					throw e;
				} catch (InterruptedException e) {
					logger.error(e.getMessage(), e);
					throw e;
				}
			}
		}
		return isMin;
	}

	public void unlock() {
		try {
			zooKeeper.delete(myNode, -1);
		} catch (InterruptedException e) {
			logger.error(e.getMessage(), e);
		} catch (KeeperException e) {
			logger.error(e.getMessage(), e);
		} finally {
			try {
				zooKeeper.close();
			} catch (InterruptedException e) {
				logger.error(e.getMessage(), e);
			}
		}
	}
	
	public void getLockSuccess() {
		logger.info("getLockSuccess, do something");
	}

	@Override
	public void process(WatchedEvent event) {
		if(event == null) {
			return;
		}
		
		Event.EventType eventType = event.getType();
		Event.KeeperState keeperState = event.getState();
		if(Event.KeeperState.SyncConnected == keeperState) {
			if(Event.EventType.None == eventType) {
				logger.info("成功连上zk服务器");
				connectedSemaphore.countDown();
			} else if(event.getType() == Event.EventType.NodeDeleted
					&& event.getPath().equals(waitNode)) {
				logger.info("子节点中，排在我前面的"+waitNode+"已挂，我是不是可以出山了？");
				try {
					if(checkMinPath()) {
						getLockSuccess();
					}
				} catch (KeeperException e) {
					logger.error(e.getMessage(), e);
				} catch (InterruptedException e) {
					logger.error(e.getMessage(), e);
				}
			}
		} else if(Event.KeeperState.Disconnected == keeperState) {
			logger.info("与zk服务器断开连接");
		} else if(Event.KeeperState.AuthFailed == keeperState) {
			logger.info("连zk服务器权限检查失败");
		} else if(Event.KeeperState.Expired == keeperState) {
			logger.info("与zk服务器的连接会话失效");
		}
	}

}
