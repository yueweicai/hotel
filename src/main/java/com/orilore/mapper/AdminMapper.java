package com.orilore.mapper;
import java.util.List;
import com.orilore.model.*;
public interface AdminMapper{
	public boolean insert(Admin bean);
	public Admin selectOne(Integer id);
	public boolean delete(Integer id);
	public List<Admin> select();
	public boolean update(Admin bean);
}