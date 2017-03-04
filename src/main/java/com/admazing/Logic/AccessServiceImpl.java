package com.admazing.Logic;


import com.admazing.core.contracts.AccessRepository;
import com.admazing.core.contracts.AccessService;
import com.admazing.dataAccess.AccessRepositoryImpl;

public class AccessServiceImpl implements AccessService {

	private AccessRepository accessRepository = new AccessRepositoryImpl(); 
	
	@Override
	public boolean save(String idUser,String idCommercialArea) {		
		if(idCommercialArea!=null){			
			boolean result=accessRepository.save(idUser, idCommercialArea);
			return result;							
		}
		return false;
	}

}
