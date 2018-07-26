package com.orilore.biz;
import com.orilore.model.*;
import java.util.List;
public interface IPhotoBiz{
	public boolean save(Photo photo);
	public boolean remove(Integer id);
	public Photo find(Integer id);
	public List<Photo> query();
}