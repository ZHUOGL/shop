package com.messageManageSystem.dao.impl;

import com.memberManage.entity.Member;
import com.messageManageSystem.dao.BaseDao;
import com.messageManageSystem.dao.UserDao;
import com.messageManageSystem.entity.User;

import java.util.List;

public class UserDaoImpl extends BaseDao implements UserDao {
    @Override
    public User queryByLoginname(String loginname) {
        String sql = "SELECT * FROM user WHERE loginname=?";
        return queryForOne(User.class, sql, loginname);
    }

    @Override
    public List<User> queryAllMember() {
        return null;
    }

    @Override
    public int addUser(User user) {
        String sql = "INSERT INTO user(loginname,loginpwd,status,email)values(?,?,?,?);";
        return update(sql, user.getLoginname(), user.getLoginpwd(), user.getStatus(), user.getEmail());
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
