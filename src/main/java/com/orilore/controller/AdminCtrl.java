package com.orilore.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.orilore.biz.IAdminBiz;
import com.orilore.model.Admin;
import com.orilore.util.MD5;

@RestController
@RequestMapping("/admin")
public class AdminCtrl {
	@Resource
	private IAdminBiz biz;
	
	@RequestMapping("/query")
	public List<Admin> query(){
		return biz.query();
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public Admin login(String username,String password){
		Admin bean = new Admin();
		bean.setUsername(username);
		bean.setPassword(MD5.crypt(password));
		return biz.get(bean);
	}
	
	@RequestMapping("/find")
	public Admin find(int id){
		return biz.find(id);
	}
	
	@RequestMapping("/save")
	public boolean save(HttpServletRequest request){
		String id = request.getParameter("id");
		String u = request.getParameter("username");
		String p = request.getParameter("password");
		String s = request.getParameter("status");
		String pids = request.getParameter("pids");
		Admin bean = new Admin();
		if(id!=null && !"".equals(id)){
			bean.setId(Integer.parseInt(id));
		}
		bean.setUsername(u);
		bean.setPassword(MD5.crypt(p));
		bean.setStatus(Integer.parseInt(s));
		List<Integer> powers = new ArrayList<>();
		String ps[] = pids.split(",");
		for(String pid : ps){
			powers.add(Integer.parseInt(pid));
		}
		try {
			return biz.save(bean, powers);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
}
