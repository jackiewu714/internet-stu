/**
 * @Title: Sender.java
 * @Package com.cw.mq.test
 * @Description: 消息发送者
 * Copyright: Copyright (c) 2014 
 * Company:YY Inc
 * 
 * @author WuLiangzhi
 * @date Aug 23, 2015 2:11:46 PM
 * @version V1.0
 */
package com.cw.activemq;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName: Sender
 * @Description: 消息发送者
 * @author WuLiangzhi
 * @date Aug 23, 2015 2:11:46 PM
 * 
 */
public class Sender {

	private static final Logger LOG = LoggerFactory.getLogger(Sender.class);

	private static final int SEND_NUMBER = 5;

	public static void main(String[] args) {
		// ConnectionFactory : 连接工厂， JMS用它创建连接
		ConnectionFactory connectionFactory;
		// Connection : JMS客户端到JMS Provider的连接
		Connection connection = null;
		// Session : 一个发送或者接收消息的线程
		Session session = null;
		// Destination : 消息的目的地；消息发送给谁
		Destination destination;
		// MessageProducer : 消息发送者
		MessageProducer producer = null;

		String brokerURL = "tcp://localhost:61616";
		String queueName = "FirstQueue";
		connectionFactory = new ActiveMQConnectionFactory(
				ActiveMQConnection.DEFAULT_USER,
				ActiveMQConnection.DEFAULT_PASSWORD, brokerURL);

		try {
			// 从构造工厂得到连接对象
			connection = connectionFactory.createConnection();
			// 启动
			connection.start();

			// 获取操作连接
			session = connection.createSession(Boolean.TRUE,
					Session.AUTO_ACKNOWLEDGE);

			// 获取消息目的地对象, 注意参数值xingbo.xu-queue是一个服务器的queue，须在在ActiveMq的console配置
			destination = session.createQueue(queueName);

			// 得到消息生成者(发送者)
			producer = session.createProducer(destination);

			// 设置不持久化，此处学习，实际根据项目而定
			producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);

			sendMessage(session, producer);

			session.commit();
		} catch (JMSException e) {
			LOG.error(e.getMessage(), e);
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
		} finally {

			try {
				if (producer != null) {
					producer.close();
				}
				if (session != null) {
					session.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (JMSException e) {
				LOG.error(e.getMessage(), e);
			}
		}

	}

	public static void sendMessage(Session session, MessageProducer producer)
			throws JMSException {
		for (int i = 0; i < SEND_NUMBER; i++) {
			String text = "ActiveMQ 发送消息 " + (i + 1);
			TextMessage message = session.createTextMessage(text);
			LOG.info("发送消息： {}", text);
			producer.send(message);
		}
	}

}
