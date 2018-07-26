package com.orilore.biz;
import com.orilore.model.*;
import com.orilore.mapper.*;
import java.util.*;
public class MsBiz implements IMsBiz{

	private MsMapper mapper  = null;

	@Override
	public boolean save(Ms bean) {
		return false;
	}

	@Override
	public boolean remove(int id) {
		return this.mapper.delete(id);
	}

	@Override
	public Ms find(int id) {
		return this.mapper.selectOne(id);
	}

	@Override
	public List<Ms> query() {
		return this.mapper.select();
	}
}
