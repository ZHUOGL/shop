package com.messageManageSystem.test;

import com.messageManageSystem.dao.MessageDao;
import com.messageManageSystem.dao.impl.MessageDaoImpl;
import com.messageManageSystem.entity.Message;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class MessageImplTest {
    MessageDao messageDao = new MessageDaoImpl();

    @Test
    public void testAddMessage() {
        Message message = new Message("1", "2", "标题", "内容", new Date(), 0);
        int result = messageDao.addMessage(message);
        System.out.println(result);
    }

    @Test
    public void testDelMessage() {
//        Date date=new Date();
//        java.sql.Date date1=new java.sql.Date(date.getTime());
        Message message = new Message("1", "2", "标题", "内容", new java.sql.Date(new Date().getTime()), 0);
        System.out.println(message);
        int result = messageDao.delMessage(message);
        System.out.println(result);
    }

    @Test
    public void testShowMessage() {
        String receive = "2";
        List<Message> list = messageDao.showMessage(receive);
        System.out.println(list);
    }

    @Test
    public void testQueryOneMessage() {
        Message message = new Message("1", "2", "标题", "内容", new java.sql.Date(new Date().getTime()), 0);
        System.out.println(messageDao.queryOneMessage(message));
    }
}
