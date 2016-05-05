package com.cquoj.model;

import javax.persistence.*;

/**
 * Created by xuwei on 5/4/16.
 */
@Entity
@Table(name = "contest_problem", schema = "", catalog = "cquoj")
public class ContestProblem {
    private int cpid;
    private int cid;
    private int pid;
    private String lable;
    private int type;
    private int base;
    private int minp;
    private double paraA;
    private double paraB;
    private double paraC;
    private double paraD;
    private double paraE;
    private double paraF;

    @Id
    @Column(name = "cpid")
    public int getCpid() {
        return cpid;
    }

    public void setCpid(int cpid) {
        this.cpid = cpid;
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
    @Column(name = "pid")
    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    @Basic
    @Column(name = "lable")
    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    @Basic
    @Column(name = "type")
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Basic
    @Column(name = "base")
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    @Basic
    @Column(name = "minp")
    public int getMinp() {
        return minp;
    }

    public void setMinp(int minp) {
        this.minp = minp;
    }

    @Basic
    @Column(name = "para_a")
    public double getParaA() {
        return paraA;
    }

    public void setParaA(double paraA) {
        this.paraA = paraA;
    }

    @Basic
    @Column(name = "para_b")
    public double getParaB() {
        return paraB;
    }

    public void setParaB(double paraB) {
        this.paraB = paraB;
    }

    @Basic
    @Column(name = "para_c")
    public double getParaC() {
        return paraC;
    }

    public void setParaC(double paraC) {
        this.paraC = paraC;
    }

    @Basic
    @Column(name = "para_d")
    public double getParaD() {
        return paraD;
    }

    public void setParaD(double paraD) {
        this.paraD = paraD;
    }

    @Basic
    @Column(name = "para_e")
    public double getParaE() {
        return paraE;
    }

    public void setParaE(double paraE) {
        this.paraE = paraE;
    }

    @Basic
    @Column(name = "para_f")
    public double getParaF() {
        return paraF;
    }

    public void setParaF(double paraF) {
        this.paraF = paraF;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContestProblem that = (ContestProblem) o;

        if (cpid != that.cpid) return false;
        if (cid != that.cid) return false;
        if (pid != that.pid) return false;
        if (type != that.type) return false;
        if (base != that.base) return false;
        if (minp != that.minp) return false;
        if (Double.compare(that.paraA, paraA) != 0) return false;
        if (Double.compare(that.paraB, paraB) != 0) return false;
        if (Double.compare(that.paraC, paraC) != 0) return false;
        if (Double.compare(that.paraD, paraD) != 0) return false;
        if (Double.compare(that.paraE, paraE) != 0) return false;
        if (Double.compare(that.paraF, paraF) != 0) return false;
        if (lable != null ? !lable.equals(that.lable) : that.lable != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = cpid;
        result = 31 * result + cid;
        result = 31 * result + pid;
        result = 31 * result + (lable != null ? lable.hashCode() : 0);
        result = 31 * result + type;
        result = 31 * result + base;
        result = 31 * result + minp;
        temp = Double.doubleToLongBits(paraA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(paraB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(paraC);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(paraD);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(paraE);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(paraF);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
