package com.ddw.dao;

import com.ddw.pojo.Coborrower;
import com.ddw.pojo.CoborrowerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoborrowerMapper {
    long countByExample(CoborrowerExample example);

    int deleteByExample(CoborrowerExample example);

    int deleteByPrimaryKey(String cbid);

    int insert(Coborrower record);

    int insertSelective(Coborrower record);

    List<Coborrower> selectByExample(CoborrowerExample example);

    Coborrower selectByPrimaryKey(String cbid);

    int updateByExampleSelective(@Param("record") Coborrower record, @Param("example") CoborrowerExample example);

    int updateByExample(@Param("record") Coborrower record, @Param("example") CoborrowerExample example);

    int updateByPrimaryKeySelective(Coborrower record);

    int updateByPrimaryKey(Coborrower record);
}