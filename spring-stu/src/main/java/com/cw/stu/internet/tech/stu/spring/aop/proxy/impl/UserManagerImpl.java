package com.cw.stu.internet.tech.stu.spring.aop.proxy.impl;

import com.cw.stu.internet.tech.stu.spring.aop.proxy.IUserManager;

/**
 * 用户接口实现类
 * @author WuLiangzhi  2018/09/17 12:47
 */
public class UserManagerImpl implements IUserManager {

    @Override
    public void addUser(String id, String pwd) {
        System.out.println(String.format("调用了 UserManagerImpl.addUser(...) 方法, id=%s, pwd=%s", id, pwd));
    }

    @Override
    public void deleteUser(String id) {
        System.out.println(String.format("调用了 UserManagerImpl.deleteUser(...) 方法, id=%s", id));
    }
}
