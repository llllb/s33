package com.cmb.newsanalysistaskcreator.model;

import java.util.Date;

public class NewsAnalysisJobDO {
    private Integer id;

    private String name;

    private String type;

    private Byte jobStatus;

    private Date createdTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Byte getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(Byte jobStatus) {
        this.jobStatus = jobStatus;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}