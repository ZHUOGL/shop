package com.shop.service.Impl;

import com.shop.bean.User;
import com.shop.dao.UserDao;
import com.shop.dao.impl.UserDaoImpl;
import com.shop.service.UserService;

public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDaoImpl();

    @Override
    public User queryUserByUsername(String username) {
        return userDao.queryUserByUsername(username);
    }

    @Override
    public User login(User user) {
        return userDao.queryUserByUserNameAndPassword(user);
    }

    @Override
    public int saveUser(User user) {
        return userDao.saveUser(user);
    }

    @Override
    public boolean loginnameExist(String loginname) {
        return userDao.loginnameExist(loginname);
    }
}
