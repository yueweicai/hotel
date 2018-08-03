package com.orilore.biz;
import com.orilore.model.*;
import com.orilore.mapper.*;

import java.sql.SQLException;
import java.util.*;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Service
public class AdminBiz implements IAdminBiz{
	@Resource
	private AdminMapper mapper;
	@Resource
	private RuleMapper dao;
	
	
	//isolation:事务的隔离级别,用于解决数据的脏读，幻读，不可重复读
	//propagation:事务传播行为/用于解决事务在出现嵌套情况下的处理方案
	//timeout:事务执行的超时时间
	//rollbackFor:事务的回滚原则
	//readOnly:只读状态
	@Override
	//该方法必须保证所有的sql语句都能成功执行
	//只要有任意一条sql执行失败，将会全部回滚
	@Transactional(propagation=Propagation.REQUIRED,rollbackFor=SQLException.class)
	public boolean save(Admin bean,List<Integer> powers) throws SQLException {
		boolean flag = true;
		if(bean.getId()!=null){
			if(this.mapper.update(bean)){
				if(this.dao.delete(bean.getId())){
					int aid = bean.getId();
					for(int pid : powers){
						Rule rule = new Rule(aid,pid);
						if(!dao.insert(rule)){
							flag = false;
							throw new SQLException("用户权限保存失败");
						}
					}
				}else{
					flag = false;
				}
			}else{
				flag = false;
			}
		}else{
			if(this.mapper.insert(bean)){
				int aid = bean.getId();
				for(int pid : powers){
					Rule rule = new Rule(aid,pid);
					if(!dao.insert(rule)){
						flag = false;
						throw new SQLException("用户权限保存失败");
					}
				}
			}else{
				flag = false;
			}
		}
		return flag;
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

	@Override
	public Admin get(Admin bean) {
		return this.mapper.selectAdmin(bean);
	}
}
