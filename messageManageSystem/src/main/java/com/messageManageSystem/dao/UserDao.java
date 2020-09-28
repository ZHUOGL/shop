package com.messageManageSystem.dao;

import com.messageManageSystem.entity.User;

import java.util.List;

public interface UserDao {
    User queryByLoginname(String loginname);

    List<User> queryAllMember();

    int addUser(User user);

    int delUser(String loginname);

    int updateInfo(User member);
}
