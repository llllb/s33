package com.cmb.newsanalysistaskcreator.service.impl;

import com.cmb.newsanalysistaskcreator.service.DataPoolFromKafkaService;
import org.springframework.stereotype.Service;

/**
 * @program: news-analysis-task-creator
 * @description: 从kafka消费数据
 * @author: Bo Liu
 * @create: 2019-04-01 17:58
 **/
@Service
public class DataPoolFromKafkaServiceImpl implements DataPoolFromKafkaService{

    /**
     * 从kafka拉取数据
     */
    @Override
    public void poolData() {

    }
}
