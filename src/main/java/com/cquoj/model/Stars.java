package com.cquoj.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by admin on 2016/6/10.
 */

@Table(name="stars")
@Entity
public class Stars {
    private int id;
    private Problem problem;
    private User user;
    private int state;
    private Timestamp starTime;
    private Timestamp sovleTime;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name="pid", referencedColumnName="pid")
    public Problem getProblem() {
        return problem;
    }

    public void setProblem(Problem problem) {
        this.problem = problem;
    }

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name="uid", referencedColumnName="uid")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Timestamp getStarTime() {
        return starTime;
    }

    public void setStarTime(Timestamp starTime) {
        this.starTime = starTime;
    }

    public Timestamp getSovleTime() {
        return sovleTime;
    }

    public void setSovleTime(Timestamp sovleTime) {
        this.sovleTime = sovleTime;
    }
}
