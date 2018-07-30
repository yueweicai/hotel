package com.orilore.util;

import java.io.File;
import java.util.Random;

import org.springframework.web.multipart.MultipartFile;
/**
 * 文件上传工具类
 * @author yue
 */
public class Uploader {
	/**
	 * 文件上传方法
	 * @param file
	 * @param path
	 * @return String
	 */
	public static String upload(MultipartFile file,String path){
		//获取文件的原始名称
		String oname = file.getOriginalFilename();
		//获取文件的扩展名
		String ext = oname.substring(oname.lastIndexOf("."));
		//使用时间戳算法生成新的文件名称
		Random rd = new Random();
		int num = Math.abs(rd.nextInt())%10000;
		String fname = System.currentTimeMillis()+"-"+num+ext;
		//构建空的目标文件
		File dest = new File(path+"\\"+fname);
		try {
			//将用户上传到服务器内存中的文件转存成物理文件
			file.transferTo(dest);
			return fname;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
