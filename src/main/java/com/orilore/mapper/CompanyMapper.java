package com.orilore.mapper;
import java.util.List;
import com.orilore.model.*;
public interface CompanyMapper{
	public boolean insert(Company bean);
	public Company selectOne(Integer id);
	public boolean delete(Integer id);
	public List<Company> select();
	public boolean update(Company bean);
}