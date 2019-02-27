package com.ddw.dao;

import com.ddw.pojo.Interest;
import com.ddw.pojo.InterestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InterestMapper {
    long countByExample(InterestExample example);

    int deleteByExample(InterestExample example);

    int deleteByPrimaryKey(Integer interestid);

    int insert(Interest record);

    int insertSelective(Interest record);

    List<Interest> selectByExample(InterestExample example);

    Interest selectByPrimaryKey(Integer interestid);

    int updateByExampleSelective(@Param("record") Interest record, @Param("example") InterestExample example);

    int updateByExample(@Param("record") Interest record, @Param("example") InterestExample example);

    int updateByPrimaryKeySelective(Interest record);

    int updateByPrimaryKey(Interest record);
}