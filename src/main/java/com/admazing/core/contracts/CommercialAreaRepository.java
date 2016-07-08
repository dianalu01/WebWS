package com.admazing.core.contracts;

import com.admazing.CommercialAreaModel;

public interface CommercialAreaRepository {
	CommercialAreaModel getByLatitudeLongitude(String latitude,String longitude);
	String getIdLastCommercialArea(String idUser);
}
