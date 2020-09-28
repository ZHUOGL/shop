package com.memberManage.service.Impl;

import com.memberManage.dao.MemberDao;
import com.memberManage.dao.impl.MemberDaoImpl;
import com.memberManage.entity.Member;
import com.memberManage.service.MemberService;

import java.util.List;

public class MemberServiceImpl implements MemberService {
    MemberDao memberDao = new MemberDaoImpl();

    @Override
    public Member queryByLoginname(String loginname) {
        return memberDao.queryByLoginname(loginname);
    }

    @Override
    public List<Member> queryAllMember() {
        return memberDao.queryAllMember();
    }

    @Override
    public int addMember(Member member) {
        return memberDao.addMember(member);
    }

    @Override
    public int delMember(String loginname) {
        return memberDao.delMember(loginname);
    }

    @Override
    public int updateInfo(Member member) {
        return memberDao.updateInfo(member);
    }
}
