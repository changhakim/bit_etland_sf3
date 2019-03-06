package com.bit_etland.web.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bit_etland.web.domain.CategoryDTO;
import com.bit_etland.web.proxy.Proxy;

@Repository
public class CategoryMapperImpl implements CategoryMapper{

	@Override
	public void createCategory(CategoryDTO cate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CategoryDTO> seletCategoryList(Proxy pxy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countCategories(Proxy pxy) {
		// TODO Auto-generated method stub
		return 0;
	}

}
