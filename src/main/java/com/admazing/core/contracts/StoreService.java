package com.admazing.core.contracts;

import java.util.List;

import com.admazing.StoreModel;

public interface StoreService {
	StoreModel getById(String idStore);
	List<StoreModel> getAll();
	List<StoreModel> getAllbyCommercialArea(String idUser);

}
