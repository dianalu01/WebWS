
package Security;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.wss4j.common.ext.WSPasswordCallback;

import com.admazing.UserModel;
import com.admazing.core.contracts.UserRepository;
import com.admazing.dataAccess.UserRepositoryImpl;



public class UTPasswordCallback implements CallbackHandler {

	UserRepository userRepository= new UserRepositoryImpl();
	public UTPasswordCallback() {
		
	}

	public void handle(Callback[] callbacks) throws IOException,
			UnsupportedCallbackException {
		for (int i = 0; i < callbacks.length; i++) {
			WSPasswordCallback pc = (WSPasswordCallback) callbacks[i];
			UserModel user=null;
			user=userRepository.findById(pc.getIdentifier());
			if(user!=null){
				pc.setPassword(user.getPassword());
				return;
			}
		}
	}


}
