package com.admazing.core.contracts;

import java.util.List;

import com.admazing.CommercialAreaModel;

public interface CommercialAreaRepository {
	List<CommercialAreaModel> getAll();
	String getIdLastCommercialArea(String idUser);
}
