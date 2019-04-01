package com.cmb.newsanalysistaskcreator.model;

import java.util.Date;

public class NewsAnalysisTaskDO {
    private Integer id;

    private Date createdTime;

    private String modelStatus;

    private Byte taskStatus;

    private Long taskUid;

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

    public String getModelStatus() {
        return modelStatus;
    }

    public void setModelStatus(String modelStatus) {
        this.modelStatus = modelStatus == null ? null : modelStatus.trim();
    }

    public Byte getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Byte taskStatus) {
        this.taskStatus = taskStatus;
    }

    public Long getTaskUid() {
        return taskUid;
    }

    public void setTaskUid(Long taskUid) {
        this.taskUid = taskUid;
    }
}