package com.orilore.biz;
import com.orilore.model.*;
import com.orilore.mapper.*;
import java.util.*;
public class MessageBiz implements IMessageBiz{

	private MessageMapper mapper  = null;

	@Override
	public boolean save(Message bean) {
		if(bean.getId()!=null){
			return this.mapper.update(bean);
		}else{
			return this.mapper.insert(bean);
		}
	}

	@Override
	public boolean remove(Integer id) {
		return this.mapper.delete(id);
	}

	@Override
	public Message find(Integer id) {
		return this.mapper.selectOne(id);
	}

	@Override
	public List<Message> query() {
		return this.mapper.select();
	}
}
