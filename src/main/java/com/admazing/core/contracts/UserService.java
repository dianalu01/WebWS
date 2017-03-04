package com.admazing.core.contracts;

import com.admazing.UserModel;

public interface UserService {
	boolean logIn(String idUser,String password);
	UserModel findById(String idUser);

}
