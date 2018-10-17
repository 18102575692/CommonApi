package com.xsj.service;

import com.xsj.dao.UserDao;
import com.xsj.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: xieshaojun
 * @Date: 2018-10-17 21:37
 * @Version 1.0
 */
@Service
public class UserService {
    @Autowired
    UserDao userDao;
    /*增加用户*/
    public int addUser(User user){
        return this.userDao.addUser(user);
    }
}
