package cn.kgc.administrator.service.service;

import cn.kgc.personnel.common.pojo.User;

public interface UserService {

    /*
        根据用户名查询用户
     */
    User getUser(String userName);
}
