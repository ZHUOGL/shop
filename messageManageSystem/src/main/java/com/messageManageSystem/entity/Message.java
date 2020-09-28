package com.messageManageSystem.entity;

import java.util.Date;

public class Message {
    private Integer id;
    private String send;
    private String receive;
    private String title;
    private String info;
    private Date sendTime;
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSend() {
        return send;
    }

    public void setSend(String send) {
        this.send = send;
    }

    public String getReceive() {
        return receive;
    }

    public void setReceive(String receive) {
        this.receive = receive;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", send='" + send + '\'' +
                ", receive='" + receive + '\'' +
                ", title='" + title + '\'' +
                ", info='" + info + '\'' +
                ", sendTime=" + sendTime +
                ", status=" + status +
                '}';
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Message(String send, String receive, String title, String info, Date sendTime, Integer status) {
        this.send = send;
        this.receive = receive;
        this.title = title;
        this.info = info;
        this.sendTime = sendTime;
        this.status = status;
    }

    public Message() {
    }
}
