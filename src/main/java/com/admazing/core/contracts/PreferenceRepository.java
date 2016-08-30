package com.admazing.core.contracts;

public interface PreferenceRepository {
	boolean save(String idUser,String idCategory);
	boolean delete(String idUser,String idCategory);
}
