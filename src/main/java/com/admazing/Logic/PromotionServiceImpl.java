package com.admazing.Logic;

import java.util.ArrayList;
import java.util.List;

import com.admazing.PreferedCategoryModel;
import com.admazing.ProductModel;
import com.admazing.PromotionDetailedModel;
import com.admazing.PromotionModel;
import com.admazing.PromotionTypeModel;
import com.admazing.core.contracts.ProductRepository;
import com.admazing.core.contracts.PromotionRepository;
import com.admazing.core.contracts.PromotionService;
import com.admazing.core.contracts.PromotionTypeRepository;
import com.admazing.dataAccess.ProductRepositoryImpl;
import com.admazing.dataAccess.PromotionRepositoryImpl;
import com.admazing.dataAccess.PromotionTypeRepositoryImpl;

public class PromotionServiceImpl implements PromotionService {
	private PromotionRepository promotionRepository= new PromotionRepositoryImpl();
	private ProductRepository productRepository= new ProductRepositoryImpl(); 
	private PromotionTypeRepository promotionTypeRepository= new PromotionTypeRepositoryImpl(); 

	@Override
	public List<PromotionDetailedModel> getById(String idStore, String idCategory) {
		List<PromotionModel> promotions=promotionRepository.findById(idStore,idCategory);
		List<PromotionDetailedModel> promotionsDetailed = new ArrayList<PromotionDetailedModel>();
		if(promotions!=null){
			for (PromotionModel promotion : promotions) {
				promotionsDetailed.add(getPromotionDetailed(promotion));
			}
		}
		return promotionsDetailed;
	}
 	private PromotionDetailedModel getPromotionDetailed(PromotionModel promotion) {

		PromotionDetailedModel promotionDetailed= null;
		if(promotion!=null){
			promotionDetailed= new PromotionDetailedModel();
			ProductModel product=productRepository.findById(promotion.getIdProduct());
			PromotionTypeModel promotionType= promotionTypeRepository.findById(promotion.getIdTypePromotion());
			if(product!= null && promotionType!=null){
				promotionDetailed.setPromotion(promotion);
				promotionDetailed.setProduct(product);
				promotionDetailed.setPromotionType(promotionType);				
			}			
		}
		return promotionDetailed;
	}


}
