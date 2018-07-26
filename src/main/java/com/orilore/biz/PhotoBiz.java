package com.orilore.biz;
import com.orilore.model.*;
import com.orilore.mapper.*;
import java.util.*;
public class PhotoBiz implements IPhotoBiz{

	private PhotoMapper mapper  = null;

	@Override
	public boolean save(Photo bean) {
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
	public Photo find(Integer id) {
		return this.mapper.selectOne(id);
	}

	@Override
	public List<Photo> query() {
		return this.mapper.select();
	}
}
