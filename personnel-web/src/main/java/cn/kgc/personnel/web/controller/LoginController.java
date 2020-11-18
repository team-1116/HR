package cn.kgc.personnel.web.controller;

import cn.kgc.personnel.common.pojo.User;
import cn.kgc.personnel.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @program: personnel
 * @ClassName LoginController
 * @description:
 * @author: 熊盛涛
 * @create: 2020-11-18 12:40
 * @Version 1.0
 **/
@Controller
public class LoginController {
    @Autowired
    private UserService userService;


    @RequestMapping(value = "/toLogin")
    public String tologin(){
        return "login";
    }

    @PostMapping(value = "/login")
    @ResponseBody
    public String login(String userName, String password, HttpServletRequest request){
        HttpSession session = request.getSession();
        User user=userService.getUser(userName);
        //判断用户是否存在
        if (user==null){
            return "no";
        //判断密码是否正确
        }else if (!user.getPassword().equals(password)){
            return "nop";
        }else {
            session.setAttribute("user",user);
            return "ok";
        }
    }

}
