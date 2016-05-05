package com.cquoj.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by xuwei on 5/4/16.
 */
@Table(name="user")
@Entity
public class User {
    private int uid;
    private String username;
    private String nickname;
    private String password;
    private String email;
    private String school;
    private int totalSubmit;
    private int totalAc;
    private Timestamp registerTime;
    private Timestamp lastLoginTime;
    private String photo;
    private int totalValue;
    private byte lockStatus;
    private int isroot;
    private String ipaddr;
    private int localAc;

    @Id
    @Column(name = "uid")
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "nickname")
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "school")
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Basic
    @Column(name = "total_submit")
    public int getTotalSubmit() {
        return totalSubmit;
    }

    public void setTotalSubmit(int totalSubmit) {
        this.totalSubmit = totalSubmit;
    }

    @Basic
    @Column(name = "total_ac")
    public int getTotalAc() {
        return totalAc;
    }

    public void setTotalAc(int totalAc) {
        this.totalAc = totalAc;
    }

    @Basic
    @Column(name = "register_time")
    public Timestamp getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Timestamp registerTime) {
        this.registerTime = registerTime;
    }

    @Basic
    @Column(name = "last_login_time")
    public Timestamp getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Timestamp lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    @Basic
    @Column(name = "photo")
    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Basic
    @Column(name = "total_value")
    public int getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(int totalValue) {
        this.totalValue = totalValue;
    }

    @Basic
    @Column(name = "lock_status")
    public byte getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(byte lockStatus) {
        this.lockStatus = lockStatus;
    }

    @Basic
    @Column(name = "isroot")
    public int getIsroot() {
        return isroot;
    }

    public void setIsroot(int isroot) {
        this.isroot = isroot;
    }

    @Basic
    @Column(name = "ipaddr")
    public String getIpaddr() {
        return ipaddr;
    }

    public void setIpaddr(String ipaddr) {
        this.ipaddr = ipaddr;
    }

    @Basic
    @Column(name = "local_ac")
    public int getLocalAc() {
        return localAc;
    }

    public void setLocalAc(int localAc) {
        this.localAc = localAc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (uid != user.uid) return false;
        if (totalSubmit != user.totalSubmit) return false;
        if (totalAc != user.totalAc) return false;
        if (totalValue != user.totalValue) return false;
        if (lockStatus != user.lockStatus) return false;
        if (isroot != user.isroot) return false;
        if (localAc != user.localAc) return false;
        if (username != null ? !username.equals(user.username) : user.username != null) return false;
        if (nickname != null ? !nickname.equals(user.nickname) : user.nickname != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (email != null ? !email.equals(user.email) : user.email != null) return false;
        if (school != null ? !school.equals(user.school) : user.school != null) return false;
        if (registerTime != null ? !registerTime.equals(user.registerTime) : user.registerTime != null) return false;
        if (lastLoginTime != null ? !lastLoginTime.equals(user.lastLoginTime) : user.lastLoginTime != null)
            return false;
        if (photo != null ? !photo.equals(user.photo) : user.photo != null) return false;
        if (ipaddr != null ? !ipaddr.equals(user.ipaddr) : user.ipaddr != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uid;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (nickname != null ? nickname.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (school != null ? school.hashCode() : 0);
        result = 31 * result + totalSubmit;
        result = 31 * result + totalAc;
        result = 31 * result + (registerTime != null ? registerTime.hashCode() : 0);
        result = 31 * result + (lastLoginTime != null ? lastLoginTime.hashCode() : 0);
        result = 31 * result + (photo != null ? photo.hashCode() : 0);
        result = 31 * result + totalValue;
        result = 31 * result + (int) lockStatus;
        result = 31 * result + isroot;
        result = 31 * result + (ipaddr != null ? ipaddr.hashCode() : 0);
        result = 31 * result + localAc;
        return result;
    }
}
