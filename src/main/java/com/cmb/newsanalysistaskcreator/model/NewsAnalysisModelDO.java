package com.cmb.newsanalysistaskcreator.model;

import java.util.Date;

public class NewsAnalysisModelDO {
    private Integer id;

    private Date createdTime;

    private Byte statusStatus;

    private String name;

    private String url;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Byte getStatusStatus() {
        return statusStatus;
    }

    public void setStatusStatus(Byte statusStatus) {
        this.statusStatus = statusStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}