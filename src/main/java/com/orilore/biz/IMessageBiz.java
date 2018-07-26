package com.orilore.biz;
import com.orilore.model.*;
import java.util.List;
public interface IMessageBiz{
	public boolean save(Message message);
	public boolean remove(Integer id);
	public Message find(Integer id);
	public List<Message> query();
}