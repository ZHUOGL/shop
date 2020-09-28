package com.messageManageSystem.service.impl;

import com.messageManageSystem.dao.MessageDao;
import com.messageManageSystem.dao.impl.MessageDaoImpl;
import com.messageManageSystem.entity.Message;
import com.messageManageSystem.service.MessageService;

import java.util.List;

public class MessageServiceImpl implements MessageService {
    MessageDao messageDao = new MessageDaoImpl();

    @Override
    public int addMessage(Message message) {
        return messageDao.addMessage(message);
    }

    @Override
    public int delMessage(Message message) {
        return messageDao.delMessage(message);
    }

    @Override
    public List<Message> showMessage(String receive) {
        return messageDao.showMessage(receive);
    }

    @Override
    public Message queryOneMessage(Message message) {
        return messageDao.queryOneMessage(message);
    }
}
