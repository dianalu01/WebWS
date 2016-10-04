package com.admazing.Logic;

import java.util.List;

import com.admazing.CommercialAreaModel;
import com.admazing.core.contracts.CommercialAreaRepository;
import com.admazing.core.contracts.CommercialAreaService;
import com.admazing.dataAccess.CommercialAreaRepositoryImpl;

public class CommercialAreaServiceImpl implements CommercialAreaService {


	private CommercialAreaRepository commercialAreaRepository= new CommercialAreaRepositoryImpl();
	
	@Override
	public CommercialAreaModel getByLatitudeLongitude(String latitude, String longitude) {
		List<CommercialAreaModel> commercialAreas=commercialAreaRepository.getAll();
		double latitudeSearched =Double.parseDouble(latitude);
		double longitudeSearched =Double.parseDouble(longitude);
		CommercialAreaModel commercialArea = null;
		for (CommercialAreaModel c : commercialAreas) {
			double currentLatitude=Double.parseDouble(c.getLatitude());
			double currentLongitude=Double.parseDouble(c.getLongitude());
			double currentDistance=Double.parseDouble(c.getDistance());
			double distance=Math.sqrt(Math.pow((latitudeSearched-currentLatitude),2)
					+Math.pow((longitudeSearched-currentLongitude),2));
			if(distance<=currentDistance){
				commercialArea= c;
				break;
			}	    
		}
		return commercialArea;
	}
}
