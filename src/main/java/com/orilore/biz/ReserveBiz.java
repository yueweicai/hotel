package com.orilore.biz;
import com.orilore.model.*;
import com.orilore.mapper.*;
import java.util.*;
public class ReserveBiz implements IReserveBiz{

	private ReserveMapper mapper  = null;

	@Override
	public boolean save(Reserve bean) {
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
	public Reserve find(Integer id) {
		return this.mapper.selectOne(id);
	}

	@Override
	public List<Reserve> query() {
		return this.mapper.select();
	}
}
