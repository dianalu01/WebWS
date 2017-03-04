package com.admazing.Logic;

import java.util.ArrayList;
import java.util.List;

import com.admazing.PromotionDetailedModel;
import com.admazing.PromotionModel;
import com.admazing.Lib.PromotionDetailedServiceImpl;
import com.admazing.core.contracts.PromotionDetailedService;
import com.admazing.core.contracts.PromotionRepository;
import com.admazing.core.contracts.PromotionService;
import com.admazing.dataAccess.PromotionRepositoryImpl;

public class PromotionServiceImpl implements PromotionService {
	private PromotionRepository promotionRepository= new PromotionRepositoryImpl();
	private PromotionDetailedService promotionDetailedService= new PromotionDetailedServiceImpl();
	@Override
	public List<PromotionDetailedModel> getDetailedById(String idStore, String idCategory) {
		List<PromotionModel> promotions=promotionRepository.findById(idStore,idCategory);
		List<PromotionDetailedModel> promotionsDetailed = new ArrayList<PromotionDetailedModel>();
		if(promotions!=null){
			for (PromotionModel promotion : promotions) {
				PromotionDetailedModel promotionDetailed=promotionDetailedService.getByPromotion(promotion);
				promotionsDetailed.add(promotionDetailed);
			}
		}
		return promotionsDetailed;
	}
	@Override
	public PromotionModel findById(String idPromotion) {
		return promotionRepository.findById(idPromotion);
		
	}


}
