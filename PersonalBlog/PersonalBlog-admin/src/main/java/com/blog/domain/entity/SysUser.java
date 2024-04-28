package com.blog.domain.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 *  用户实体类
 * </p>
 *
 * @author 2597378587@qq.com 2024/4/27 18:55
 * @version V1.0
 */
public class SysUser implements Serializable {

//    用户ID号
    private Long userId;
//    用户姓名
    private String userName;
//    用户密码
    private transient String password;
//    用户邮箱
    private String email;
//    用户手机号
    private String phoneNumber;
//    用户性别
    private String sex;
//    最后一次登入IP
    private String loginIp;
//    最后一次登入时间
    private Date loginDate;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }
}
