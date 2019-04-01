package com.cmb.newsanalysistaskcreator.service;

import com.cmb.newsanalysistaskcreator.model.NewsAnalysisRawDataDO;

import java.util.List;

/**
 * @program: news-analysis-task-creator
 * @description: 从数据库中拉取数据
 * @author: Bo Liu
 * @create: 2019-04-01 17:42
 **/
public interface DataPoolFromMysqlService {

    public List<NewsAnalysisRawDataDO> getData(String beginTime,String endTime);
}
