package com.admazing.core.contracts;

import com.admazing.CommercialAreaModel;

public interface CommercialAreaService {
	CommercialAreaModel getByLatitudeLongitude(String latitude,String longitude);

}
