/**
 * @Title: StaffMgrMapper.java
 * @Package com.yy.rp.business.sysmgr.staff.mapper
 * @Description: TODO
 * Copyright: Copyright (c) 2014 
 * Company:YY
 * 
 * @author WuLiangzhi
 * @date May 8, 2014 1:13:49 PM
 * @version V1.0
 */

package com.cw.web.business.sysmgr.staff.persistence;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.cw.common.dao.domain.sm.StaffCriteria;
import com.cw.web.business.sysmgr.staff.domain.StaffExtend;


/**
 * @ClassName: StaffMgrMapper
 * @Description: TODO
 * @author WuLiangzhi
 * @date May 8, 2014 1:13:49 PM
 *
 */

public interface StaffMgrMapper {

    /**
     * 查询后台管理员信息列表
      * @Title: getStaffExtendList
      * @Description: 查询后台管理员信息列表
      * @param staffCriteria	StaffCriteria
      * @param rowbounds	RowBounds
      * @return	List<StaffExtend>
     */
    public List<StaffExtend> getStaffExtendList(StaffCriteria staffCriteria, RowBounds rowbounds);
    
}
