package com.bit_etland.web.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bit_etland.web.domain.CategoryDTO;
import com.bit_etland.web.proxy.Proxy;
@Component
public interface CategoryMapper {

	public void createCategory(CategoryDTO cate);
	public List<CategoryDTO> seletCategoryList(Proxy pxy);
	
	public int countCategories(Proxy pxy);
}
