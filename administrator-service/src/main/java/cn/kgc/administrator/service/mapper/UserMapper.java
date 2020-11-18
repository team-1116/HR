package cn.kgc.administrator.service.mapper;

import cn.kgc.personnel.common.pojo.User;

public interface UserMapper {

    /*
        根据用户名查询用户
     */
    User getUserByUserName(String userName);
}
