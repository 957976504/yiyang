package com.dc.pojo;

public class TbUser {
    private int uId;
    private int rold;
    private String uName;
    private String pwd;
    private int roCode;

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public int getRold() {
        return rold;
    }

    public void setRold(int rold) {
        this.rold = rold;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getRoCode() {
        return roCode;
    }

    public void setRoCode(int roCode) {
        this.roCode = roCode;
    }

    @Override
    public String toString() {
        return "TbUser{" +
                "uId=" + uId +
                ", rold=" + rold +
                ", uName='" + uName + '\'' +
                ", pwd='" + pwd + '\'' +
                ", roCode=" + roCode +
                '}';
    }
}
