package com.cmb.newsanalysistaskcreator.dao;

import com.cmb.newsanalysistaskcreator.model.NewsAnalysisRawDataDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component("newsAnalysisRawDataDOMapper")
public interface NewsAnalysisRawDataDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NewsAnalysisRawDataDO record);

    int insertSelective(NewsAnalysisRawDataDO record);

    NewsAnalysisRawDataDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NewsAnalysisRawDataDO record);

    int updateByPrimaryKeyWithBLOBs(NewsAnalysisRawDataDO record);

    int updateByPrimaryKey(NewsAnalysisRawDataDO record);

    List<NewsAnalysisRawDataDO> selectByTimeParams(@Param("param")Map<String,Object> params);
}