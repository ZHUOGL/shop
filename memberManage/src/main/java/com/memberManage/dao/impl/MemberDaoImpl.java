package com.memberManage.dao.impl;

import com.memberManage.dao.BaseDao;
import com.memberManage.dao.MemberDao;
import com.memberManage.entity.Member;

import java.util.List;

public class MemberDaoImpl extends BaseDao implements MemberDao {

    @Override
    public Member queryByLoginname(String loginname) {
        String sql = "SELECT * FROM member WHERE loginname=?";
        return queryForOne(Member.class, sql, loginname);
    }

    @Override
    public List<Member> queryAllMember() {
        String sql = "SELECT * FROM member WHERE type=?";
        return queryForList(Member.class, sql, 1);
    }

    @Override
    public int addMember(Member member) {
        String sql = "INSERT INTO member(send,receive,title,info,sendtime,status)values(?,?,?,?,?,?);";
        return update(sql, member.getLoginname(), member.getPwd(), member.getType(), member.getNickname());
    }

    @Override
    public int delMember(String loginname) {
        String sql = "DELETE FROM member WHERE loginname=?";
        return update(sql, loginname);
    }

    @Override
    public int updateInfo(Member member) {
        String sql = "UPDATE member SET loginname=?, pwd=?, nickname=? WHERE loginname=?";
        return update(sql, member.getLoginname(), member.getPwd(), member.getNickname(), member.getLoginname());
    }
}
