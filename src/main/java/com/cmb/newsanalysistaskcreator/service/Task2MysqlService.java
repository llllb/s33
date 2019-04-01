package com.cmb.newsanalysistaskcreator.service;

/**
 * @program: news-analysis-task-creator
 * @description: 在数据库中创建任务
 * @author: Bo Liu
 * @create: 2019-04-01 17:48
 **/
public interface Task2MysqlService {

    /**
     * 读历史数据创建任务
     * @param beginTime
     * @param endTime
     */
    public void createTaskHis(String beginTime,String endTime);

}
