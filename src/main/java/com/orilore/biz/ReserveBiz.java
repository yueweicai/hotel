package com.orilore.biz;
import com.orilore.model.*;
import com.orilore.mapper.*;
import java.util.*;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Service
public class ReserveBiz implements IReserveBiz{
	@Resource
	private ReserveMapper mapper;
	@Resource
	private RecordMapper rmpper;

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
	public List<Reserve> query(Map<String,Object> map) {
		return this.mapper.select(map);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public boolean addrecord(Integer id) {
		Reserve bean = this.mapper.selectOne(id);
		if(this.mapper.delete(id)){
			Record rec = new Record();
			rec.setCustom(bean.getCustom());
			rec.setPhone(bean.getPhone());
			rec.setHid(bean.getHid());
			rec.setPersons(bean.getPersons());
			rec.setLtime(bean.getLdate());
			rec.setPrice(bean.getPrice());
			rec.setTotal(bean.getTotal());
			if(this.rmpper.insert(rec)){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
}
