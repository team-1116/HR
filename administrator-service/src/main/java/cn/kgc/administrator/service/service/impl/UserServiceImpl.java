package cn.kgc.administrator.service.service.impl;

import cn.kgc.administrator.service.mapper.UserMapper;
import cn.kgc.administrator.service.service.UserService;
import cn.kgc.personnel.common.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: personnel
 * @ClassName UserServiceImpl
 * @description:
 * @author: 熊盛涛
 * @create: 2020-11-18 10:54
 * @Version 1.0
 **/
@Service
public class UserServiceImpl implements UserService {
   @Autowired
   private UserMapper userMapper;

    @Override
    public User getUser(String userName) {
        return userMapper.getUserByUserName(userName);
    }
}
