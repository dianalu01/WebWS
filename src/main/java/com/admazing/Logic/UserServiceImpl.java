package com.admazing.Logic;

import com.admazing.UserModel;
import com.admazing.core.contracts.UserRepository;
import com.admazing.core.contracts.UserService;
import com.admazing.dataAccess.UserRepositoryImpl;

public class UserServiceImpl implements UserService{
	private UserRepository userRepository= new UserRepositoryImpl();
	
	@Override
	public boolean logIn(String idUser, String password) {
		UserModel user=userRepository.findById(idUser);
		if(user!=null&&user.getPassword().compareTo(password)==0){
			return true;
		}
		else{
			return false;
		}
	}

	@Override
	public UserModel findById(String idUser) {
		UserModel user=null;
		user=userRepository.findById(idUser);
		return user;
	}

}
