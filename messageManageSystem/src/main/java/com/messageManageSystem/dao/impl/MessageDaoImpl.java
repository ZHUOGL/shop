package com.messageManageSystem.dao.impl;

import com.messageManageSystem.dao.BaseDao;
import com.messageManageSystem.dao.MessageDao;
import com.messageManageSystem.entity.Message;

import java.util.List;

public class MessageDaoImpl extends BaseDao implements MessageDao {
    @Override
    public int addMessage(Message message) {
        String sql = "INSERT INTO message(send,receive,title,info,sendTime,status)values(?,?,?,?,?,?);";
        return update(sql, message.getSend(), message.getReceive(), message.getTitle(), message.getInfo(), message.getSendTime(), message.getStatus());
    }

    @Override
    public int delMessage(Message message) {
        String sql = "DELETE FROM message WHERE send=? AND receive=? AND title=? AND info=? AND sendTime=?";
        return update(sql, message.getSend(), message.getReceive(), message.getTitle(), message.getInfo(), message.getSendTime());
    }

    @Override
    public List<Message> showMessage(String receive) {
        String sql = "SELECT * FROM message WHERE receive =?";
        return queryForList(Message.class, sql, receive);
    }

    @Override
    public Message queryOneMessage(Message message) {
        String sql = "SELECT * FROM message WHERE send=? AND receive=? AND title=? AND info=? AND sendTime=?";
        return queryForOne(Message.class, sql, message.getSend(), message.getReceive(), message.getTitle(), message.getInfo(), message.getSendTime());
    }
}
