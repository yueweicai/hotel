package com.orilore.mapper;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.orilore.model.*;
@Mapper
public interface ReserveMapper{
	public boolean insert(Reserve bean);
	public Reserve selectOne(Integer id);
	public boolean delete(Integer id);
	public List<Reserve> select(Map<String,Object> map);
	public boolean update(Reserve bean);
}