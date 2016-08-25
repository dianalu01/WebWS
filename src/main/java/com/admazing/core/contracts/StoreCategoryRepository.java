package com.admazing.core.contracts;

import java.util.List;

import com.admazing.StoreCategoryModel;

public interface StoreCategoryRepository {
	List<StoreCategoryModel> findById(String idStore);
}
