/**
 * @Title: LogMgrService.java
 * @Package com.yy.rp.business.log.service
 * @Description: TODO
 * Copyright: Copyright (c) 2014
 * Company:YY
 * @author WuLiangzhi
 * @date May 8, 2014 12:34:48 PM
 * @version V1.0
 */

package com.cw.web.business.log.service;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;

import com.cw.common.dao.domain.sm.SysLog;
import com.cw.common.dao.domain.sm.SysLogCriteria;
import com.cw.common.dao.persistence.sm.SysLogMapper;

/**
 * @ClassName: LogMgrService
 * @Description: TODO
 * @author WuLiangzhi
 * @date May 8, 2014 12:34:48 PM
 *
 */

public class LogMgrService {

    @Autowired
    private SysLogMapper sysLogMapper;

    /**
     * 查询系统日志列表
     * @Title: getSysLogList
     * @Description: 查询系统日志列表
     * @param sysLogCriteria    SysLogCriteria
     * @param rowbounds    RowBounds
     * @return List<SysLogExtend>
     */
    public List<SysLog> getSysLogList(SysLogCriteria sysLogCriteria, RowBounds rowbounds) {
        sysLogCriteria.setOrderByClause(" oper_date desc ");
        return sysLogMapper.selectByExampleWithBLOBs(sysLogCriteria, rowbounds);
    }

    /**
     * 新增日志
     * @Title: saveSysLog
     * @Description: 新增日志
     * @param sysLog    SysLog
     * @return true-成功  false-失败
     */
    public boolean saveSysLog(SysLog sysLog) {
        int insertRet = sysLogMapper.insert(sysLog);
        return insertRet > 0;
    }
}
