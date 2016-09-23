package com.admazing.Logic;

import java.util.List;

import com.admazing.StoreModel;
import com.admazing.core.contracts.CommercialAreaRepository;
import com.admazing.core.contracts.StoreRepository;
import com.admazing.core.contracts.StoreService;
import com.admazing.dataAccess.CommercialAreaRepositoryImpl;
import com.admazing.dataAccess.StoreRepositoryImpl;

public class StoreServiceImpl implements StoreService {
	
	private StoreRepository storeRepository= new StoreRepositoryImpl();
	private CommercialAreaRepository commercialAreaRepository= new CommercialAreaRepositoryImpl();
	
	@Override
	public StoreModel getById(String idStore) {

		StoreModel store=storeRepository.getStoreById(idStore);
		return store;
	}

	@Override
	public List<StoreModel> getAll() {
		List<StoreModel> stores=storeRepository.getAll();
		return stores;
	}

	@Override
	public List<StoreModel> getAllbyCommercialArea(String idUser) {
		String idCommercialArea=commercialAreaRepository.getIdLastCommercialArea(idUser);
		List<StoreModel> stores=storeRepository.getAllbyCommercialArea(idCommercialArea);
		return stores;
		
	}

}
