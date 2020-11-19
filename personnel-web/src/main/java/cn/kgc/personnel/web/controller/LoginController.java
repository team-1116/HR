package cn.kgc.personnel.web.controller;

import cn.kgc.personnel.common.pojo.Employees;
import cn.kgc.personnel.common.pojo.User;
import cn.kgc.personnel.web.service.EmployeesService;
import cn.kgc.personnel.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
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
    @Autowired
    private EmployeesService employeesService;

    @RequestMapping("/goLogin")
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
            System.out.println("用户id:"+user.getEmplpyeesId());
            Integer id=user.getEmplpyeesId();
            //登录成功 传入个人基本信息到session
            Employees employees=employeesService.getEmployees(id);
            session.setAttribute("employees",employees);
            return "ok";
        }
    }


    @RequestMapping("/goindex")
    public String goindex(){
        return "index";
    }
}
