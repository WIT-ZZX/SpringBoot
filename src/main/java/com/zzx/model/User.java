package com.zzx.model;





import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 用户实体类
 * Created by Administrator on 2019/10/24.
 */
@Table(name = "user")
@Entity
public class User implements Serializable{
    private static final long serialVersionUID = -296030161645082403L;

    @Id
    private String userName;
    @Column(nullable = false)
    private String userPwd;
    @Column(nullable = false)
    private String role;
    @Column(nullable = false)
    private Long createTime;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", role='" + role + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
