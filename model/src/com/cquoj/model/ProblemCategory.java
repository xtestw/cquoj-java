package com.cquoj.model;

import javax.persistence.*;

/**
 * Created by xuwei on 5/4/16.
 */
@Entity
@Table(name = "problem_category", schema = "", catalog = "cquoj")
public class ProblemCategory {
    private int pcid;
    private int pid;
    private int catid;
    private int weight;

    @Id
    @Column(name = "pcid")
    public int getPcid() {
        return pcid;
    }

    public void setPcid(int pcid) {
        this.pcid = pcid;
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
    @Column(name = "catid")
    public int getCatid() {
        return catid;
    }

    public void setCatid(int catid) {
        this.catid = catid;
    }

    @Basic
    @Column(name = "weight")
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProblemCategory that = (ProblemCategory) o;

        if (pcid != that.pcid) return false;
        if (pid != that.pid) return false;
        if (catid != that.catid) return false;
        if (weight != that.weight) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pcid;
        result = 31 * result + pid;
        result = 31 * result + catid;
        result = 31 * result + weight;
        return result;
    }
}
