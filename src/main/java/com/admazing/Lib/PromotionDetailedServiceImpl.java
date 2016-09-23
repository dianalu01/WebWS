package com.admazing.Lib;

import com.admazing.ProductModel;
import com.admazing.PromotionDetailedModel;
import com.admazing.PromotionModel;
import com.admazing.PromotionTypeModel;
import com.admazing.core.contracts.ProductRepository;
import com.admazing.core.contracts.PromotionDetailedService;
import com.admazing.core.contracts.PromotionTypeRepository;
import com.admazing.dataAccess.ProductRepositoryImpl;
import com.admazing.dataAccess.PromotionTypeRepositoryImpl;

public class PromotionDetailedServiceImpl implements PromotionDetailedService {

	private ProductRepository productRepository= new ProductRepositoryImpl(); 
	private PromotionTypeRepository promotionTypeRepository= new PromotionTypeRepositoryImpl(); 
	
	@Override
	public PromotionDetailedModel getByPromotion(PromotionModel promotion) {

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
