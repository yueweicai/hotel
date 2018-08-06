package com.orilore.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.orilore.biz.IHpriceBiz;
import com.orilore.model.Hprice;

@RestController
@RequestMapping("/hprice")
public class HpriceCtrl {
	@Resource
	private IHpriceBiz biz;
	
	@RequestMapping("/get")
	public Hprice getprice(int kid,String sdate,String edate){
		Map<String,Object> map = new HashMap<>();
		map.put("kid", kid);
		map.put("sdate", sdate);
		map.put("edate", edate);
		
		return biz.find(map);
	}
	
	@RequestMapping("/query")
	public Map<String,Object> query(@RequestParam("page") int page,@RequestParam("rows") int rows){
		PageHelper.startPage(page,rows);
		List<Hprice> list = biz.query();
		Page pg = (Page)list;
		int pages = pg.getPages();
		Map<String,Object> rs = new HashMap<>();
		rs.put("list", list);
		rs.put("pages", pages);
		return rs;
	}
	
	@RequestMapping("/find/{id}")
	public Hprice find(@PathVariable("id") int id){
		return biz.find(id);
	}
	
	@RequestMapping("/remove/{id}")
	public boolean remove(@PathVariable("id") int id){
		return biz.remove(id);
	}
	
	@RequestMapping("/save")
	public boolean save(Hprice bean){
		return biz.save(bean);
	}
}
