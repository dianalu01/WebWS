package com.admazing.Lib;

import java.util.List;

import com.admazing.PromotionModel;
import com.admazing.PromotionUseModel;
import com.admazing.core.contracts.PreferenceRepository;
import com.admazing.core.contracts.PromotionRepository;
import com.admazing.core.contracts.PromotionUseRepository;
import com.admazing.dataAccess.PreferenceRepositoryImpl;
import com.admazing.dataAccess.PromotionRepositoryImpl;
import com.admazing.dataAccess.PromotionUseRepositoryImpl;

public class categoryObserver extends Observer{
	
	private PreferenceRepository preferenceRepository;
	private PromotionRepository promotionRepository;
	private PromotionUseRepository promotionUseRepository;
	
	public categoryObserver(AdmazingWSImpl subject){
		preferenceRepository = new PreferenceRepositoryImpl();
		promotionRepository= new PromotionRepositoryImpl();
		promotionUseRepository = new PromotionUseRepositoryImpl();
			
		this.subject=subject;
		this.subject.attach(this);
	}

	@Override
	public void update(String idUser,String idPromotion) {
		System.out.println("UPDATE");
		PromotionModel promotionUsed=promotionRepository.findById(idPromotion);
		if(!preferenceRepository.exist(idUser, promotionUsed.getIdCategory())){		
			System.out.println("No existe");
			System.out.println(idUser+"           "+promotionUsed.getIdCategory());
			if(countPromotionsUsed(idUser,promotionUsed.getIdCategory())>=5){
				System.out.println("Guardar");
				boolean result =preferenceRepository.save(idUser,promotionUsed.getIdCategory());
				System.out.println(result);
			}				
		}				
	}
	
	private int countPromotionsUsed (String idUser, String idCategory){
		int nPromotionUsed=0;
		List<PromotionUseModel> promotionsUse = promotionUseRepository.findById(idUser);
		for(PromotionUseModel promotionUse : promotionsUse){
			PromotionModel promotion=promotionRepository.findById(promotionUse.getIdPromotion());
System.out.println(promotion.getIdCategory()+"_____"+idCategory);
			if(promotion.getIdCategory().compareTo(idCategory)==0){
				nPromotionUsed++;
			}
		}
		System.out.println(nPromotionUsed);
		return nPromotionUsed;
	}

	

}
