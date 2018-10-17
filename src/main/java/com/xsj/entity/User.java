package com.xsj.entity;

import java.io.Serializable;

/**
 * @Author: xieshaojun
 * @Date: 2018-10-17 20:36
 * @Version 1.0
 */
public class User implements Serializable {
    private static final long serialVersionUID = -4427388614551984622L;
    private String user_id;
    private String username;
    private String password;
    private Integer user_type;
    private String phone;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
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

    public Integer getUser_type() {
        return user_type;
    }

    public void setUser_type(Integer user_type) {
        this.user_type = user_type;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id='" + user_id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", user_type=" + user_type +
                ", phone='" + phone + '\'' +
                '}';
    }
}
