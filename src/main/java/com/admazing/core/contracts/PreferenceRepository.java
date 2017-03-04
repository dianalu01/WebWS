package com.admazing.core.contracts;

import java.util.List;

import com.admazing.PreferenceModel;
public interface PreferenceRepository {
	List<PreferenceModel> getAllById(String idUser);
	boolean save(String idUser,String idCategory);
	boolean delete(String idUser,String idCategory);
	boolean exist(String idUser, String idCategory);
}
