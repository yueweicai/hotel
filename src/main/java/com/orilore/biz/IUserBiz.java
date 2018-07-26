package com.orilore.biz;
import com.orilore.model.*;
import java.util.List;
public interface IUserBiz{
	public boolean save(User user);
	public boolean remove(Integer id);
	public User find(Integer id);
	public List<User> query();
}