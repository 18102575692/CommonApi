package com.xsj.controller;

import com.alibaba.fastjson.JSONObject;
import com.xsj.controller.form.UserForm;
import com.xsj.dao.mapper.UserMapper;
import com.xsj.entity.User;
import com.xsj.service.UserService;
import com.xsj.util.BeanConvertor;
import com.xsj.util.Tools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: xieshaojun
 * @Date: 2018-10-17 20:31
 * @Version 1.0
 */
@RestController
@RequestMapping(value = "/user",method = RequestMethod.POST)
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    UserMapper mapper;
    @RequestMapping("/addUser")
    public Map<String,Object> addUser(@Validated UserForm form){
        /*Map<String,Object> map=BeanConvertor.object2Map(form);*/
        Map<String,Object> map=new HashMap<>();
        Example example=new Example(User.class);
        example.createCriteria().andEqualTo("user_id","01");
        this.mapper.selectByExample(example);
        map.put(">>", this.mapper.selectByExample(example));
        return map;
    }

}
