package com.flight.china.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.china.bean.TbGoods;
import com.flight.china.dao.TbGoodsMapper;
import com.flight.china.service.impl.TbGoodsServiceImpl;

@Service
public class TbGoodsService implements TbGoodsServiceImpl{

	@Autowired
	private TbGoodsMapper tbGoodsMapper;
	
	public List<TbGoods> getAllGoods(TbGoods tbGoods){
		return tbGoodsMapper.getAllGoods(tbGoods);
	}
	
	public int deleteGoods(TbGoods tbGoods) {
		return tbGoodsMapper.deleteByExample(tbGoods);
	}
	
	public int updateGoods(TbGoods tbGoods) {
		return tbGoodsMapper.updateByExample(tbGoods);
	}
	
	public int insertGoods(TbGoods tbGoods) {
		return tbGoodsMapper.insert(tbGoods);
	}
	
	public List<TbGoods> getGoodsLike(TbGoods tbGoods){
		return tbGoodsMapper.getGoodsLike(tbGoods);
	}
}
