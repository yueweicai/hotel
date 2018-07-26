package com.orilore.mapper;
import java.util.List;
import com.orilore.model.*;
public interface TourMapper{
	public boolean insert(Tour bean);
	public Tour selectOne(Integer id);
	public boolean delete(Integer id);
	public List<Tour> select();
	public boolean update(Tour bean);
}