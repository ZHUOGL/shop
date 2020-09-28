package com.messageManageSystem.service;

import com.messageManageSystem.entity.Message;

import java.util.List;

public interface MessageService {
    int addMessage(Message message);

    int delMessage(Message message);

    List<Message> showMessage(String receive);

    Message queryOneMessage(Message message);
}
