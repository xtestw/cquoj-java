package com.cquoj.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by xuwei on 5/4/16.
 */
@Entity
@Table(name = "replay_status", schema = "", catalog = "cquoj")
public class ReplayStatus {
    private int runid;
    private int pid;
    private String result;
    private Timestamp timeSubmit;
    private int contestBelong;
    private String username;

    @Id
    @Column(name = "runid")
    public int getRunid() {
        return runid;
    }

    public void setRunid(int runid) {
        this.runid = runid;
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
    @Column(name = "result")
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Basic
    @Column(name = "time_submit")
    public Timestamp getTimeSubmit() {
        return timeSubmit;
    }

    public void setTimeSubmit(Timestamp timeSubmit) {
        this.timeSubmit = timeSubmit;
    }

    @Basic
    @Column(name = "contest_belong")
    public int getContestBelong() {
        return contestBelong;
    }

    public void setContestBelong(int contestBelong) {
        this.contestBelong = contestBelong;
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

        ReplayStatus that = (ReplayStatus) o;

        if (runid != that.runid) return false;
        if (pid != that.pid) return false;
        if (contestBelong != that.contestBelong) return false;
        if (result != null ? !result.equals(that.result) : that.result != null) return false;
        if (timeSubmit != null ? !timeSubmit.equals(that.timeSubmit) : that.timeSubmit != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result1 = runid;
        result1 = 31 * result1 + pid;
        result1 = 31 * result1 + (result != null ? result.hashCode() : 0);
        result1 = 31 * result1 + (timeSubmit != null ? timeSubmit.hashCode() : 0);
        result1 = 31 * result1 + contestBelong;
        result1 = 31 * result1 + (username != null ? username.hashCode() : 0);
        return result1;
    }
}
