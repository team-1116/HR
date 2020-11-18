package cn.kgc.administrator.service.controller;

import cn.kgc.administrator.service.service.UserService;
import cn.kgc.personnel.common.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: personnel
 * @ClassName UserController
 * @description:
 * @author: 熊盛涛
 * @create: 2020-11-18 10:57
 * @Version 1.0
 **/
@RestController
public class UserController {
    @Autowired
    private UserService userService;


        /*
            根据用户名查询用户
         */
    @GetMapping(value = "/user/{userName}")
    public User getUser(@PathVariable("userName") String userName){
        User user=userService.getUser(userName);
        return user;
    }


}
