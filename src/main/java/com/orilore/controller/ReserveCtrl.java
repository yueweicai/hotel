package com.orilore.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.orilore.biz.IReserveBiz;
import com.orilore.model.Reserve;

@RestController
@RequestMapping("/reserve")
public class ReserveCtrl {
	@Resource
	private IReserveBiz biz;
	
	@RequestMapping("/save")
	public boolean save(Reserve bean){
		return biz.save(bean);
	}
	
	@RequestMapping("/saverec")
	public boolean saverec(int id){
		return biz.addrecord(id);
	}
	
	@RequestMapping("/remove")
	public boolean remove(int id){
		return biz.remove(id);
	}
	
	@RequestMapping("/find")
	public Reserve find(int id){
		return biz.find(id);
	}
	
	@RequestMapping("/query")
	public Map<String,Object> query(int page,int rows,HttpServletRequest request){
		PageHelper.startPage(page,rows);
		String phone = request.getParameter("phone");
		String sdate = request.getParameter("sdate");
		String edate = request.getParameter("edate");
		Map<String,Object> map = new HashMap<>();
		if(phone!=null && !"".equals(phone)){
			map.put("phone", phone);
		}
		if(sdate!=null && !"".equals(sdate)){
			map.put("sdate", sdate);
		}
		if(edate!=null && !"".equals(edate)){
			map.put("edate", edate);
		}
		List<Reserve> list = biz.query(map);
		Page<Reserve> pg = (Page<Reserve>)list;
		int pages = pg.getPages();
		Map<String,Object> rs = new HashMap<>();
		rs.put("list", list);
		rs.put("pages", pages);
		return rs;
	}
}
