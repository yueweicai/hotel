package com.orilore.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.orilore.model.*;
@Mapper
public interface KindMapper{
	public boolean insert(Kind bean);
	public Kind selectOne(Integer id);
	public boolean delete(Integer id);
	public List<Kind> select();
	public boolean update(Kind bean);
}