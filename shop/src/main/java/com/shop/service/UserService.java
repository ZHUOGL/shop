package com.shop.service;

import com.shop.bean.User;

public interface UserService {
    public User queryUserByUsername(String username);

    public User login(User user);

    public int saveUser(User user);

    public boolean loginnameExist(String loginname);
}
