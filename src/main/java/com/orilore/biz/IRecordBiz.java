package com.orilore.biz;
import com.orilore.model.*;
import java.util.List;
public interface IRecordBiz{
	public boolean save(Record record);
	public boolean remove(Integer id);
	public Record find(Integer id);
	public List<Record> query();
}