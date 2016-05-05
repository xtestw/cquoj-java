package com.cquoj.model;

import javax.persistence.*;

/**
 * Created by xuwei on 5/4/16.
 */
@Entity
@Table(name = "contest_clarify", schema = "", catalog = "cquoj")
public class ContestClarify {
    private int ccid;
    private int cid;
    private String question;
    private String reply;
    private String username;
    private byte ispublic;

    @Id
    @Column(name = "ccid")
    public int getCcid() {
        return ccid;
    }

    public void setCcid(int ccid) {
        this.ccid = ccid;
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
    @Column(name = "question")
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Basic
    @Column(name = "reply")
    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
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
    @Column(name = "ispublic")
    public byte getIspublic() {
        return ispublic;
    }

    public void setIspublic(byte ispublic) {
        this.ispublic = ispublic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContestClarify that = (ContestClarify) o;

        if (ccid != that.ccid) return false;
        if (cid != that.cid) return false;
        if (ispublic != that.ispublic) return false;
        if (question != null ? !question.equals(that.question) : that.question != null) return false;
        if (reply != null ? !reply.equals(that.reply) : that.reply != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ccid;
        result = 31 * result + cid;
        result = 31 * result + (question != null ? question.hashCode() : 0);
        result = 31 * result + (reply != null ? reply.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (int) ispublic;
        return result;
    }
}
