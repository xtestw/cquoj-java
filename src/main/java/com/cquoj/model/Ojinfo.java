package com.cquoj.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by xuwei on 5/4/16.
 */

@Table(name="ojinfo")
@Entity
public class Ojinfo {
    private int id;
    private String name;
    private String int64Io;
    private String javaclass;
    private String status;
    private String supportlang;
    private Timestamp lastcheck;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "int64io")
    public String getInt64Io() {
        return int64Io;
    }

    public void setInt64Io(String int64Io) {
        this.int64Io = int64Io;
    }

    @Basic
    @Column(name = "javaclass")
    public String getJavaclass() {
        return javaclass;
    }

    public void setJavaclass(String javaclass) {
        this.javaclass = javaclass;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "supportlang")
    public String getSupportlang() {
        return supportlang;
    }

    public void setSupportlang(String supportlang) {
        this.supportlang = supportlang;
    }

    @Basic
    @Column(name = "lastcheck")
    public Timestamp getLastcheck() {
        return lastcheck;
    }

    public void setLastcheck(Timestamp lastcheck) {
        this.lastcheck = lastcheck;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ojinfo ojinfo = (Ojinfo) o;

        if (id != ojinfo.id) return false;
        if (name != null ? !name.equals(ojinfo.name) : ojinfo.name != null) return false;
        if (int64Io != null ? !int64Io.equals(ojinfo.int64Io) : ojinfo.int64Io != null) return false;
        if (javaclass != null ? !javaclass.equals(ojinfo.javaclass) : ojinfo.javaclass != null) return false;
        if (status != null ? !status.equals(ojinfo.status) : ojinfo.status != null) return false;
        if (supportlang != null ? !supportlang.equals(ojinfo.supportlang) : ojinfo.supportlang != null) return false;
        if (lastcheck != null ? !lastcheck.equals(ojinfo.lastcheck) : ojinfo.lastcheck != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (int64Io != null ? int64Io.hashCode() : 0);
        result = 31 * result + (javaclass != null ? javaclass.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (supportlang != null ? supportlang.hashCode() : 0);
        result = 31 * result + (lastcheck != null ? lastcheck.hashCode() : 0);
        return result;
    }
}
