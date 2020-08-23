package com.flight.china.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.china.bean.TbOrder;
import com.flight.china.dao.TbOrderMapper;
import com.flight.china.service.impl.TbOrdersServiceImpl;

@Service
public class TbOrdersService implements TbOrdersServiceImpl{

	@Autowired
	private TbOrderMapper tbOrderMapper;
	
	public List<TbOrder> getAllOrders(TbOrder tbOrder){
		return tbOrderMapper.selectByExample(tbOrder);
	}
	
	public List<TbOrder> getOrderMessage(TbOrder tbOrder){
		return tbOrderMapper.getOrderMessage(tbOrder);
	}
	
	public int insertOrders(TbOrder tbOrder) {
		return tbOrderMapper.insert(tbOrder);
	}
	
	public int updateOrder(TbOrder tbOrder) {
		return tbOrderMapper.updateByExample(tbOrder);
	}
	
	public int deleteOrder(TbOrder tbOrder) {
		return tbOrderMapper.deleteByExample(tbOrder);
	}
	
	public int getOrdersCount(TbOrder tbOrder) {
		return tbOrderMapper.getOrdersCount(tbOrder);
	}
	
	public List<TbOrder> getOrdersLike(TbOrder tbOrder){
		return tbOrderMapper.getOrdersLike(tbOrder);
	}
    
    public int getOrdersLikeCount(TbOrder tbOrder) {
    	return tbOrderMapper.getOrdersLikeCount(tbOrder);
    }
}
