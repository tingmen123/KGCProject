package com.ddw.dao;

import com.ddw.pojo.Orderstate;
import com.ddw.pojo.OrderstateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderstateMapper {
    long countByExample(OrderstateExample example);

    int deleteByExample(OrderstateExample example);

    int deleteByPrimaryKey(Integer orderstateid);

    int insert(Orderstate record);

    int insertSelective(Orderstate record);

    List<Orderstate> selectByExample(OrderstateExample example);

    Orderstate selectByPrimaryKey(Integer orderstateid);

    int updateByExampleSelective(@Param("record") Orderstate record, @Param("example") OrderstateExample example);

    int updateByExample(@Param("record") Orderstate record, @Param("example") OrderstateExample example);

    int updateByPrimaryKeySelective(Orderstate record);

    int updateByPrimaryKey(Orderstate record);
}