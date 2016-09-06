package com.admazing.Lib;

public abstract class Observer {
	protected AdmazingWSImpl subject;
	public abstract void update(String idUser,String idPromotion);

}
