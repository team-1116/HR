package cn.kgc.personnel.web.service;


import cn.kgc.personnel.common.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("administrator-service")
public interface UserService {
    /*
        根据用户名查询用户
     */
    @GetMapping(value = "/user/{userName}")
    public User getUser(@PathVariable("userName") String userName);

}
