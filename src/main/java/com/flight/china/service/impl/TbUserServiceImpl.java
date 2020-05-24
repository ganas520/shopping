package com.flight.china.service.impl;

import java.util.List;

import com.flight.china.bean.TbUser;

public interface TbUserServiceImpl {

	public List<TbUser> login(String userName,String passWord);

	public int getCount(TbUser tbUser);
	
	public int insertUser(TbUser tbUser);
	
	public List<TbUser> getAllUserMessage(TbUser tbUser);
	
	public int updatePassword(TbUser tbUser);
	
	int updateUser(TbUser tbUser);
	
}
