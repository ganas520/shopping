package com.flight.china.dao;

import com.flight.china.bean.TbOrder;
import com.flight.china.bean.TbOrderExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbOrderMapper {
    long countByExample(TbOrderExample example);

    int deleteByExample(TbOrder record);

    int insert(TbOrder record);

    int insertSelective(TbOrder record);

    List<TbOrder> selectByExample(TbOrder record);
    
    List<TbOrder> getOrderMessage(TbOrder record);
 
    int updateByExampleSelective(@Param("record") TbOrder record, @Param("example") TbOrderExample example);

    int updateByExample(TbOrder record);
    
    Integer getOrdersCount(TbOrder record);
    
    List<TbOrder> getOrdersLike(TbOrder tbOrder);
    
    int getOrdersLikeCount(TbOrder tbOrder);
    
}