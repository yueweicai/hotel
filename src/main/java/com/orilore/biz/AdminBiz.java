package com.orilore.biz;
import com.orilore.model.*;
import com.orilore.mapper.*;
import java.util.*;
public class AdminBiz implements IAdminBiz{

	private AdminMapper mapper  = null;

	@Override
	public boolean save(Admin bean) {
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
	public Admin find(Integer id) {
		return this.mapper.selectOne(id);
	}

	@Override
	public List<Admin> query() {
		return this.mapper.select();
	}
}
