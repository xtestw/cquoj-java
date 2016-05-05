package com.cquoj.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by xuwei on 5/4/16.
 */
@Table(name="challenge")
@Entity
public class Challenge {
    private int chaId;
    private String username;
    private int runid;
    private int dataType;
    private String dataDetail;
    private int dataLang;
    private String chaResult;
    private String chaDetail;
    private Timestamp chaTime;
    private int cid;

    @Id
    @Column(name = "cha_id")
    public int getChaId() {
        return chaId;
    }

    public void setChaId(int chaId) {
        this.chaId = chaId;
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
    @Column(name = "runid")
    public int getRunid() {
        return runid;
    }

    public void setRunid(int runid) {
        this.runid = runid;
    }

    @Basic
    @Column(name = "data_type")
    public int getDataType() {
        return dataType;
    }

    public void setDataType(int dataType) {
        this.dataType = dataType;
    }

    @Basic
    @Column(name = "data_detail")
    public String getDataDetail() {
        return dataDetail;
    }

    public void setDataDetail(String dataDetail) {
        this.dataDetail = dataDetail;
    }

    @Basic
    @Column(name = "data_lang")
    public int getDataLang() {
        return dataLang;
    }

    public void setDataLang(int dataLang) {
        this.dataLang = dataLang;
    }

    @Basic
    @Column(name = "cha_result")
    public String getChaResult() {
        return chaResult;
    }

    public void setChaResult(String chaResult) {
        this.chaResult = chaResult;
    }

    @Basic
    @Column(name = "cha_detail")
    public String getChaDetail() {
        return chaDetail;
    }

    public void setChaDetail(String chaDetail) {
        this.chaDetail = chaDetail;
    }

    @Basic
    @Column(name = "cha_time")
    public Timestamp getChaTime() {
        return chaTime;
    }

    public void setChaTime(Timestamp chaTime) {
        this.chaTime = chaTime;
    }

    @Basic
    @Column(name = "cid")
    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Challenge challenge = (Challenge) o;

        if (chaId != challenge.chaId) return false;
        if (runid != challenge.runid) return false;
        if (dataType != challenge.dataType) return false;
        if (dataLang != challenge.dataLang) return false;
        if (cid != challenge.cid) return false;
        if (username != null ? !username.equals(challenge.username) : challenge.username != null) return false;
        if (dataDetail != null ? !dataDetail.equals(challenge.dataDetail) : challenge.dataDetail != null) return false;
        if (chaResult != null ? !chaResult.equals(challenge.chaResult) : challenge.chaResult != null) return false;
        if (chaDetail != null ? !chaDetail.equals(challenge.chaDetail) : challenge.chaDetail != null) return false;
        if (chaTime != null ? !chaTime.equals(challenge.chaTime) : challenge.chaTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = chaId;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + runid;
        result = 31 * result + dataType;
        result = 31 * result + (dataDetail != null ? dataDetail.hashCode() : 0);
        result = 31 * result + dataLang;
        result = 31 * result + (chaResult != null ? chaResult.hashCode() : 0);
        result = 31 * result + (chaDetail != null ? chaDetail.hashCode() : 0);
        result = 31 * result + (chaTime != null ? chaTime.hashCode() : 0);
        result = 31 * result + cid;
        return result;
    }
}
