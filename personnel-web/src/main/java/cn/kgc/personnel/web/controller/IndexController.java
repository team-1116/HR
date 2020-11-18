package cn.kgc.personnel.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: personnel
 * @ClassName IndexController
 * @description:
 * @author: 熊盛涛
 * @create: 2020-11-18 22:48
 * @Version 1.0
 **/
@Controller
public class IndexController {

    @RequestMapping("/toindex")
    public String toindex(){
        return "index";
    }

    /*
        页面左侧
     */
    @RequestMapping("/toleft")
    public String toleft(){
        return "left";
    }

    /*
        页面头部
     */
    @RequestMapping("/tohead")
    public String tologin(){
        return "head";
    }

    /*
        右侧主体
     */
    @RequestMapping("/tomain")
    public String tomain(){
        return "main";
    }

}
