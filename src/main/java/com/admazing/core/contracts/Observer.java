package com.admazing.core.contracts;

import com.admazing.core.contracts.PromotionUseService;

public abstract class Observer {
	protected static PromotionUseService subject;
	public abstract void update(String idUser,String idPromotion);

}
