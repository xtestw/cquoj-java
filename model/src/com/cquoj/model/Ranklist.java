package com.cquoj.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by xuwei on 5/4/16.
 */
@Table(name="ranklist")
@Entity
public class Ranklist {
    private int uid;
    private String username;
    private String nickname;
    private int localAc;
    private int totalAc;
    private int totalSubmit;

    @Basic
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
    @Column(name = "local_ac")
    public int getLocalAc() {
        return localAc;
    }

    public void setLocalAc(int localAc) {
        this.localAc = localAc;
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
    @Column(name = "total_submit")
    public int getTotalSubmit() {
        return totalSubmit;
    }

    public void setTotalSubmit(int totalSubmit) {
        this.totalSubmit = totalSubmit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ranklist ranklist = (Ranklist) o;

        if (uid != ranklist.uid) return false;
        if (localAc != ranklist.localAc) return false;
        if (totalAc != ranklist.totalAc) return false;
        if (totalSubmit != ranklist.totalSubmit) return false;
        if (username != null ? !username.equals(ranklist.username) : ranklist.username != null) return false;
        if (nickname != null ? !nickname.equals(ranklist.nickname) : ranklist.nickname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uid;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (nickname != null ? nickname.hashCode() : 0);
        result = 31 * result + localAc;
        result = 31 * result + totalAc;
        result = 31 * result + totalSubmit;
        return result;
    }
}
