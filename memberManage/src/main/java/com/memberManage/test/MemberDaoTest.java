package com.memberManage.test;

import com.memberManage.dao.MemberDao;
import com.memberManage.dao.impl.MemberDaoImpl;
import com.memberManage.entity.Member;
import org.junit.Test;

public class MemberDaoTest {
    MemberDao memberDao = new MemberDaoImpl();

    @Test
    public void testQueryByLoginname() {
        System.out.println(memberDao.queryByLoginname("admin"));
    }

    @Test
    public void testQueryAllMember() {
        System.out.println(memberDao.queryAllMember());
    }

    @Test
    public void testAddMember() {
        Member member = new Member("测试", "测试", 1, "测试");
        int result = memberDao.addMember(member);
        System.out.println(result);
    }

    @Test
    public void testDelMember() {
        int result = memberDao.delMember("测试");
        System.out.println(result);
    }

    @Test
    public void testUpdateInfo() {
        Member member = memberDao.queryByLoginname("caocao");
        member.setNickname("曹贼");
        int result = memberDao.updateInfo(member);
        System.out.println(result);
    }
}
