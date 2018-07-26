package com.orilore.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orilore.biz.IKindBiz;
import com.orilore.model.Kind;

@RestController
@RequestMapping("/kind")
public class KindCtrl {
	@Resource
	private IKindBiz biz;
	
	@RequestMapping("/query")
	public List<Kind> query(){
		return biz.query();
	}
}
