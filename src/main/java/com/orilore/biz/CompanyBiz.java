package com.orilore.biz;
import com.orilore.model.*;
import com.orilore.mapper.*;
import java.util.*;
public class CompanyBiz implements ICompanyBiz{

	private CompanyMapper mapper  = null;

	@Override
	public boolean save(Company bean) {
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
	public Company find(Integer id) {
		return this.mapper.selectOne(id);
	}

	@Override
	public List<Company> query() {
		return this.mapper.select();
	}
}
