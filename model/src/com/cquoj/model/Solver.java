package com.cquoj.model;

import javax.persistence.*;

/**
 * Created by xuwei on 5/4/16.
 */

@Table(name="solver")
@Entity
public class Solver {
    private int solverid;
    private int pid;
    private int value;
    private String filename;
    private String owner;

    @Id
    @Column(name = "solverid")
    public int getSolverid() {
        return solverid;
    }

    public void setSolverid(int solverid) {
        this.solverid = solverid;
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
    @Column(name = "value")
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Basic
    @Column(name = "filename")
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Basic
    @Column(name = "owner")
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Solver solver = (Solver) o;

        if (solverid != solver.solverid) return false;
        if (pid != solver.pid) return false;
        if (value != solver.value) return false;
        if (filename != null ? !filename.equals(solver.filename) : solver.filename != null) return false;
        if (owner != null ? !owner.equals(solver.owner) : solver.owner != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = solverid;
        result = 31 * result + pid;
        result = 31 * result + value;
        result = 31 * result + (filename != null ? filename.hashCode() : 0);
        result = 31 * result + (owner != null ? owner.hashCode() : 0);
        return result;
    }
}
