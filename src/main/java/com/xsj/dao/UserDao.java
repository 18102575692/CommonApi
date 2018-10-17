package com.xsj.dao;

import com.xsj.dao.mapper.UserMapper;
import com.xsj.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户管理
 */
@Service
public class UserDao {
    @Autowired
    UserMapper userMapper;
    /*增加用户*/
    public int addUser(User user){
        return this.userMapper.addUser(user);
    }

}
