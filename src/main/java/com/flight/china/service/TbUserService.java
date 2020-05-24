package com.flight.china.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.china.bean.TbUser;
import com.flight.china.dao.TbUserMapper;
import com.flight.china.service.impl.TbUserServiceImpl;

@Service
public class TbUserService implements TbUserServiceImpl{

	@Autowired
	private TbUserMapper tbUserMapper;
	
	public List<TbUser> login(String userCode,String passWord) {
		TbUser tbUser = new TbUser();
		tbUser.setUserCode(userCode);
		tbUser.setUserPassword(passWord);
		return tbUserMapper.selectByExample(tbUser);
	}

	public List<TbUser> getUserMessageAll(TbUser tbUser){
		return  tbUserMapper.selectByExample(tbUser);
	}
	
	public int getCount(TbUser tbUser){
		return tbUserMapper.getCount(tbUser);
	}
	
	public int insertUser(TbUser tbUser){
		return tbUserMapper.insertUser(tbUser);
	}
	
	public int deleteUser(TbUser tbUser){
		return tbUserMapper.deleteUser(tbUser);
	}
	
	public int updateUser(TbUser tbUser){
		return tbUserMapper.updateById(tbUser);
	}
	
	public int updatePassword(TbUser tbUser){
		return tbUserMapper.updatePassword(tbUser);
	}

	public List<TbUser> getAllUserMessage(TbUser tbUser) {
		return tbUserMapper.getAllUserMessage(tbUser);
	}
	
	public List<TbUser> getUserLike(TbUser tbUser) {
		return tbUserMapper.getUserLike(tbUser);
	}
}
