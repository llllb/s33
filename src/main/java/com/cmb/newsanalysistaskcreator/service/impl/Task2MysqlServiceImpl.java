package com.cmb.newsanalysistaskcreator.service.impl;

import com.cmb.newsanalysistaskcreator.dao.NewsAnalysisHistoricalDataTaskDOMapper;
import com.cmb.newsanalysistaskcreator.model.NewsAnalysisHistoricalDataTaskDO;
import com.cmb.newsanalysistaskcreator.model.NewsAnalysisRawDataDO;
import com.cmb.newsanalysistaskcreator.service.DataPoolFromMysqlService;
import com.cmb.newsanalysistaskcreator.service.Task2MysqlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: news-analysis-task-creator
 * @description: 在mysql中创建任务
 * @author: Bo Liu
 * @create: 2019-04-01 18:05
 **/
@Service
public class Task2MysqlServiceImpl implements Task2MysqlService {

    @Autowired
    private DataPoolFromMysqlService dataPoolFromMysqlService;

    @Autowired
    private NewsAnalysisHistoricalDataTaskDOMapper newsAnalysisHistoricalDataTaskDOMapper;



    /**
     * 在mysql中创建任务
     */
    @Override
    public void createTaskHis(String beginTime,String endTime) {
        //从数据库中获取数据
        List<NewsAnalysisRawDataDO> dataDOList = dataPoolFromMysqlService.getData(beginTime, endTime);
        //遍历每一条数据
        dataDOList.forEach(data->{
            //获取唯一
            Long dataUid = data.getDataUid();
            NewsAnalysisHistoricalDataTaskDO newsAnalysisHistoricalDataTaskDO = new NewsAnalysisHistoricalDataTaskDO();
            newsAnalysisHistoricalDataTaskDO.setTaskUid(dataUid);
            //创建历史数据任务
            newsAnalysisHistoricalDataTaskDOMapper.insert(newsAnalysisHistoricalDataTaskDO);
        });

    }

}
