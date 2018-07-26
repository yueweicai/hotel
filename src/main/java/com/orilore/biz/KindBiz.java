package com.orilore.biz;
import com.orilore.model.*;
import com.orilore.mapper.*;
import java.util.*;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
@Service
public class KindBiz implements IKindBiz{
	@Resource
	private KindMapper mapper;

	@Override
	public boolean save(Kind bean) {
		if(bean.getId()!=null){
			return this.mapper.update(bean);
		}else{
			return this.mapper.insert(bean);
		}
	}

	@Override
	public boolean remove(Integer id) {
		return this.mapper.delete(id);
	}

	@Override
	public Kind find(Integer id) {
		return this.mapper.selectOne(id);
	}

	@Override
	public List<Kind> query() {
		return this.mapper.select();
	}
}
