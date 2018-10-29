package com.xsj.dao.mapper;

import com.xsj.entity.User;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface UserMapper extends Mapper<User> {
    /*增加用户*/
    int addUser(User user);
    /*查询用户*/
    List<User> getUser(@Param("user")String user, @Param("map")Map<String,Object> map);
    /*修改用户*/
    int updateUser(User user);
    /*删除用户*/
    int deleteUser(User user);
}
