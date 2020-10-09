package com.shop.bean2;

public class User2 {
    private Integer id;
    private String username;
    private String password;
    private String email;
    private String code;
    private String KAPTCHA_SESSION_KEY;

    public User2() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public User2(String username, String password, String code, String KAPTCHA_SESSION_KEY) {
        this.username = username;
        this.password = password;
        this.code = code;
        this.KAPTCHA_SESSION_KEY = KAPTCHA_SESSION_KEY;
    }

    @Override
    public String toString() {
        return "User2{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", code='" + code + '\'' +
                ", KAPTCHA_SESSION_KEY='" + KAPTCHA_SESSION_KEY + '\'' +
                '}';
    }
}
