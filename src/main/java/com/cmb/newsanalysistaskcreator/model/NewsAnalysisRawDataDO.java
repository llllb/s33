package com.cmb.newsanalysistaskcreator.model;

import java.util.Date;

public class NewsAnalysisRawDataDO {
    private Integer id;

    private Date createdTime;

    private Long dataUid;

    private byte[] newsAnalysisData;

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

    public Long getDataUid() {
        return dataUid;
    }

    public void setDataUid(Long dataUid) {
        this.dataUid = dataUid;
    }

    public byte[] getNewsAnalysisData() {
        return newsAnalysisData;
    }

    public void setNewsAnalysisData(byte[] newsAnalysisData) {
        this.newsAnalysisData = newsAnalysisData;
    }
}