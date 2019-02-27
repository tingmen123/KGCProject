package com.ddw.dao;

import com.ddw.pojo.Debtstate;
import com.ddw.pojo.DebtstateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DebtstateMapper {
    long countByExample(DebtstateExample example);

    int deleteByExample(DebtstateExample example);

    int deleteByPrimaryKey(Integer debtstateid);

    int insert(Debtstate record);

    int insertSelective(Debtstate record);

    List<Debtstate> selectByExample(DebtstateExample example);

    Debtstate selectByPrimaryKey(Integer debtstateid);

    int updateByExampleSelective(@Param("record") Debtstate record, @Param("example") DebtstateExample example);

    int updateByExample(@Param("record") Debtstate record, @Param("example") DebtstateExample example);

    int updateByPrimaryKeySelective(Debtstate record);

    int updateByPrimaryKey(Debtstate record);
}