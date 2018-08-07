package com.orilore.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.orilore.model.*;
@Mapper
public interface RecordMapper{
	public boolean insert(Record bean);
	public Record selectOne(Integer id);
	public boolean delete(Integer id);
	public List<Record> select();
	public boolean update(Record bean);
}