package com.cquoj.model;

import javax.persistence.*;

/**
 * Created by xuwei on 5/4/16.
 */
@Table(name="vurl")
@Entity
public class Vurl {
    private int id;
    private String voj;
    private String vid;
    private String url;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "voj")
    public String getVoj() {
        return voj;
    }

    public void setVoj(String voj) {
        this.voj = voj;
    }

    @Basic
    @Column(name = "vid")
    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    @Basic
    @Column(name = "url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vurl vurl = (Vurl) o;

        if (id != vurl.id) return false;
        if (voj != null ? !voj.equals(vurl.voj) : vurl.voj != null) return false;
        if (vid != null ? !vid.equals(vurl.vid) : vurl.vid != null) return false;
        if (url != null ? !url.equals(vurl.url) : vurl.url != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (voj != null ? voj.hashCode() : 0);
        result = 31 * result + (vid != null ? vid.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        return result;
    }
}
