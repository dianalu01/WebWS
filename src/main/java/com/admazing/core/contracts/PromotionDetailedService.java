package com.admazing.core.contracts;


import com.admazing.PromotionDetailedModel;
import com.admazing.PromotionModel;


public interface PromotionDetailedService {
	PromotionDetailedModel getByPromotion(PromotionModel promotion);

}
