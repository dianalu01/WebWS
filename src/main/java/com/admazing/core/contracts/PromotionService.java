package com.admazing.core.contracts;

import java.util.List;

import com.admazing.PromotionDetailedModel;
import com.admazing.PromotionModel;


public interface PromotionService {
	List<PromotionDetailedModel> getDetailedById(String idStore,String idCategory);
	PromotionModel findById(String idPromotion);

}
