package com.shop.dao;

import com.shop.bean.User;

public interface UserDao {

    public User queryUserByUsername(String username);

    public User queryUserByUserNameAndPassword(String username, String password);

    public int saveUser(User user);

    public boolean loginnameExist(String loginname);

    public boolean login(String loginname, String password);
}

