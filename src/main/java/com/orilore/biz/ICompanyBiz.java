package com.orilore.biz;
import com.orilore.model.*;
import java.util.List;
public interface ICompanyBiz{
	public boolean save(Company company);
	public boolean remove(Integer id);
	public Company find(Integer id);
	public List<Company> query();
}