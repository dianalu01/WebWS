package com.admazing.Logic;

import java.util.List;

import com.admazing.PromotionModel;
import com.admazing.PromotionUseModel;
import com.admazing.core.contracts.Observer;
import com.admazing.core.contracts.PreferenceService;
import com.admazing.core.contracts.PromotionService;
import com.admazing.core.contracts.PromotionUseService;

public class categoryObserver extends Observer{
	
	private PreferenceService preferenceService;
	private PromotionService promotionService;
	private PromotionUseService promotionUseService;
	
	public categoryObserver(PromotionUseService subject){
		preferenceService = new PreferenceServiceImpl();
		promotionService= new PromotionServiceImpl();
		promotionUseService = new PromotionUseServiceImpl();
			
		this.subject=subject;
		this.subject.attach(this);
	}

	@Override
	public void update(String idUser,String idPromotion) {
		PromotionModel promotionUsed=promotionService.findById(idPromotion);
		if(!preferenceService.exist(idUser, promotionUsed.getIdCategory())){		
			if(countPromotionsUsed(idUser,promotionUsed.getIdCategory())>=5){
				preferenceService.save(idUser,promotionUsed.getIdCategory());				
			}				
		}				
	}
	
	private int countPromotionsUsed (String idUser, String idCategory){
		int nPromotionUsed=0;
		List<PromotionUseModel> promotionsUse = promotionUseService.getById(idUser);
		for(PromotionUseModel promotionUse : promotionsUse){
			PromotionModel promotion=promotionService.findById(promotionUse.getIdPromotion());
			if(promotion.getIdCategory().compareTo(idCategory)==0){
				nPromotionUsed++;
			}
		}
		return nPromotionUsed;
	}

	

}
