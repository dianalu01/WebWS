package com.admazing.core.contracts;


public interface PreferenceService {
	
	boolean save (String idUser, String idCategory);
	boolean delete(String idUser,String idCategory);

}
