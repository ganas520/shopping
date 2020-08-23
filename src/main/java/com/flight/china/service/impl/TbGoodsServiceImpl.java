package com.flight.china.service.impl;

import java.util.List;

import com.flight.china.bean.TbGoods;

public interface TbGoodsServiceImpl {

	public List<TbGoods> getAllGoods(TbGoods tbGoods);
	
	public int deleteGoods(TbGoods tbGoods);
	
	public int updateGoods(TbGoods tbGoods);
	
	public int insertGoods(TbGoods tbGoods);
	
	List<TbGoods> getGoodsLike(TbGoods tbGoods);
}
