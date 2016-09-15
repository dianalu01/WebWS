package com.admazing.core.contracts;

import java.util.List;

import com.admazing.StoreModel;

public interface StoreRepository {
	List<StoreModel> getAll();
	List<StoreModel> getAllbyCommercialArea(String idCommercialArea);
	StoreModel getStoreById(String idStore);
}
