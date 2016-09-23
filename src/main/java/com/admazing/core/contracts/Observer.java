package com.admazing.core.contracts;

import com.admazing.Logic.PromotionUseServiceImpl;

public abstract class Observer {
	protected PromotionUseServiceImpl subject;
	public abstract void update(String idUser,String idPromotion);

}
