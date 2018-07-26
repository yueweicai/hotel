package com.orilore.mapper;
import java.util.List;
import com.orilore.model.*;
public interface PhotoMapper{
	public boolean insert(Photo bean);
	public Photo selectOne(Integer id);
	public boolean delete(Integer id);
	public List<Photo> select();
	public boolean update(Photo bean);
}