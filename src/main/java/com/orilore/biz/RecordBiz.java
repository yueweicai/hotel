package com.orilore.biz;
import com.orilore.model.*;
import com.orilore.mapper.*;
import java.util.*;
public class RecordBiz implements IRecordBiz{
	/**
	 * 	APIID：C70206572

		APIKEY：0d0854e0487ce92f6b205e7f5be1af10 
	 */
	private RecordMapper mapper  = null;

	@Override
	public boolean save(Record bean) {
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
	public Record find(Integer id) {
		return this.mapper.selectOne(id);
	}

	@Override
	public List<Record> query() {
		return this.mapper.select();
	}

	@Override
	public List<HouseState> state(String year) {
		return this.mapper.selectPersons(year);
	}
}
