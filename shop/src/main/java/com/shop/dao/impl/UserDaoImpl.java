package com.shop.dao.impl;

import com.shop.bean.User;
import com.shop.dao.BaseDao;
import com.shop.dao.UserDao;

public class UserDaoImpl extends BaseDao implements UserDao {

    @Override
    public User queryUserByUsername(String username) {
        String sql = "SELECT * FROM T_user WHERE username=?";
        return queryForOne(User.class, sql, username);

    }

    @Override
    public User queryUserByUserNameAndPassword(String username, String password) {
        String sql = "SELECT * FROM T_user  WHERE  username =?AND password=?";
        return queryForOne(User.class, sql, username, password);
    }

    @Override
    public int saveUser(User user) {
        String sql = "INSERT INTO T_user(username,password,email)VALUES(?,?,?);";
        return update(sql, user.getUsername(), user.getPassword(), user.getEmail());
    }

    @Override
    public boolean loginnameExist(String loginname) {
        UserDao userDao = new UserDaoImpl();
        User user = userDao.queryUserByUsername(loginname);
        if (user == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean login(String loginname, String password) {
        UserDao userDao = new UserDaoImpl();
        User user = userDao.queryUserByUsername(loginname);
        if (password.equals(user.getPassword())) {
            return true;
        } else {
            return false;
        }
    }
}
