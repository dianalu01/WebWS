package com.admazing.core.contracts;

import com.admazing.Lib.AdmazingWSImpl;

public abstract class Observer {
	protected AdmazingWSImpl subject;
	public abstract void update(String idUser,String idPromotion);

}
