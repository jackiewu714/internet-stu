//数据字典类，根据数据库配置生成。author:steven
package com.cw.stu.internet.tech.web.common;

/**
 * 数据字典类
  * @ClassName: DictConstant
  * @Description: 数据字典类
  * @author WuLiangzhi
  * @date May 12, 2014 2:08:43 PM
  *
 */
public class DictConstant {
    
    public static class STATUS {
	/* 有效 */
	public static final String VALID = "S0A";

	/* 无效 */
	public static final String INVALID = "S0X";
    }
    
    /**
     * 申诉工单状态
      * @ClassName: APPEAL_STATUS
      * @Description: 申诉工单状态
      * @author WuLiangzhi
      * @date May 8, 2014 11:42:23 AM
      *
     */
    public static class APPEAL_STATUS {
	/* 待处理 */
	public static final String WAIT_FOR_DEAL = "S0A";

	/* 已处理 */
	public static final String DONE = "S0D";
	
	/* 已删除 */
	public static final String DELETE = "S0X";
    }
    
    /**
     * 申诉工单类型(1 - 用户申诉  2 - 工商所转办  3 - 特殊情况记录)
      * @ClassName: APPEAL_TYPE
      * @Description: 申诉工单类型(1 - 用户申诉  2 - 工商所转办  3 - 特殊情况记录)
      * @author WuLiangzhi
      * @date May 8, 2014 2:30:53 PM
      *
     */
    public static class APPEAL_TYPE {
	/* 用户申诉 */
	public static final int YHSS = 1;

	/* 工商所转办 */
	public static final int GSSZB = 2;
	
	/* 特殊情况记录 */
	public static final int TSQKJL = 3;
    }
    
    /**
     * 日志类型：login - 登录日志  train - 培训日志
      * @ClassName: LOG_TYPE
      * @Description: 日志类型：login - 登录日志  train - 培训日志
      * @author WuLiangzhi
      * @date May 9, 2014 12:21:24 PM
      *
     */
    public static class LOG_TYPE {
	/* 登录日志   */
	public static final String LOGIN = "login";

	/* 培训日志  */
	public static final String TRAIN = "train";
    }
    
    /**
     * 验证码类型
      * @ClassName: VALIDATE_CODE_TYPE
      * @Description: 验证码类型
      * @author WuLiangzhi
      * @date May 12, 2014 12:33:46 PM
      *
     */
    public static class VALIDATE_CODE_TYPE{
	/* 申诉 */
	public static final String APPEAL = "APPEAL";
	
	/* 登录 */
	public static final String LOGIN = "LOGIN";
    }
}