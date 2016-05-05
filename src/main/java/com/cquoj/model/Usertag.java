package com.cquoj.model;

import javax.persistence.*;

/**
 * Created by xuwei on 5/4/16.
 */

@Table(name="usertag")
@Entity
public class Usertag {
    private int id;
    private int pid;
    private String username;
    private int catid;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "pid")
    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
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
    @Column(name = "catid")
    public int getCatid() {
        return catid;
    }

    public void setCatid(int catid) {
        this.catid = catid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Usertag usertag = (Usertag) o;

        if (id != usertag.id) return false;
        if (pid != usertag.pid) return false;
        if (catid != usertag.catid) return false;
        if (username != null ? !username.equals(usertag.username) : usertag.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + pid;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + catid;
        return result;
    }
}
