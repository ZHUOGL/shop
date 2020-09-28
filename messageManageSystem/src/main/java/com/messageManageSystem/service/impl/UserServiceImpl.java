package com.messageManageSystem.service.impl;

import com.messageManageSystem.dao.UserDao;
import com.messageManageSystem.dao.impl.UserDaoImpl;
import com.messageManageSystem.entity.User;
import com.messageManageSystem.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDaoImpl();

    @Override
    public User queryByLoginname(String loginname) {
        return userDao.queryByLoginname(loginname);
    }

    @Override
    public List<User> queryAllMember() {
        return null;
    }

    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public int delUser(String loginname) {
        return 0;
    }

    @Override
    public int updateInfo(User member) {
        return 0;
    }
}
