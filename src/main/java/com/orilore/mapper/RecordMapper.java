package com.orilore.mapper;
import java.util.List;
import com.orilore.model.*;
public interface RecordMapper{
	public boolean insert(Record bean);
	public Record selectOne(Integer id);
	public boolean delete(Integer id);
	public List<Record> select();
	public boolean update(Record bean);
}