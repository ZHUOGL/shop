package com.shop.test;

import com.shop.bean.User;
import com.shop.dao.UserDao;
import com.shop.dao.impl.UserDaoImpl;
import com.shop.service.Impl.UserServiceImpl;
import com.shop.service.UserService;
import org.junit.Test;

public class UserDaoTest {
    UserDao userDao = new UserDaoImpl();
    UserService userService = new UserServiceImpl();

    @Test
    public void testServiceLogin() {
        User user = new User("test", "test", "0");
        System.out.println(userService.login(user));
    }

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
        User user = new User();
        user.setUsername("admin");
        user.setPassword("123456");
        if (userDao.queryUserByUserNameAndPassword(user) == null) {
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
    public void testLogin() {
        User user = new User("test", "test", "@qq.com");
        System.out.println(userDao.queryUserByUserNameAndPassword(user));
    }

    @Test
    public void testExist() {
        System.out.println(userDao.loginnameExist("1"));
    }
}
