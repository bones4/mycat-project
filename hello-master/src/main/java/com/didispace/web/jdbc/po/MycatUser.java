package com.didispace.web.jdbc.po;

public class MycatUser {
    private Integer id;

    private String userName;

    private String passWord;

    private Integer lastPaperid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord == null ? null : passWord.trim();
    }

    public Integer getLastPaperid() {
        return lastPaperid;
    }

    public void setLastPaperid(Integer lastPaperid) {
        this.lastPaperid = lastPaperid;
    }
}