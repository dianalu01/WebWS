package com.admazing.Logic;

import com.admazing.core.contracts.PreferenceRepository;
import com.admazing.core.contracts.PreferenceService;
import com.admazing.dataAccess.PreferenceRepositoryImpl;

public class PreferenceServiceImpl implements PreferenceService {
	
	private PreferenceRepository preferenceRepository = new PreferenceRepositoryImpl();
	

	@Override
	public boolean save(String idUser, String idCategory) {
		boolean result=false;
		result=preferenceRepository.save(idUser,idCategory);
		return result;
	}

	@Override
	public boolean delete(String idUser, String idCategory) {
		boolean result=false;
		result=preferenceRepository.delete(idUser,idCategory);
		return result;
	}

}
