package com.orilore.controller;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.orilore.biz.IHouseBiz;
import com.orilore.model.House;
import com.orilore.model.HouseState;
import com.orilore.util.Uploader;

@RestController
@RequestMapping("/house")
public class HouseCtrl {
	@Resource
	private IHouseBiz biz;

	@RequestMapping("/state")
	public List<HouseState> state(){
		return biz.state();
	}
	
	@RequestMapping("/find/{id}")
	public House find(@PathVariable("id") int id){
		return biz.find(id);
	}
	
	@RequestMapping("/remove/{id}")
	public boolean remove(@PathVariable("id") int id){
		return biz.remove(id);
	}
	
	@RequestMapping("/uploads")
	public boolean uploads(MultipartFile pica,MultipartFile picb,MultipartFile picc,MultipartFile picd,HttpServletRequest request){
		House bean = new House();
		String id = request.getParameter("id");
		bean.setId(Integer.parseInt(id));
		String path = request.getSession().getServletContext().getRealPath("/images");
		if(pica!=null && pica.getSize()>0){
			String fname = Uploader.upload(pica, path);
			if(fname!=null){
				bean.setPica(fname);
			}
		}
		if(picb!=null && picb.getSize()>0){
			String fname = Uploader.upload(picb, path);
			if(fname!=null){
				bean.setPicb(fname);
			}
		}
		if(picc!=null && picc.getSize()>0){
			String fname = Uploader.upload(picc, path);
			if(fname!=null){
				bean.setPicc(fname);
			}
		}
		if(picd!=null && picd.getSize()>0){
			String fname = Uploader.upload(picd, path);
			if(fname!=null){
				bean.setPicd(fname);
			}
		}
		return biz.saveImage(bean);
	}
	
	@RequestMapping("/save")
	public House save(House bean){
		if(biz.save(bean)){
			return bean;
		}else{
			return null;
		}
	}
	
	@RequestMapping("/enable")
	public boolean enable(int id,int status){
		return this.biz.enable(id, status);
	}
	

	@RequestMapping("/query2")
	public List<House> query2(int kid,String rdate,String ldate){
		Map<String,Object> map = new HashMap<>();
		map.put("kid", kid);
		map.put("rdate", rdate);
		map.put("ldate", ldate);
		return this.biz.query2(map);
	}
	
	@RequestMapping("/query")
	public Map<String,Object> query(HttpServletRequest request){
		//设置查询条件
		String k = request.getParameter("kid");
		String b = request.getParameter("beds");
		Map<String,Object> map = new HashMap<>();
		if(k!=null && !"".equals(k)){
			map.put("kid", k);
		}
		if(b!=null && !"".equals(b)){
			map.put("beds",b);
		}
		//设置分页条件
		int page=1,rows=10;
		String p = request.getParameter("page");
		if(p!=null && !"".equals(p)){
			page = Integer.parseInt(p);
		}
		String r =  request.getParameter("rows");
		if(r!=null && !"".equals(r)){
			rows = Integer.parseInt(r);
		}
		PageHelper.startPage(page,rows);
		List<House> list = biz.query(map);
		Page pg = (Page)list;
		int pages = pg.getPages();
		Map<String,Object> rs = new HashMap<>();
		rs.put("list", list);
		rs.put("pages", pages);
		return rs;
	}
}
