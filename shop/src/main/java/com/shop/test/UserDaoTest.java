package com.shop.test;

import com.shop.bean.User;
import com.shop.dao.UserDao;
import com.shop.dao.impl.UserDaoImpl;
import org.junit.Test;

public class UserDaoTest {
    UserDao userDao = new UserDaoImpl();

    @Test
    public void queryUserByUserName() {
        if (userDao.queryUserByUsername("1") == null) {
            System.out.println("用户名可用");
        } else {
            System.out.println("用户名已存在");
        }
    }

    @Test
    public void queryUserByUserNameAndPassword() {
        if (userDao.queryUserByUserNameAndPassword("admin", "123456") == null) {
            System.out.println("账号不存在或者密码错误！");
        } else {
            System.out.println("登录成功！");
        }
    }

    @Test
    public void saveUser() {
        User user = new User("test", "test", "test@qq.com");
        if (userDao.saveUser(user) > 0) {
            System.out.println("注册成功！");
        } else {
            System.out.println("注册失败！");
        }
    }

    @Test
    public void testExist() {
        System.out.println(userDao.loginnameExist("1"));
    }

    @Test
    public void testLogin() {
        String loginname = "admin";
        String password = "1";
        boolean flag = userDao.login(loginname, password);
        System.out.println(flag);
    }
}
