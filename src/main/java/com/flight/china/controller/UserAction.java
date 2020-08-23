package com.flight.china.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.flight.china.bean.TbUser;
import com.flight.china.service.TbUserService;
import com.flight.china.util.ConstantUtils;
@ResponseBody
@RestController
public class UserAction {

	@Autowired
	public TbUserService tbUserService;
	
	private String getDate = "";
	
	@RequestMapping(value = "/login",method= RequestMethod.POST)
	public int login(@RequestBody(required=false) TbUser tbUser,HttpServletRequest req){
		if(tbUser == null){
			return 0;
		}
		List<TbUser> tbUsers= tbUserService.login(tbUser.getUserCode(), tbUser.getUserPassword());
		if(tbUsers.size() != 0) {
			req.getSession().setAttribute(ConstantUtils.USER_SESSION_KEY, tbUsers.get(0));
		}
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		getDate = simpleDateFormat.format(new Date());
		return tbUsers.size();
	}
	
	@RequestMapping(value="/getDate",method=RequestMethod.POST)
	public Map<String,Object> getDate(HttpServletRequest req) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("message", "请求成功");
		map.put("code", 0);
		map.put("data",getDate );
		return map;
	}
	
	@RequestMapping(value="/logout",method=RequestMethod.POST)
	public void logout(HttpServletRequest req) {
		req.getSession().invalidate();
	}

	@RequestMapping(value="/getUserAll")
	public Map<String,Object> getUserMessgeAll(HttpServletRequest req){
		int page = Integer.valueOf(req.getParameter("page"));
		int rows = Integer.valueOf(req.getParameter("limit"));
		int startWith = (page-1)*rows;
		
		TbUser tbUser = new TbUser();
		tbUser.setStartWith(startWith);
		tbUser.setRows(rows);
		TbUser tbUserNew = new TbUser();
		List<TbUser> tbUserList = tbUserService.getUserMessageAll(tbUser);
		List<TbUser> tbUserListCount= tbUserService.getAllUserMessage(tbUserNew);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("count", tbUserListCount.size());
		map.put("message", "请求成功");
		map.put("code", 0);
		map.put("data", tbUserList);
		return map;
	}
	
	@RequestMapping(value="/getAllUserMessage")
	public Map<String,Object> getAllUserMessage(@RequestBody(required=false) TbUser tbUser,HttpServletRequest req){
		List<TbUser> tbUserList= tbUserService.getAllUserMessage(tbUser);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("message", "请求成功");
		map.put("code", 0);
		map.put("data", tbUserList);
		map.put("count", tbUserList.size());
		return map;
	}
	
	@RequestMapping(value="/getUserLike")
	public Map<String,Object> getUserLike(@RequestBody(required=false) TbUser tbUser,HttpServletRequest req){
		int page = Integer.valueOf(req.getParameter("page"));
		int rows = Integer.valueOf(req.getParameter("limit"));
		int startWith = (page-1)*rows;
		String userCode = req.getParameter("userCode");
		
		TbUser tbUserNew = new TbUser();
		tbUserNew.setStartWith(startWith);
		tbUserNew.setRows(rows);
		tbUserNew.setUserCode(userCode);
		List<TbUser> tbUserList= tbUserService.getUserLike(tbUserNew);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("message", "请求成功");
		map.put("code", 0);
		map.put("data", tbUserList);
		map.put("count", tbUserList.size());
		return map;
	}
	
	@RequestMapping(value="/register")
	public Map<String,Object> register(@RequestBody(required=false) TbUser tbUser){
		TbUser tbUserCode = new TbUser();
		tbUserCode.setUserCode(tbUser.getUserCode());
		List<TbUser> tbUserList = tbUserService.getAllUserMessage(tbUserCode);
		Map<String,Object> map = new HashMap<String,Object>();
		if(tbUserList.size() >0) {
			map.put("data", 1);
		}else {
			tbUserService.insertUser(tbUser);
			map.put("data", 0);
		}
		map.put("message", "请求成功");
		map.put("code", 0);
		return map;
	}
	
	@RequestMapping(value="/deleteUser")
	public Map<String,Object> deleteUser(@RequestBody(required=false) TbUser tbUser){
		tbUserService.deleteUser(tbUser);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("message", "请求成功");
		map.put("code", 0);
		map.put("data", 1);
		return map;
	}
	
	@RequestMapping(value="/updateUser")
	public Map<String,Object> updateUser(@RequestBody(required=false) TbUser tbUser,HttpServletRequest req){
		int updateCount = tbUserService.updateUser(tbUser);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("message", "请求成功");
		map.put("code", 0);
		map.put("data", updateCount);
		return map;
	}
	
	@RequestMapping(value="/updatePassword")
	public Map<String,Object> updatePassword(@RequestBody(required=false) TbUser tbUser){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("message", "请求成功");
		map.put("code", 0);
		tbUser.setUserPassword(tbUser.getOldP());
		List<TbUser> list = tbUserService.getAllUserMessage(tbUser);
		if(list.size() <1) {
			map.put("data",0);
		}else {
			tbUser.setUserPassword(tbUser.getNewP());
			int updateCount = tbUserService.updatePassword(tbUser);
			System.out.println(updateCount);
			map.put("data", 1);
		}
		return map;
	}
	
}
