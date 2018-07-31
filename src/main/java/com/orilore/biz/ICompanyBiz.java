package com.orilore.biz;
import com.orilore.model.*;

public interface ICompanyBiz{
	public boolean save(Company bean);
	public boolean saveImage(Company bean);
	public Company find();
}