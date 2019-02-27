package com.ddw.dao;

import com.ddw.pojo.Debt;
import com.ddw.pojo.DebtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DebtMapper {
    long countByExample(DebtExample example);

    int deleteByExample(DebtExample example);

    int insert(Debt record);

    int insertSelective(Debt record);

    List<Debt> selectByExample(DebtExample example);

    int updateByExampleSelective(@Param("record") Debt record, @Param("example") DebtExample example);

    int updateByExample(@Param("record") Debt record, @Param("example") DebtExample example);
}