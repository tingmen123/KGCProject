package com.ddw.dao;

import com.ddw.pojo.Assert;
import com.ddw.pojo.AssertExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssertMapper {
    long countByExample(AssertExample example);

    int deleteByExample(AssertExample example);

    int insert(Assert record);

    int insertSelective(Assert record);

    List<Assert> selectByExample(AssertExample example);

    int updateByExampleSelective(@Param("record") Assert record, @Param("example") AssertExample example);

    int updateByExample(@Param("record") Assert record, @Param("example") AssertExample example);
}