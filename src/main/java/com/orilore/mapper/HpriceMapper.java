package com.orilore.mapper;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import com.orilore.model.*;

@Mapper
public interface HpriceMapper{
	public boolean insert(Hprice bean);
	public Hprice selectOne(Integer id);
	public Hprice select2(Map<String,Object> map);
	public boolean delete(Integer id);
	public List<Hprice> select();
	public boolean update(Hprice bean);
}