package com.admazing.Lib;


import java.util.List;

import com.admazing.AdmazingPortType;
import com.admazing.CategoryModel;
import com.admazing.CommercialAreaModel;
import com.admazing.CouponBookModel;
import com.admazing.DeleteFromCouponBookRequest;
import com.admazing.DeleteFromCouponBookResponse;
import com.admazing.GetAllStoresRequest;
import com.admazing.GetAllStoresResponse;
import com.admazing.GetAllStoresbyCommercialAreaRequest;
import com.admazing.GetAllStoresbyCommercialAreaResponse;
import com.admazing.GetByIdCategoryRequest;
import com.admazing.GetByIdCategoryResponse;
import com.admazing.GetByIdPromotionRequest;
import com.admazing.GetByIdPromotionResponse;
import com.admazing.GetbyCommercialAreaCouponBookRequest;
import com.admazing.GetbyCommercialAreaCouponBookResponse;
import com.admazing.LogInRequest;
import com.admazing.LogInResponse;
import com.admazing.PromotionModel;
import com.admazing.SaveAccessRequest;
import com.admazing.SaveAccessResponse;
import com.admazing.SaveCouponBookRequest;
import com.admazing.SaveCouponBookResponse;
import com.admazing.StoreModel;
import com.admazing.UserModel;
import com.admazing.core.contracts.AccessRepository;
import com.admazing.core.contracts.CategoryRepository;
import com.admazing.core.contracts.CouponBookRepository;
import com.admazing.core.contracts.PromotionRepository;
import com.admazing.core.contracts.StoreRepository;
import com.admazing.core.contracts.UserRepository;
import com.admazing.core.contracts.CommercialAreaRepository;
import com.admazing.dataAccess.AccessRepositoryImpl;
import com.admazing.dataAccess.CategoryRepositoryImpl;
import com.admazing.dataAccess.CouponBookRepositoryImpl;
import com.admazing.dataAccess.PromotionRepositoryImpl;
import com.admazing.dataAccess.StoreRepositoryImpl;
import com.admazing.dataAccess.UserRepositoryImpl;
import com.admazing.dataAccess.CommercialAreaRepositoryImpl;


public class AdmazingWSImpl implements AdmazingPortType {
	UserRepository userRepository= new UserRepositoryImpl();
	StoreRepository storeRepository= new StoreRepositoryImpl();
	CategoryRepository categoryRepository= new CategoryRepositoryImpl();
	PromotionRepository promotionRepository= new PromotionRepositoryImpl();
	CommercialAreaRepository commercialAreaRepository= new CommercialAreaRepositoryImpl();
	AccessRepository accessRepository = new AccessRepositoryImpl(); 
	CouponBookRepository couponBookRepository = new CouponBookRepositoryImpl(); 
	
	public AdmazingWSImpl() {
	}

	@Override
	public LogInResponse logIn(LogInRequest parameters) {
		LogInResponse response = new LogInResponse();
		String idUser= parameters.getIdUser();
		String password= parameters.getPassword();
		UserModel user=userRepository.findById(idUser);
		if(user!=null&&user.getPassword().compareTo(password)==0){
			response.setResult(true);
		}
		else{
			response.setResult(false);
		}
		return response;
	}

	@Override
	public GetAllStoresResponse getAllStores(GetAllStoresRequest parameters) {
		GetAllStoresResponse response = new GetAllStoresResponse();
		List<StoreModel> stores=storeRepository.getAll();
		List<StoreModel> responseStores = response.getStore();
		if(stores!=null){
			for (StoreModel store : stores) {
				responseStores.add(store);
			}
		}
		return response; 
	}

	@Override
	public GetAllStoresbyCommercialAreaResponse getAllStoresbyCommercialArea(
			GetAllStoresbyCommercialAreaRequest parameters) {
		GetAllStoresbyCommercialAreaResponse response = new GetAllStoresbyCommercialAreaResponse();
		String idUser= parameters.getIdUser();
		String idCommercialArea=commercialAreaRepository.getIdLastCommercialArea(idUser);
		List<StoreModel> stores=storeRepository.getAllbyCommercialArea(idCommercialArea);
		List<StoreModel> responseStores = response.getStore();
		if(stores!=null){
			for (StoreModel store : stores) {
				responseStores.add(store);
			}
		}
		return response;		
	}
	
	@Override
	public GetByIdCategoryResponse getByIdCategory(GetByIdCategoryRequest parameters) {
		GetByIdCategoryResponse response = new GetByIdCategoryResponse();
		List<CategoryModel> categories=categoryRepository.findById(parameters.getIdStore());
		List<CategoryModel> responseCategories = response.getCategory();
		if(categories!=null){
			for (CategoryModel category : categories) {
				responseCategories.add(category);
			}
		}
		return response;
	}

	@Override
	public GetByIdPromotionResponse getByIdPromotion(GetByIdPromotionRequest parameters) {
		GetByIdPromotionResponse response = new GetByIdPromotionResponse();
		List<PromotionModel> promotions=promotionRepository.findById(parameters.getIdStore(),parameters.getIdCategory());
		List<PromotionModel> responsePromotions = response.getPromotion();
		if(promotions!=null){
			for (PromotionModel promotion : promotions) {
				responsePromotions.add(promotion);
			}
		}
		return response;
	}

	@Override
	public SaveAccessResponse saveAccess(SaveAccessRequest parameters) {
		SaveAccessResponse response = new SaveAccessResponse();
		/*CommercialAreaModel commercialAreaModel=commercialAreaRepository.getByLatitudeLongitude(parameters.getLatitude(), parameters.getLongitude());
		if(commercialAreaModel!=null){
			response.setNameCommercialArea(commercialAreaModel.getNameCommercialArea());
			boolean result=accessRepository.save(parameters.getIdUser(), commercialAreaModel.getIdCommercialArea());
			response.setResult(result);
			System.out.println(result);
			
		}
		else
		{
			response.setResult(false);
		}*/
		response.setResult(true);
		System.out.println("VERIFICANDO");
		
		return response;
	}

	@Override
	public GetbyCommercialAreaCouponBookResponse getbyCommercialAreaCouponBook(GetbyCommercialAreaCouponBookRequest parameters) {
		GetbyCommercialAreaCouponBookResponse response = new GetbyCommercialAreaCouponBookResponse();
		String idUser= parameters.getIdUser();
		String idCommercialArea=commercialAreaRepository.getIdLastCommercialArea(idUser);
		List<CouponBookModel> couponBook=couponBookRepository.getAllById(idUser);
		List<StoreModel> stores=storeRepository.getAllbyCommercialArea(idCommercialArea);
		List<PromotionModel> responseCouponBook = response.getCoupon();
		if(couponBook!=null&&stores!=null){
			for (CouponBookModel coupon : couponBook) {
				PromotionModel promotion=promotionRepository.findById(coupon.getIdPromotion());
				for(StoreModel store:stores){
					if(promotion.getIdStore().compareTo(store.getIdStore())==0){
						responseCouponBook.add(promotion);
					}
				}
			}
		}
		return response;
	}

	@Override
	public SaveCouponBookResponse saveCouponBook(SaveCouponBookRequest parameters) {
		SaveCouponBookResponse response = new SaveCouponBookResponse();
		String idUser= parameters.getIdUser();
		String idPromotion= parameters.getIdPromotion();
		boolean result=couponBookRepository.save(idUser,idPromotion);
		if (result)
			response.setResult(true);
		else 
			response.setResult(false);
		return response;

	}

	@Override
	public DeleteFromCouponBookResponse deleteFromCouponBook(DeleteFromCouponBookRequest parameters) {
		
		return null;
	}
	
}
