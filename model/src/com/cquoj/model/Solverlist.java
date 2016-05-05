package com.cquoj.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by xuwei on 5/4/16.
 */

@Table(name="solverlist")
@Entity
public class Solverlist {
    private int uid;
    private int solverid;

    @Basic
    @Column(name = "uid")
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "solverid")
    public int getSolverid() {
        return solverid;
    }

    public void setSolverid(int solverid) {
        this.solverid = solverid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Solverlist that = (Solverlist) o;

        if (uid != that.uid) return false;
        if (solverid != that.solverid) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uid;
        result = 31 * result + solverid;
        return result;
    }
}
