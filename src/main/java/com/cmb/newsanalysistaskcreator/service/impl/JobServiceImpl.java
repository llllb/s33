package com.cmb.newsanalysistaskcreator.service.impl;

import com.cmb.newsanalysistaskcreator.dao.NewsAnalysisJobDOMapper;
import com.cmb.newsanalysistaskcreator.model.NewsAnalysisJobDO;
import com.cmb.newsanalysistaskcreator.service.DataPoolFromMysqlService;
import com.cmb.newsanalysistaskcreator.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: news-analysis-task-creator
 * @description: job处理
 * @author: Bo Liu
 * @create: 2019-04-01 18:07
 **/
@Service
public class JobServiceImpl implements JobService {

    @Autowired
    private NewsAnalysisJobDOMapper newsAnalysisJobDOMapper;

    @Autowired
    DataPoolFromMysqlService dataPoolFromMysqlService;


    /**
     * 执行job
     */
    @Override
    public void executeJob(ExecutorParam executorParam) {
        List<String> jobNameList = new ArrayList<>();
        executorParam.getType;
        executorParam.getJobStatus;
        Map<String, String> map = new HashMap<>();
        map.put("type",type);
        map.put("jobStatus",jobStatus);
        List<NewsAnalysisJobDO> newsAnalysisJobDOS = newsAnalysisJobDOMapper.selectByTypeAndStatus(map);
        newsAnalysisJobDOS.forEach(job->{
            String jobName = job.getName();
            jobNameList.add(jobName);
        });
        for (String job : jobNameList) {
            switch (job){
                case 0:{

                }
                case 1:{

                }
            }
        }
    }
}
