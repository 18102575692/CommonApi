package com.xsj.controller.form;

/**
 * @Author: xieshaojun
 * @Date: 2018-10-18 21:10
 * @Version 1.0
 */
public class UserForm {
    private String username;
    private String password;
    private Integer user_type;
    private String phone;

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
        return "UserForm{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", user_type=" + user_type +
                ", phone='" + phone + '\'' +
                '}';
    }
}
