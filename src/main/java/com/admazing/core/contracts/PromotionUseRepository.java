package com.admazing.core.contracts;

import java.util.List;

import com.admazing.PromotionUseModel;

public interface PromotionUseRepository {
	boolean save(String idUser,String idPromotion);
	List<PromotionUseModel> findById(String idUser);
}
