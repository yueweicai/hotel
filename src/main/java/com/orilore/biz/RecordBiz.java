package com.orilore.biz;
import com.orilore.model.*;
import com.orilore.mapper.*;
import java.util.*;
public class RecordBiz implements IRecordBiz{

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
}
