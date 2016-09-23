package com.admazing.core.contracts;

import java.util.List;

import com.admazing.PromotionUseModel;

public interface PromotionUseService {
	
	boolean save (String idUser, String idPromotion);
	List<PromotionUseModel> getById(String idUser);
	void attach(Observer observer);
		
}
