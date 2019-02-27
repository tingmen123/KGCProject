package com.ddw.dao;

import com.ddw.pojo.Payback;
import com.ddw.pojo.PaybackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaybackMapper {
    long countByExample(PaybackExample example);

    int deleteByExample(PaybackExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(Payback record);

    int insertSelective(Payback record);

    List<Payback> selectByExample(PaybackExample example);

    Payback selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") Payback record, @Param("example") PaybackExample example);

    int updateByExample(@Param("record") Payback record, @Param("example") PaybackExample example);

    int updateByPrimaryKeySelective(Payback record);

    int updateByPrimaryKey(Payback record);
}