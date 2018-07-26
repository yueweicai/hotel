package com.orilore.biz;
import com.orilore.model.*;
import java.util.List;
public interface IReserveBiz{
	public boolean save(Reserve reserve);
	public boolean remove(Integer id);
	public Reserve find(Integer id);
	public List<Reserve> query();
}