package com.bit_etland.web.service;

import java.util.List;

import com.bit_etland.web.domain.CategoryDTO;
import com.bit_etland.web.proxy.Proxy;


public interface CategoryService {

	public void registCategory(CategoryDTO cate);
	public List<CategoryDTO> bringCategoryList(Proxy pxy);
	
	public int countCategories(Proxy pxy);
}
