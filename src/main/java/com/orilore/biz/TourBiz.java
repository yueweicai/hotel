package com.orilore.biz;
import com.orilore.model.*;
import com.orilore.mapper.*;
import java.util.*;
public class TourBiz implements ITourBiz{

	private TourMapper mapper  = null;

	@Override
	public boolean save(Tour bean) {
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
	public Tour find(Integer id) {
		return this.mapper.selectOne(id);
	}

	@Override
	public List<Tour> query() {
		return this.mapper.select();
	}
}
