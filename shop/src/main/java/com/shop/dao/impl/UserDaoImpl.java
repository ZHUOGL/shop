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
    public User queryUserByUserNameAndPassword(User user) {
        String sql = "SELECT * FROM T_user  WHERE  username =?AND password=?";
        return queryForOne(User.class, sql, user.getUsername(), user.getPassword());
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
}
