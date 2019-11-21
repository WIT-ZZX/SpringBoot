package com.zzx.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2019/11/21.
 */
public class People implements Serializable{
    private static final long serialVersionUID = -8708315755805045733L;
    String name;
    String pwd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
