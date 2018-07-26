package com.orilore.mapper;
import java.util.List;
import com.orilore.model.*;
public interface ReserveMapper{
	public boolean insert(Reserve bean);
	public Reserve selectOne(Integer id);
	public boolean delete(Integer id);
	public List<Reserve> select();
	public boolean update(Reserve bean);
}