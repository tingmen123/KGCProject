package com.ddw.dao;

import com.ddw.pojo.Dcoin;
import com.ddw.pojo.DcoinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DcoinMapper {
    long countByExample(DcoinExample example);

    int deleteByExample(DcoinExample example);

    int insert(Dcoin record);

    int insertSelective(Dcoin record);

    List<Dcoin> selectByExample(DcoinExample example);

    int updateByExampleSelective(@Param("record") Dcoin record, @Param("example") DcoinExample example);

    int updateByExample(@Param("record") Dcoin record, @Param("example") DcoinExample example);
}