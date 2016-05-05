package com.cquoj.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by xuwei on 5/4/16.
 */

@Table(name="status")
@Entity
public class Status {
    private int runid;
    private int pid;
    private String result;
    private Integer memoryUsed;
    private Integer timeUsed;
    private Timestamp timeSubmit;
    private int contestBelong;
    private String username;
    private String source;
    private int language;
    private String ceInfo;
    private String ipaddr;
    private byte isshared;
    private short jnum;

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
    @Column(name = "memory_used")
    public Integer getMemoryUsed() {
        return memoryUsed;
    }

    public void setMemoryUsed(Integer memoryUsed) {
        this.memoryUsed = memoryUsed;
    }

    @Basic
    @Column(name = "time_used")
    public Integer getTimeUsed() {
        return timeUsed;
    }

    public void setTimeUsed(Integer timeUsed) {
        this.timeUsed = timeUsed;
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

    @Basic
    @Column(name = "source")
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Basic
    @Column(name = "language")
    public int getLanguage() {
        return language;
    }

    public void setLanguage(int language) {
        this.language = language;
    }

    @Basic
    @Column(name = "ce_info")
    public String getCeInfo() {
        return ceInfo;
    }

    public void setCeInfo(String ceInfo) {
        this.ceInfo = ceInfo;
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
    @Column(name = "isshared")
    public byte getIsshared() {
        return isshared;
    }

    public void setIsshared(byte isshared) {
        this.isshared = isshared;
    }

    @Basic
    @Column(name = "jnum")
    public short getJnum() {
        return jnum;
    }

    public void setJnum(short jnum) {
        this.jnum = jnum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Status status = (Status) o;

        if (runid != status.runid) return false;
        if (pid != status.pid) return false;
        if (contestBelong != status.contestBelong) return false;
        if (language != status.language) return false;
        if (isshared != status.isshared) return false;
        if (jnum != status.jnum) return false;
        if (result != null ? !result.equals(status.result) : status.result != null) return false;
        if (memoryUsed != null ? !memoryUsed.equals(status.memoryUsed) : status.memoryUsed != null) return false;
        if (timeUsed != null ? !timeUsed.equals(status.timeUsed) : status.timeUsed != null) return false;
        if (timeSubmit != null ? !timeSubmit.equals(status.timeSubmit) : status.timeSubmit != null) return false;
        if (username != null ? !username.equals(status.username) : status.username != null) return false;
        if (source != null ? !source.equals(status.source) : status.source != null) return false;
        if (ceInfo != null ? !ceInfo.equals(status.ceInfo) : status.ceInfo != null) return false;
        if (ipaddr != null ? !ipaddr.equals(status.ipaddr) : status.ipaddr != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result1 = runid;
        result1 = 31 * result1 + pid;
        result1 = 31 * result1 + (result != null ? result.hashCode() : 0);
        result1 = 31 * result1 + (memoryUsed != null ? memoryUsed.hashCode() : 0);
        result1 = 31 * result1 + (timeUsed != null ? timeUsed.hashCode() : 0);
        result1 = 31 * result1 + (timeSubmit != null ? timeSubmit.hashCode() : 0);
        result1 = 31 * result1 + contestBelong;
        result1 = 31 * result1 + (username != null ? username.hashCode() : 0);
        result1 = 31 * result1 + (source != null ? source.hashCode() : 0);
        result1 = 31 * result1 + language;
        result1 = 31 * result1 + (ceInfo != null ? ceInfo.hashCode() : 0);
        result1 = 31 * result1 + (ipaddr != null ? ipaddr.hashCode() : 0);
        result1 = 31 * result1 + (int) isshared;
        result1 = 31 * result1 + (int) jnum;
        return result1;
    }
}
