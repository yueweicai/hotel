package com.orilore.biz;
import com.orilore.model.*;
import com.orilore.mapper.*;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class CompanyBiz implements ICompanyBiz{
	@Resource
	private CompanyMapper mapper;
	
	/**
	 * 更新酒店基本信息
	 */
	@Override
	public boolean save(Company bean) {
		return this.mapper.update(bean);
	}

	@Override
	public Company find() {
		return this.mapper.selectOne();
	}
	/**
	 * 更新酒店图片信息
	 */
	@Override
	public boolean saveImage(Company bean) {
		return this.mapper.updateImage(bean);
	}
}
