package com.cmb.newsanalysistaskcreator.dao;

import com.cmb.newsanalysistaskcreator.model.NewsAnalysisModelDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component("newsAnalysisModelDOMapper")
public interface NewsAnalysisModelDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NewsAnalysisModelDO record);

    int insertSelective(NewsAnalysisModelDO record);

    NewsAnalysisModelDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NewsAnalysisModelDO record);

    int updateByPrimaryKey(NewsAnalysisModelDO record);
}