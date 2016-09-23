package com.admazing.Logic;

import java.util.ArrayList;
import java.util.List;

import com.admazing.CouponBookModel;
import com.admazing.PromotionDetailedModel;
import com.admazing.PromotionModel;
import com.admazing.StoreModel;
import com.admazing.Lib.PromotionDetailedServiceImpl;
import com.admazing.core.contracts.CommercialAreaRepository;
import com.admazing.core.contracts.CouponBookRepository;
import com.admazing.core.contracts.CouponBookService;
import com.admazing.core.contracts.PromotionDetailedService;
import com.admazing.core.contracts.PromotionRepository;
import com.admazing.core.contracts.StoreRepository;
import com.admazing.dataAccess.CommercialAreaRepositoryImpl;
import com.admazing.dataAccess.CouponBookRepositoryImpl;
import com.admazing.dataAccess.PromotionRepositoryImpl;
import com.admazing.dataAccess.StoreRepositoryImpl;

public class CouponBookServiceImpl implements CouponBookService {

	private StoreRepository storeRepository= new StoreRepositoryImpl();
	private PromotionRepository promotionRepository= new PromotionRepositoryImpl();
	private CommercialAreaRepository commercialAreaRepository= new CommercialAreaRepositoryImpl();
	private CouponBookRepository couponBookRepository = new CouponBookRepositoryImpl(); 
	private PromotionDetailedService promotionDetailedService= new PromotionDetailedServiceImpl();
	
	@Override
	public List<PromotionDetailedModel> getByCommercialArea(String idUser) {
		
		String idCommercialArea=commercialAreaRepository.getIdLastCommercialArea(idUser);
		List<CouponBookModel> couponBook=couponBookRepository.getAllById(idUser);
		List<StoreModel> stores=storeRepository.getAllbyCommercialArea(idCommercialArea);
		List<PromotionDetailedModel> couponsBookDetailed = new ArrayList<PromotionDetailedModel>();
		if(couponBook!=null&&stores!=null){
			for (CouponBookModel coupon : couponBook) {
				PromotionDetailedModel promotionDetailed=promotionDetailed(coupon,stores);
				if(promotionDetailed!=null){
					couponsBookDetailed.add(promotionDetailed);
				}
			}
		}
		return couponsBookDetailed;
	}
	private PromotionDetailedModel promotionDetailed(CouponBookModel coupon, List<StoreModel> stores){
		PromotionModel promotion=promotionRepository.findById(coupon.getIdPromotion());
		for(StoreModel store:stores){
			if(promotion!=null && promotion.getIdStore().compareTo(store.getIdStore())==0){
				PromotionDetailedModel promotionDetailed=promotionDetailedService.getByPromotion(promotion);
				return promotionDetailed;
				
			}
		}
		return null;
	}

}
