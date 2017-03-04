package com.admazing.core.contracts;

import com.admazing.UserModel;

public interface UserRepository {
	
	UserModel findById(String idUser);
		
}
