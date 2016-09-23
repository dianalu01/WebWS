package com.admazing.Logic;

import com.admazing.CommercialAreaModel;
import com.admazing.core.contracts.CommercialAreaRepository;
import com.admazing.core.contracts.CommercialAreaService;
import com.admazing.dataAccess.CommercialAreaRepositoryImpl;

public class CommercialAreaServiceImpl implements CommercialAreaService {


	private CommercialAreaRepository commercialAreaRepository= new CommercialAreaRepositoryImpl();
	
	@Override
	public CommercialAreaModel getByLatitudeLongitude(String latitude, String longitude) {
		CommercialAreaModel commercialArea=commercialAreaRepository.getByLatitudeLongitude(latitude,longitude);
		return commercialArea;
	}

}
