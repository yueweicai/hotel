package com.orilore.mapper;
import java.util.List;
import com.orilore.model.*;
public interface HpriceMapper{
	public boolean insert(Hprice bean);
	public Hprice selectOne(Integer id);
	public boolean delete(Integer id);
	public List<Hprice> select();
	public boolean update(Hprice bean);
}