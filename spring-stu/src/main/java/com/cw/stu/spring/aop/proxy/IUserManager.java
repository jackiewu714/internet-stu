package com.cw.stu.spring.aop.proxy;

/**
 * 用户接口
 * @author WuLiangzhi  2018/09/17 12:46
 */
public interface IUserManager {

    /**
     * 添加用户
     * @param id    String  ID号
     * @param pwd   String  密码
     */
    void addUser(String id, String pwd);

    /**
     * 删除用户
     * @param id    String  ID号
     */
    void deleteUser(String id);

}
