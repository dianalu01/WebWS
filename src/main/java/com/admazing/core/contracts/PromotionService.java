package com.admazing.core.contracts;

import java.util.List;

import com.admazing.PromotionDetailedModel;


public interface PromotionService {
	List<PromotionDetailedModel> getById(String idStore,String idCategory);

}
