package com.cmb.newsanalysistaskcreator.dao;

import com.cmb.newsanalysistaskcreator.model.NewsAnalysisHistoricalDataTaskDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component("newsAnalysisHistoricalDataTaskDOMapper")
public interface NewsAnalysisHistoricalDataTaskDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NewsAnalysisHistoricalDataTaskDO record);

    int insertSelective(NewsAnalysisHistoricalDataTaskDO record);

    NewsAnalysisHistoricalDataTaskDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NewsAnalysisHistoricalDataTaskDO record);

    int updateByPrimaryKey(NewsAnalysisHistoricalDataTaskDO record);
}