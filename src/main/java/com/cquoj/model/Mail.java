package com.cquoj.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by xuwei on 5/4/16.
 */

@Table(name="mail")
@Entity
public class Mail {
    private int mailid;
    private String sender;
    private String reciever;
    private String title;
    private String content;
    private Timestamp mailTime;
    private byte status;

    @Id
    @Column(name = "mailid")
    public int getMailid() {
        return mailid;
    }

    public void setMailid(int mailid) {
        this.mailid = mailid;
    }

    @Basic
    @Column(name = "sender")
    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    @Basic
    @Column(name = "reciever")
    public String getReciever() {
        return reciever;
    }

    public void setReciever(String reciever) {
        this.reciever = reciever;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "mail_time")
    public Timestamp getMailTime() {
        return mailTime;
    }

    public void setMailTime(Timestamp mailTime) {
        this.mailTime = mailTime;
    }

    @Basic
    @Column(name = "status")
    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Mail mail = (Mail) o;

        if (mailid != mail.mailid) return false;
        if (status != mail.status) return false;
        if (sender != null ? !sender.equals(mail.sender) : mail.sender != null) return false;
        if (reciever != null ? !reciever.equals(mail.reciever) : mail.reciever != null) return false;
        if (title != null ? !title.equals(mail.title) : mail.title != null) return false;
        if (content != null ? !content.equals(mail.content) : mail.content != null) return false;
        if (mailTime != null ? !mailTime.equals(mail.mailTime) : mail.mailTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mailid;
        result = 31 * result + (sender != null ? sender.hashCode() : 0);
        result = 31 * result + (reciever != null ? reciever.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (mailTime != null ? mailTime.hashCode() : 0);
        result = 31 * result + (int) status;
        return result;
    }
}
