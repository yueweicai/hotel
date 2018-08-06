package com.orilore.biz;
import com.orilore.model.*;
import java.util.List;
import java.util.Map;
public interface IHpriceBiz{
	public boolean save(Hprice hprice);
	public boolean remove(Integer id);
	public Hprice find(Integer id);
	public Hprice find(Map<String,Object> map);
	public List<Hprice> query();
}