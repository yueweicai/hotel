package com.orilore.mapper;
import java.util.List;
import com.orilore.model.*;
public interface UserMapper{
	public boolean insert(User bean);
	public User selectOne(Integer id);
	public boolean delete(Integer id);
	public List<User> select();
	public boolean update(User bean);
}