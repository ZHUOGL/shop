package com.memberManage.entity;

public class Member {
    private Integer id;
    private String loginname;
    private String pwd;
    private Integer type;
    private String nickname;

    public Member() {
    }

    public Member(Integer id, String loginname, String pwd, Integer type, String nickname) {
        this.id = id;
        this.loginname = loginname;
        this.pwd = pwd;
        this.type = type;
        this.nickname = nickname;
    }

    public Member(String loginname, String pwd, Integer type, String nickname) {
        this.loginname = loginname;
        this.pwd = pwd;
        this.type = type;
        this.nickname = nickname;
    }

    public Integer getId() {
        return id;
    }

    public String getLoginname() {
        return loginname;
    }

    public String getPwd() {
        return pwd;
    }

    public Integer getType() {
        return type;
    }

    public String getNickname() {
        return nickname;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "member{" +
                "id=" + id +
                ", loginname='" + loginname + '\'' +
                ", pwd='" + pwd + '\'' +
                ", type=" + type +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
