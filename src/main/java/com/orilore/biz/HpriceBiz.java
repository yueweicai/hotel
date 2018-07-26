package com.orilore.biz;
import com.orilore.model.*;
import com.orilore.mapper.*;
import java.util.*;
public class HpriceBiz implements IHpriceBiz{

	private HpriceMapper mapper  = null;

	@Override
	public boolean save(Hprice bean) {
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
	public Hprice find(Integer id) {
		return this.mapper.selectOne(id);
	}

	@Override
	public List<Hprice> query() {
		return this.mapper.select();
	}
}
