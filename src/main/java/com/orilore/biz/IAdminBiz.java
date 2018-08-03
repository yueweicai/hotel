package com.orilore.biz;
import com.orilore.model.*;

import java.sql.SQLException;
import java.util.List;
public interface IAdminBiz{
	public boolean save(Admin admin,List<Integer> powers) throws SQLException;
	public boolean remove(Integer id);
	public Admin find(Integer id);
	public List<Admin> query();
	public Admin get(Admin bean);
}