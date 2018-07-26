package com.orilore.mapper;
import java.util.List;
import com.orilore.model.*;
public interface MessageMapper{
	public boolean insert(Message bean);
	public Message selectOne(Integer id);
	public boolean delete(Integer id);
	public List<Message> select();
	public boolean update(Message bean);
}