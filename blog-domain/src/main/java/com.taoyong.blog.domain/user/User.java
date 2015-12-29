package com.taoyong.blog.domain.user;

import java.io.Serializable;
import java.util.Date;

/**
 * User: taoyong
 * Date: 2015-11-13
 * Time: 15:03:58
 * @table blog_user
 */
public class User implements Serializable {

    private int id;
    private String userAccount;
    private String userPwd;
    private int userType;
    private String created;
    private String modified;

    public void setId(int id) {
        this.id = id;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public int getId() {
        return id;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserAccount() {

        return userAccount;
    }

    public int getUserType() {
        return userType;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userAccount='" + userAccount + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userType=" + userType +
                ", created=" + created +
                ", modified=" + modified +
                '}';
    }
}
