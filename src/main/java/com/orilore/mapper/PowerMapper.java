package com.orilore.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import com.orilore.model.Power;

@Mapper
public interface PowerMapper {
	public boolean insert(Power bean);
	public boolean update(Power bean);
	public boolean updateXh(Map<String,Integer> map);
	public boolean delete(Integer id);
	public Power selectOne(Integer id);
	public List<Power> select();
	public List<Power> select2();
}
