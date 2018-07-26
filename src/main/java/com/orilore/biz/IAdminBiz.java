package com.orilore.biz;
import com.orilore.model.*;
import java.util.List;
public interface IAdminBiz{
	public boolean save(Admin admin);
	public boolean remove(Integer id);
	public Admin find(Integer id);
	public List<Admin> query();
}