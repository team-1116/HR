package cn.kgc.personnel.common.pojo;

/**
 * @program: personnel
 * @ClassName User
 * @description:
 * @author: 熊盛涛
 * @create: 2020-11-18 09:58
 * @Version 1.0
 **/
/*
    用户表的
 */
public class User {
    /*
        用户主键id
     */
    private Integer UserId;

    /*
        用户登录名
     */
    private String userName;

    /*
        用户登录密码
     */

    private String password;

    /*
        关联员工表id
     */
    private Integer emplpyeesId;

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer userId) {
        UserId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getEmplpyeesId() {
        return emplpyeesId;
    }

    public void setEmplpyeesId(Integer emplpyeesId) {
        this.emplpyeesId = emplpyeesId;
    }
}
