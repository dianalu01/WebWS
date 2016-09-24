package com.admazing.Logic;

import java.util.List;

import com.admazing.PromotionModel;
import com.admazing.PromotionUseModel;
import com.admazing.core.contracts.Observer;
import com.admazing.core.contracts.PreferenceRepository;
import com.admazing.core.contracts.PromotionRepository;
import com.admazing.core.contracts.PromotionUseRepository;
import com.admazing.core.contracts.PromotionUseService;
import com.admazing.dataAccess.PreferenceRepositoryImpl;
import com.admazing.dataAccess.PromotionRepositoryImpl;
import com.admazing.dataAccess.PromotionUseRepositoryImpl;

public class categoryObserver extends Observer{
	
	private PreferenceRepository preferenceRepository;
	private PromotionRepository promotionRepository;
	private PromotionUseRepository promotionUseRepository;
	
	public categoryObserver(PromotionUseService subject){
		preferenceRepository = new PreferenceRepositoryImpl();
		promotionRepository= new PromotionRepositoryImpl();
		promotionUseRepository = new PromotionUseRepositoryImpl();
			
		Observer.subject=subject;
		this.subject.attach(this);
	}

	@Override
	public void update(String idUser,String idPromotion) {
		PromotionModel promotionUsed=promotionRepository.findById(idPromotion);
		if(!preferenceRepository.exist(idUser, promotionUsed.getIdCategory())){		
			if(countPromotionsUsed(idUser,promotionUsed.getIdCategory())>=5){
				preferenceRepository.save(idUser,promotionUsed.getIdCategory());				
			}				
		}				
	}
	
	private int countPromotionsUsed (String idUser, String idCategory){
		int nPromotionUsed=0;
		List<PromotionUseModel> promotionsUse = promotionUseRepository.findById(idUser);
		for(PromotionUseModel promotionUse : promotionsUse){
			PromotionModel promotion=promotionRepository.findById(promotionUse.getIdPromotion());
			if(promotion.getIdCategory().compareTo(idCategory)==0){
				nPromotionUsed++;
			}
		}
		return nPromotionUsed;
	}

	
}
