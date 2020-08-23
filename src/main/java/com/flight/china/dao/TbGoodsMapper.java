package com.flight.china.dao;

import com.flight.china.bean.TbGoods;
import com.flight.china.bean.TbGoodsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbGoodsMapper {
    long countByExample(TbGoodsExample example);

    int deleteByExample(TbGoods tbGoods);

    int insert(TbGoods tbGoods);

    int insertSelective(TbGoods record);

    List<TbGoods> selectByExample(TbGoodsExample example);

    int updateByExampleSelective(@Param("record") TbGoods record, @Param("example") TbGoodsExample example);

    int updateByExample(TbGoods tbGoods);
    
    List<TbGoods> getAllGoods(TbGoods tbGoods);
    
    List<TbGoods> getGoodsLike(TbGoods tbGoods);
}