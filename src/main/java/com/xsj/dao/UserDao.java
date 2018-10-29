package com.xsj.dao;

import com.xsj.dao.mapper.UserMapper;
import com.xsj.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

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
    /*获取用户列表*/
    public List<User> getUserList(String id){
        Example example=new Example(User.class);
        example.createCriteria().andGreaterThan("id",id);
        return this.userMapper.selectByExample(example);
    }

}
