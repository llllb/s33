package com.cmb.newsanalysistaskcreator.dao;

import com.cmb.newsanalysistaskcreator.model.NewsAnalysisTaskDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component("newsAnalysisTaskDOMapper")
public interface NewsAnalysisTaskDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NewsAnalysisTaskDO record);

    int insertSelective(NewsAnalysisTaskDO record);

    NewsAnalysisTaskDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NewsAnalysisTaskDO record);

    int updateByPrimaryKey(NewsAnalysisTaskDO record);
}