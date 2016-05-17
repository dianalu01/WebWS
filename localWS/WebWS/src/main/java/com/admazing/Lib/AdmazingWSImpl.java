package com.admazing.Lib;


import com.admazing.AdmazingPortType;
import com.admazing.IniciarSesionRequest;
import com.admazing.IniciarSesionResponse;
import com.admazing.UsuarioModel;
import com.admazing.core.contracts.UsuarioRepositorio;
import com.admazing.dataAccess.UsuarioRepositorioImpl;

public class AdmazingWSImpl implements AdmazingPortType {
	UsuarioRepositorio usuarioRepositorio= new UsuarioRepositorioImpl();
	public AdmazingWSImpl() {
		init();
	}

	public void init() {}

	@Override
	public IniciarSesionResponse iniciarSesion(IniciarSesionRequest parameters) {
		IniciarSesionResponse response = new IniciarSesionResponse();
		String idUsuario= parameters.getIdUsuario();
		String password= parameters.getPassword();
		UsuarioModel usuario=usuarioRepositorio.findById(idUsuario);
		if(usuario!=null&&usuario.getPassword().compareTo(password)==0){
			response.setResultado(true);
		}
		else{
			response.setResultado(false);
		}
		return response;
	}

	
}
