package com.admazing.core.contracts;

import java.util.List;

import com.admazing.CategoryModel;
import com.admazing.PreferedCategoryModel;


public interface CategoryService {
	List<PreferedCategoryModel> getAllPrefered(String idUser);
	List<CategoryModel> getById(String idStore);
	List<CategoryModel> getByPreference(String idStore, String idUser);
	

}
