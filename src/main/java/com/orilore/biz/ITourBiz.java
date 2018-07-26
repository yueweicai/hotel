package com.orilore.biz;
import com.orilore.model.*;
import java.util.List;
public interface ITourBiz{
	public boolean save(Tour tour);
	public boolean remove(Integer id);
	public Tour find(Integer id);
	public List<Tour> query();
}