package com.cquoj.model;

import javax.persistence.*;

/**
 * Created by xuwei on 5/4/16.
 */
@Entity
@Table(name = "contest_user", schema = "", catalog = "cquoj")
public class ContestUser {
    private int cuid;
    private int cid;
    private String username;

    @Id
    @Column(name = "cuid")
    public int getCuid() {
        return cuid;
    }

    public void setCuid(int cuid) {
        this.cuid = cuid;
    }

    @Basic
    @Column(name = "cid")
    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContestUser that = (ContestUser) o;

        if (cuid != that.cuid) return false;
        if (cid != that.cid) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cuid;
        result = 31 * result + cid;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        return result;
    }
}
