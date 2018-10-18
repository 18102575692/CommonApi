package com.xsj.controller;

import com.xsj.controller.form.UserForm;
import com.xsj.entity.User;
import com.xsj.service.UserService;
import com.xsj.util.Tools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
    @RequestMapping("/addUser")
    public Map<String,Object> addUser(@Validated UserForm form){
        User user=Tools.convertBean(form,new User());
        System.out.println(user.toString());
        return null;
    }

}
