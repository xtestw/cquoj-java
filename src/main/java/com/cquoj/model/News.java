package com.cquoj.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by xuwei on 5/4/16.
 */

@Table(name="news")
@Entity
public class News {
    private int newsid;
    private Timestamp timeAdded;
    private String title;
    private String content;
    private String author;

    @Id
    @Column(name = "newsid")
    public int getNewsid() {
        return newsid;
    }

    public void setNewsid(int newsid) {
        this.newsid = newsid;
    }

    @Basic
    @Column(name = "time_added")
    public Timestamp getTimeAdded() {
        return timeAdded;
    }

    public void setTimeAdded(Timestamp timeAdded) {
        this.timeAdded = timeAdded;
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
    @Column(name = "author")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        News news = (News) o;

        if (newsid != news.newsid) return false;
        if (timeAdded != null ? !timeAdded.equals(news.timeAdded) : news.timeAdded != null) return false;
        if (title != null ? !title.equals(news.title) : news.title != null) return false;
        if (content != null ? !content.equals(news.content) : news.content != null) return false;
        if (author != null ? !author.equals(news.author) : news.author != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = newsid;
        result = 31 * result + (timeAdded != null ? timeAdded.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        return result;
    }
}
