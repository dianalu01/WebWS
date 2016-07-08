package com.admazing.core.contracts;

import java.util.List;

import com.admazing.CategoryModel;

public interface CategoryRepository {
	List<CategoryModel> findById(String idStore);
}
