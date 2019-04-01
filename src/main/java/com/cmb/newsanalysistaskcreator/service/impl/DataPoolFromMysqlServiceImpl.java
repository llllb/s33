package com.cmb.newsanalysistaskcreator.service.impl;

import com.cmb.newsanalysistaskcreator.dao.NewsAnalysisRawDataDOMapper;
import com.cmb.newsanalysistaskcreator.model.NewsAnalysisRawDataDO;
import com.cmb.newsanalysistaskcreator.service.DataPoolFromMysqlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: news-analysis-task-creator
 * @description: 从数据库中读取数据
 * @author: Bo Liu
 * @create: 2019-04-01 18:02
 **/
@Service
public class DataPoolFromMysqlServiceImpl implements DataPoolFromMysqlService {

    @Autowired
    private NewsAnalysisRawDataDOMapper newsAnalysisRawDataDOMapper;

    /**
     * 按时间从数据库中获取数据
     */
    @Override
    public List<NewsAnalysisRawDataDO> getData(String beginTime,String endTime) {
        Map<String, Object> params = new HashMap<>();
        params.put("beginTime",beginTime);
        params.put("endTime",endTime);
        List<NewsAnalysisRawDataDO> newsAnalysisRawDataDOS = newsAnalysisRawDataDOMapper.selectByTimeParams(params);
        return newsAnalysisRawDataDOS;
    }
}
