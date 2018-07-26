package com.orilore.mapper;
import java.util.List;
import com.orilore.model.*;
public interface MsMapper{
	public boolean insert(Ms bean);
	public Ms selectOne(int id);
	public boolean delete(int id);
	public List<Ms> select();
	public boolean update(Ms bean);
}