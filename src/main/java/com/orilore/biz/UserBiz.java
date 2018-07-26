package com.orilore.biz;
import com.orilore.model.*;
import com.orilore.mapper.*;
import java.util.*;
public class UserBiz implements IUserBiz{

	private UserMapper mapper  = null;

	@Override
	public boolean save(User bean) {
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
	public User find(Integer id) {
		return this.mapper.selectOne(id);
	}

	@Override
	public List<User> query() {
		return this.mapper.select();
	}
}
