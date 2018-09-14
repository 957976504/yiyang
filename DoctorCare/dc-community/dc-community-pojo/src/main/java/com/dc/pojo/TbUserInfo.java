package com.dc.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class TbUserInfo implements Serializable{
    private int uId;
    private String insName;
    private String userSex;
    private Date userBrith;
    private String userAdd;
    private String userTel;

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getInsName() {
        return insName;
    }

    public void setInsName(String insName) {
        this.insName = insName;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public Date getUserBrith() {
        return userBrith;
    }

    public void setUserBrith(Date userBrith) {
        this.userBrith = userBrith;
    }

    public String getUserAdd() {
        return userAdd;
    }

    public void setUserAdd(String userAdd) {
        this.userAdd = userAdd;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    @Override
    public String toString() {
        return "TbUserInfo{" +
                "uId=" + uId +
                ", insName='" + insName + '\'' +
                ", userSex='" + userSex + '\'' +
                ", userBrith=" + userBrith +
                ", userAdd='" + userAdd + '\'' +
                ", userTel='" + userTel + '\'' +
                '}';
    }
}
