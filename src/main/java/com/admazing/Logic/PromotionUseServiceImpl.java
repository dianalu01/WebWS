package com.admazing.Logic;

import java.util.ArrayList;
import java.util.List;

import com.admazing.PromotionUseModel;
import com.admazing.core.contracts.Observer;
import com.admazing.core.contracts.PromotionUseRepository;
import com.admazing.core.contracts.PromotionUseService;
import com.admazing.dataAccess.PromotionUseRepositoryImpl;

public class PromotionUseServiceImpl implements PromotionUseService {

	private PromotionUseRepository promotionUseRepository= new PromotionUseRepositoryImpl();	
	private List<Observer> observers = new ArrayList<Observer>();
	
	public PromotionUseServiceImpl() {
		new categoryObserver(this);
	}
	@Override
	public boolean save(String idUser, String idPromotion) {
		boolean result=false;
		boolean resultSavePromotionUse=	promotionUseRepository.save(idUser,idPromotion);
		if (resultSavePromotionUse){
			result= true;
			notifyAllObservers(idUser,idPromotion);
		}
		return result;
	}
	@Override
	public List<PromotionUseModel> getById(String idUser) {
		return promotionUseRepository.findById(idUser);
	}
	
	public void attach(Observer observer){
		observers.add(observer);		
	}
	
	private void notifyAllObservers(String idUser,String idPromotion){
		for (Observer observer : observers) {
			observer.update(idUser,idPromotion);
			}
	}

}
