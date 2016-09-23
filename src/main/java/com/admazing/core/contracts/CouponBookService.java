package com.admazing.core.contracts;

import java.util.List;

import com.admazing.PromotionDetailedModel;


public interface CouponBookService {
	
	List<PromotionDetailedModel> getByCommercialArea(String idUser);

}
