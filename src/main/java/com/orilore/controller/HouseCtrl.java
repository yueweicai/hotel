package com.orilore.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.orilore.biz.IHouseBiz;
import com.orilore.model.House;

@RestController
@RequestMapping("/house")
public class HouseCtrl {
	@Resource
	private IHouseBiz biz;
	
	@RequestMapping("/remove/{id}")
	public boolean remove(@PathVariable("id") int id){
		return biz.remove(id);
	}
	
	@RequestMapping("/uploads")
	public int uploads(@RequestParam("files[]") MultipartFile[] files,HttpServletRequest request){
		String path = request.getSession().getServletContext().getRealPath("/uploads");
		int i = 0,m = 0;
		for(MultipartFile file : files){
			i++;
			String oname = file.getOriginalFilename();//获取原始文件名
			String ext = oname.substring(oname.lastIndexOf("."));
			String fname = System.currentTimeMillis()+"-"+i+ext;
			File dest = new File(path+"\\"+fname);
			try {
				file.transferTo(dest);
				m++;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return m;
	}
	
	@RequestMapping("/save")
	public boolean save(House bean){
		return biz.save(bean);
	}
	
	@RequestMapping("/enable")
	public boolean enable(int id,int status){
		return this.biz.enable(id, status);
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
