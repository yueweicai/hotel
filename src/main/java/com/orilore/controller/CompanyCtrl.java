package com.orilore.controller;

import java.io.File;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.orilore.biz.ICompanyBiz;
import com.orilore.model.Company;
import com.orilore.util.Uploader;

@RestController
@RequestMapping("/company")
public class CompanyCtrl {
	@Resource
	private ICompanyBiz biz;
	
	@RequestMapping("/uploads")
	public boolean saveimgs(MultipartFile[] files,HttpServletRequest request){
		String path = request.getSession().getServletContext().getRealPath("/images");
		File fp = new File(path);
		if(!fp.exists()){
			fp.mkdir();
		}
		Company bean = new Company();
		bean.setId(1);
		for(int i=0;i<files.length;i++){
			MultipartFile file = files[i];
			if(file!=null && file.getSize()>0){
				String fname = Uploader.upload(file, path);
				if(fname!=null){
					switch(i){
					case 0:
						bean.setPica(fname);
						break;
					case 1:
						bean.setPicb(fname);
						break;
					case 2:
						bean.setPicc(fname);
						break;
					case 3:
						bean.setPicd(fname);
						break;
					case 4:
						bean.setPice(fname);
						break;
					case 5:
						bean.setPicf(fname);
						break;	
					}
				}
			}
		}
		return biz.saveImage(bean);
	}
	
	@RequestMapping("/find")
	public Company find(){
		return biz.find();
	}
	
	@RequestMapping("/save")
	public boolean save(Company bean){
		return biz.save(bean);
	}
}
