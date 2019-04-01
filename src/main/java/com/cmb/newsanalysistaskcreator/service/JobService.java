package com.cmb.newsanalysistaskcreator.service;

/**
 * @program: news-analysis-task-creator
 * @description: Job处理
 * @author: Bo Liu
 * @create: 2019-04-01 17:49
 **/
public interface JobService {

    public void executeJob(ExecutorParam executorParam);
}
