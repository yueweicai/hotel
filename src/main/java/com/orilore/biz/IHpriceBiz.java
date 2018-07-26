package com.orilore.biz;
import com.orilore.model.*;
import java.util.List;
public interface IHpriceBiz{
	public boolean save(Hprice hprice);
	public boolean remove(Integer id);
	public Hprice find(Integer id);
	public List<Hprice> query();
}