package com.flight.china.service.impl;

import java.util.List;

import com.flight.china.bean.TbGoods;
import com.flight.china.bean.TbOrder;

public interface TbOrdersServiceImpl {
	
	public List<TbOrder> getAllOrders(TbOrder tbOrder);
	
	public List<TbOrder> getOrderMessage(TbOrder tbOrder);
	
	public int insertOrders(TbOrder tbOrder);
	
	public int updateOrder(TbOrder tbOrder) ;
	
	public int deleteOrder(TbOrder tbOrder);
	
	public int getOrdersCount(TbOrder tbOrder);
	
	public List<TbOrder> getOrdersLike(TbOrder tbOrder);
    
    public int getOrdersLikeCount(TbOrder tbOrder) ;

}
