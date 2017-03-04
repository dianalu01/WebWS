package com.admazing.core.contracts;

import java.util.List;

import com.admazing.PromotionModel;

public interface PromotionRepository {
	List<PromotionModel> findById(String idStore, String idCategory);
	PromotionModel findById(String idPromotion);
}
