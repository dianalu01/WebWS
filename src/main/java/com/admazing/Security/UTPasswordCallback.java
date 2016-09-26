
package com.admazing.Security;

import java.io.IOException;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.wss4j.common.ext.WSPasswordCallback;

import com.admazing.UserModel;
import com.admazing.Logic.UserServiceImpl;
import com.admazing.core.contracts.UserService;


public class UTPasswordCallback implements CallbackHandler {

	UserService userService= new UserServiceImpl();
	public UTPasswordCallback() {
		
	}

	public void handle(Callback[] callbacks) throws IOException,
			UnsupportedCallbackException {
		for (int i = 0; i < callbacks.length; i++) {
			WSPasswordCallback pc = (WSPasswordCallback) callbacks[i];
			UserModel user=null;
			user=userService.findById(pc.getIdentifier());
			if(user!=null){
				pc.setPassword(user.getPassword());
				return;
			}
		}
	}


}
