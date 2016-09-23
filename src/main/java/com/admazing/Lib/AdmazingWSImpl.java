package com.admazing.Lib;


import java.util.ArrayList;
import java.util.List;

import com.admazing.AdmazingPortType;
import com.admazing.CategoryModel;
import com.admazing.CommercialAreaModel;
import com.admazing.CouponBookModel;
import com.admazing.DeleteFromCouponBookRequest;
import com.admazing.DeleteFromCouponBookResponse;
import com.admazing.DeleteFromPreferenceRequest;
import com.admazing.DeleteFromPreferenceResponse;
import com.admazing.GetAllPreferedCategoriesResponse;
import com.admazing.GetAllPreferedCategoriesRequest;
import com.admazing.GetAllStoresRequest;
import com.admazing.GetAllStoresResponse;
import com.admazing.GetAllStoresbyCommercialAreaRequest;
import com.admazing.GetAllStoresbyCommercialAreaResponse;
import com.admazing.GetByIdCategoryRequest;
import com.admazing.GetByIdCategoryResponse;
import com.admazing.GetByIdPromotionRequest;
import com.admazing.GetByIdPromotionResponse;
import com.admazing.GetCategoryByPreferenceRequest;
import com.admazing.GetCategoryByPreferenceResponse;
import com.admazing.GetStoreByIdRequest;
import com.admazing.GetStoreByIdResponse;
import com.admazing.GetbyCommercialAreaCouponBookRequest;
import com.admazing.GetbyCommercialAreaCouponBookResponse;
import com.admazing.LogInRequest;
import com.admazing.LogInResponse;
import com.admazing.PreferedCategoryModel;
import com.admazing.PreferenceModel;
import com.admazing.ProductModel;
import com.admazing.PromotionDetailedModel;
import com.admazing.PromotionModel;
import com.admazing.PromotionTypeModel;
import com.admazing.SaveAccessRequest;
import com.admazing.SaveAccessResponse;
import com.admazing.SaveCouponBookRequest;
import com.admazing.SaveCouponBookResponse;
import com.admazing.SavePreferenceRequest;
import com.admazing.SavePreferenceResponse;
import com.admazing.SavePromotionUseRequest;
import com.admazing.SavePromotionUseResponse;
import com.admazing.StoreModel;
import com.admazing.UserModel;
import com.admazing.Logic.AccessServiceImpl;
import com.admazing.Logic.CategoryServiceImpl;
import com.admazing.Logic.CommercialAreaServiceImpl;
import com.admazing.Logic.CouponBookServiceImpl;
import com.admazing.Logic.PreferenceServiceImpl;
import com.admazing.Logic.PromotionServiceImpl;
import com.admazing.Logic.StoreServiceImpl;
import com.admazing.Logic.UserServiceImpl;
import com.admazing.Logic.categoryObserver;
import com.admazing.core.contracts.AccessRepository;
import com.admazing.core.contracts.AccessService;
import com.admazing.core.contracts.CategoryRepository;
import com.admazing.core.contracts.CategoryService;
import com.admazing.core.contracts.CouponBookRepository;
import com.admazing.core.contracts.CouponBookService;
import com.admazing.core.contracts.Observer;
import com.admazing.core.contracts.PreferenceRepository;
import com.admazing.core.contracts.PreferenceService;
import com.admazing.core.contracts.ProductRepository;
import com.admazing.core.contracts.PromotionRepository;
import com.admazing.core.contracts.PromotionService;
import com.admazing.core.contracts.PromotionTypeRepository;
import com.admazing.core.contracts.PromotionUseRepository;
import com.admazing.core.contracts.StoreRepository;
import com.admazing.core.contracts.StoreService;
import com.admazing.core.contracts.UserRepository;
import com.admazing.core.contracts.UserService;
import com.admazing.core.contracts.CommercialAreaRepository;
import com.admazing.core.contracts.CommercialAreaService;
import com.admazing.dataAccess.AccessRepositoryImpl;
import com.admazing.dataAccess.CategoryRepositoryImpl;
import com.admazing.dataAccess.CouponBookRepositoryImpl;
import com.admazing.dataAccess.PreferenceRepositoryImpl;
import com.admazing.dataAccess.ProductRepositoryImpl;
import com.admazing.dataAccess.PromotionRepositoryImpl;
import com.admazing.dataAccess.PromotionTypeRepositoryImpl;
import com.admazing.dataAccess.PromotionUseRepositoryImpl;
import com.admazing.dataAccess.StoreRepositoryImpl;
import com.admazing.dataAccess.UserRepositoryImpl;
import com.admazing.dataAccess.CommercialAreaRepositoryImpl;


public class AdmazingWSImpl implements AdmazingPortType{
	
	private CouponBookRepository couponBookRepository = new CouponBookRepositoryImpl(); 
	private PreferenceRepository preferenceRepository = new PreferenceRepositoryImpl();
	private PromotionUseRepository promotionUseRepository= new PromotionUseRepositoryImpl();
	private List<Observer> observers = new ArrayList<Observer>();
	
	
	private UserService userService = new UserServiceImpl();
	private StoreService storeService = new StoreServiceImpl();
	private CategoryService categoryService=new CategoryServiceImpl();
	private PromotionService promotionService= new PromotionServiceImpl();
	private CouponBookService couponBookService= new CouponBookServiceImpl();
	private AccessService accessService= new AccessServiceImpl();
	private CommercialAreaService commercialAreaService=new CommercialAreaServiceImpl();
	private PreferenceService preferenceService= new PreferenceServiceImpl();
	public AdmazingWSImpl() {
		new categoryObserver(this);
	}

	@Override
	public LogInResponse logIn(LogInRequest parameters) {
		LogInResponse response = new LogInResponse();
		String idUser= parameters.getIdUser();
		String password= parameters.getPassword();
		response.setResult(userService.logIn(idUser, password));
		return response;
	}
	
	@Override
	public GetStoreByIdResponse getStoreById(GetStoreByIdRequest parameters) {
		GetStoreByIdResponse response = new GetStoreByIdResponse();
		List<StoreModel> responseStores = response.getStore();
		String idStore=parameters.getIdStore();
		StoreModel store=storeService.getById(idStore);
		if(store!=null){
			responseStores.add(store);
		}
		return response;
	}
	
	@Override
	public GetAllStoresResponse getAllStores(GetAllStoresRequest parameters) {
		GetAllStoresResponse response = new GetAllStoresResponse();
		List<StoreModel> stores=storeService.getAll();
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
		List<StoreModel> stores=storeService.getAllbyCommercialArea(idUser);
		List<StoreModel> responseStores = response.getStore();
		if(stores!=null){
			for (StoreModel store : stores) {
				responseStores.add(store);
			}
		}
		return response;		
	}
	
	@Override
	public GetAllPreferedCategoriesResponse getAllPreferedCategories(GetAllPreferedCategoriesRequest parameters) {
		GetAllPreferedCategoriesResponse response = new GetAllPreferedCategoriesResponse();
		String idUser= parameters.getIdUser();
		List<PreferedCategoryModel> preferedCategories= categoryService.getAllPrefered(idUser);
		List<PreferedCategoryModel> responsePreferedCategories = response.getCategoryPrefered();
		if(preferedCategories!=null){
			for (PreferedCategoryModel category : preferedCategories) {
				responsePreferedCategories.add(category);
			}
		}
		return response; 
	}
	
	@Override
	public GetByIdCategoryResponse getByIdCategory(GetByIdCategoryRequest parameters) {
		GetByIdCategoryResponse response = new GetByIdCategoryResponse();
		List<CategoryModel> categories=categoryService.getById(parameters.getIdStore());
		List<CategoryModel> responseCategories = response.getCategory();
		if(categories!=null){
			for (CategoryModel category : categories) {
				responseCategories.add(category);
			}
		}
		return response;
	}
	
	@Override
	public GetCategoryByPreferenceResponse getCategoryByPreference(GetCategoryByPreferenceRequest parameters) {
		GetCategoryByPreferenceResponse response = new GetCategoryByPreferenceResponse();
		String idUser= parameters.getIdUser();
		String idStore=parameters.getIdStore();
		List<CategoryModel> categoriesPrefered=categoryService.getByPreference(idStore, idUser);
		List<CategoryModel> responseCategories = response.getCategory();
		if(categoriesPrefered!=null){
			for (CategoryModel category : categoriesPrefered) {
				responseCategories.add(category);					
			}
		}		
		return response;
	}
	@Override
	public GetByIdPromotionResponse getByIdPromotion(GetByIdPromotionRequest parameters) {
		GetByIdPromotionResponse response = new GetByIdPromotionResponse();
		String idCategory= parameters.getIdCategory();
		String idStore=parameters.getIdStore();
		List<PromotionDetailedModel> promotionsDetailed=promotionService.getById(idStore, idCategory);
		List<PromotionDetailedModel> responsePromotionsDetailed = response.getPromotionDetailed();
		if(promotionsDetailed!=null){
			for (PromotionDetailedModel promotion : promotionsDetailed) {
				responsePromotionsDetailed.add(promotion);
			}
		}
		return response;
	}

	@Override
	public SaveAccessResponse saveAccess(SaveAccessRequest parameters) {
		SaveAccessResponse response = new SaveAccessResponse();
		String latitude=parameters.getLatitude();
		String longitude= parameters.getLongitude();
		String idUser= parameters.getIdUser();
		CommercialAreaModel commercialArea= commercialAreaService.getByLatitudeLongitude(latitude, longitude);
		if(commercialArea!=null){
			boolean result=accessService.save(idUser, commercialArea.getIdCommercialArea());
			response.setNameCommercialArea(commercialArea.getNameCommercialArea());
			response.setResult(result);		
			
		}
		else
		{
			response.setResult(false);
		}		
		return response;
	}

	@Override
	public GetbyCommercialAreaCouponBookResponse getbyCommercialAreaCouponBook(GetbyCommercialAreaCouponBookRequest parameters) {
		GetbyCommercialAreaCouponBookResponse response = new GetbyCommercialAreaCouponBookResponse();
		String idUser= parameters.getIdUser();
		List<PromotionDetailedModel> couponsBookDetailed= couponBookService.getByCommercialArea(idUser);
		List<PromotionDetailedModel> responseCouponBook = response.getCouponDetailed();
		if(couponsBookDetailed!=null){
			for (PromotionDetailedModel coupon : couponsBookDetailed) {
				responseCouponBook.add(coupon);
			}
		}
		
		return response;
	}

	@Override
	public SaveCouponBookResponse saveCouponBook(SaveCouponBookRequest parameters) {
		SaveCouponBookResponse response = new SaveCouponBookResponse();
		String idUser= parameters.getIdUser();
		String idPromotion= parameters.getIdPromotion();
		boolean result=couponBookService.save(idUser,idPromotion);
		response.setResult(result);
		return response;

	}

	@Override
	public DeleteFromCouponBookResponse deleteFromCouponBook(DeleteFromCouponBookRequest parameters) {
		DeleteFromCouponBookResponse response = new DeleteFromCouponBookResponse();
		String idUser= parameters.getIdUser();
		String idPromotion= parameters.getIdPromotion();
		boolean result=couponBookService.delete(idUser,idPromotion);
		response.setResult(result);
		return response;
	}

	@Override
	public SavePreferenceResponse savePreference(SavePreferenceRequest parameters) {
		SavePreferenceResponse response = new SavePreferenceResponse();
		String idUser= parameters.getIdUser();
		String idCategory= parameters.getIdCategory();
		boolean result=preferenceService.save(idUser,idCategory);
		response.setResult(result);
		return response;

	}
	
	@Override
	public DeleteFromPreferenceResponse deleteFromPreference(DeleteFromPreferenceRequest parameters) {
		DeleteFromPreferenceResponse response = new DeleteFromPreferenceResponse();
		String idUser= parameters.getIdUser();
		String idCategory= parameters.getIdCategory();
		boolean result=preferenceService.delete(idUser, idCategory);
		response.setResult(result);
		return response;
	}

	@Override
	public SavePromotionUseResponse savePromotionUse(SavePromotionUseRequest parameters) {
		SavePromotionUseResponse response = new SavePromotionUseResponse();
		response.setResult(false);
		String idUser= parameters.getIdUser();
		String idPromotion= parameters.getIdPromotion();
		boolean resultSavePromotionUse=promotionUseRepository.save(idUser,idPromotion);
		if (resultSavePromotionUse){
			boolean resultDeleteCoupon=couponBookRepository.delete(idUser,idPromotion);
			if(resultDeleteCoupon){
				response.setResult(true);
				notifyAllObservers(idUser,idPromotion);
			}
		}
			
		return response;		
	}
	public void attach(Observer observer){
		observers.add(observer);		
	}
	
	public void notifyAllObservers(String idUser,String idPromotion){
		for (Observer observer : observers) {
			observer.update(idUser,idPromotion);
			}
	}

	
		
}
