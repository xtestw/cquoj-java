package com.cquoj.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * Created by xuwei on 5/4/16.
 */
@Entity
@Table(name = "time_bbs", schema = "", catalog = "cquoj")
public class TimeBbs {
    private int rid;
    private Timestamp time;
    private int pid;

    @Basic
    @Column(name = "rid")
    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    @Basic
    @Column(name = "time")
    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Basic
    @Column(name = "pid")
    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TimeBbs timeBbs = (TimeBbs) o;

        if (rid != timeBbs.rid) return false;
        if (pid != timeBbs.pid) return false;
        if (time != null ? !time.equals(timeBbs.time) : timeBbs.time != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rid;
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + pid;
        return result;
    }
}
