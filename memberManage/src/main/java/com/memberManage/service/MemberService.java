package com.memberManage.service;

import com.memberManage.entity.Member;

import java.util.List;

public interface MemberService {

    Member queryByLoginname(String loginname);

    List<Member> queryAllMember();

    int addMember(Member member);

    int delMember(String loginname);

    int updateInfo(Member member);

}
