package com.cw.web.business.sysmgr.staff.service;

import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.session.RowBounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.cw.common.dao.domain.sm.Staff;
import com.cw.common.dao.domain.sm.StaffCriteria;
import com.cw.common.dao.persistence.sm.StaffMapper;
import com.cw.platform.util.DateUtils;
import com.cw.platform.util.Result;
import com.cw.web.business.sysmgr.staff.domain.StaffExtend;
import com.cw.web.business.sysmgr.staff.persistence.StaffMgrMapper;
import com.cw.web.common.DictConstant;

/**
 * 工号管理service
  * @ClassName: StaffMgrService
  * @Description: 工号管理service
  * @author WuLiangzhi
  * @date May 7, 2014 12:43:24 PM
  *
 */
public class StaffMgrService {
    
    /**
     * log printer
     */
    private static final Logger logger = LoggerFactory.getLogger(StaffMgrService.class);

    @Autowired
    private StaffMapper staffMapper;
    
    @Autowired
    private StaffMgrMapper staffMgrMapper;

    /**
     * 根据登录用户名查询工号信息
      * @Title: getStaffByStaffName
      * @Description: 根据登录用户名查询工号信息
      * @param staffName
      * @return	Result
     */
    public Result getStaffByStaffName(String staffName) {
	Result result = new Result();
	result.setSuccess(true);
	StaffCriteria criteria = new StaffCriteria();
	criteria.setStaffName(staffName);
	RowBounds rowbounds = new RowBounds(0, 1);
	List<Staff> list = staffMapper.selectByExample(criteria, rowbounds);
	if (CollectionUtils.isEmpty(list)) {
	    result.setSuccess(false);
	    result.setMessage("帐号不存在，请联系管理员。");
	    return result;
	}
	Staff staff = list.get(0);
	if (StringUtils.isEmpty(staff.getStatus()) || !DictConstant.STATUS.VALID.equals(staff.getStatus())) {
	    result.setSuccess(false);
	    result.setMessage("帐号无效，请联系管理员。");
	    return result;
	}
	if (staff.getEffStartdate() != null && DateUtils.compare(staff.getEffStartdate(), new Date()) < 0) {
	    result.setSuccess(false);
	    result.setMessage("帐号未生效，请联系管理员。");
	    return result;
	}
	if (staff.getEffStartdate() != null && DateUtils.compare(staff.getEffEnddate(), new Date()) < 0) {
	    result.setSuccess(false);
	    result.setMessage("帐号已失效，请联系管理员。");
	    return result;
	}
	result.setResult(staff);
	return result;
    }

    /**
     * 更新末次登录时间和IP
      * @Title: updateLastLoginTimeAndIp
      * @Description: 更新末次登录时间和IP
      * @param staffId		登录工号
      * @param lastLoginip	ip地址
     */
    public void updateLastLoginTimeAndIp(Integer staffId, String lastLoginip) {
	Staff staff = new Staff();
	staff.setStaffId(staffId);
	staff.setLastLogintime(new Date());
	staff.setLastLoginip(lastLoginip);
	int updateRet = staffMapper.updateByPrimaryKeySelective(staff);
	logger.info("StaffMgrService->updateLastLoginTimeAndIp, updateRet=" + updateRet);
    }

    /**
     * 查询后台管理员信息列表
      * @Title: getStaffExtendList
      * @Description: 查询后台管理员信息列表
      * @param staffCriteria	StaffCriteria
      * @param rowbounds	RowBounds
      * @return	List<StaffExtend>
     */
    public List<StaffExtend> getStaffExtendList(StaffCriteria staffCriteria, RowBounds rowbounds){
	return staffMgrMapper.getStaffExtendList(staffCriteria, rowbounds);
    }
    
}
