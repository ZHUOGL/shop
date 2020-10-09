package com.shop.dao;

import com.shop.bean.User;

public interface UserDao {

    public User queryUserByUsername(String username);

    public User queryUserByUserNameAndPassword(User user);

    public int saveUser(User user);

    public boolean loginnameExist(String loginname);
}

