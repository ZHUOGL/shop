package com.messageManageSystem.entity;

public class User {
    private Integer id;
    private String loginname;
    private String loginpwd;
    private Integer status;
    private String email;

    public User(String loginname, String loginpwd, Integer status, String email) {
        this.loginname = loginname;
        this.loginpwd = loginpwd;
        this.status = status;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public String getLoginname() {
        return loginname;
    }

    public String getLoginpwd() {
        return loginpwd;
    }

    public Integer getStatus() {
        return status;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public void setLoginpwd(String loginpwd) {
        this.loginpwd = loginpwd;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", loginname='" + loginname + '\'' +
                ", loginpwd='" + loginpwd + '\'' +
                ", status=" + status +
                ", email='" + email + '\'' +
                '}';
    }

    public User() {
    }
}
