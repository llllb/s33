package com.cmb.newsanalysistaskcreator.dao;

import com.cmb.newsanalysistaskcreator.model.NewsAnalysisJobDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component("newsAnalysisJobDOMapper")
public interface NewsAnalysisJobDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NewsAnalysisJobDO record);

    int insertSelective(NewsAnalysisJobDO record);

    NewsAnalysisJobDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NewsAnalysisJobDO record);

    int updateByPrimaryKey(NewsAnalysisJobDO record);

    List<NewsAnalysisJobDO> selectByTypeAndStatus(Map<String,String> map);
}