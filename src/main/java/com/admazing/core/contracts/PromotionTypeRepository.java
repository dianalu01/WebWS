package com.admazing.core.contracts;

import com.admazing.PromotionTypeModel;

public interface PromotionTypeRepository {
	
	PromotionTypeModel findById(String idPromotionType);
}
