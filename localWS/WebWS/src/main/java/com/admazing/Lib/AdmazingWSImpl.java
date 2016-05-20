package com.admazing.Lib;


import java.util.List;

import com.admazing.AdmazingPortType;
import com.admazing.GetAllTiendaRequest;
import com.admazing.GetAllTiendaResponse;
import com.admazing.IniciarSesionRequest;
import com.admazing.IniciarSesionResponse;
import com.admazing.TiendaModel;
import com.admazing.UsuarioModel;
import com.admazing.core.contracts.TiendaRepositorio;
import com.admazing.core.contracts.UsuarioRepositorio;
import com.admazing.dataAccess.TiendaRepositorioImpl;
import com.admazing.dataAccess.UsuarioRepositorioImpl;


public class AdmazingWSImpl implements AdmazingPortType {
	UsuarioRepositorio usuarioRepositorio= new UsuarioRepositorioImpl();
	TiendaRepositorio tiendaRepositorio= new TiendaRepositorioImpl();
	public AdmazingWSImpl() {
		
	}

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

	@Override
	public GetAllTiendaResponse getAllTienda(GetAllTiendaRequest parameters) {
		GetAllTiendaResponse response = new GetAllTiendaResponse();
		List<TiendaModel> tiendas=tiendaRepositorio.findByAll();
		List<TiendaModel> responseTiendas = response.getTiendas();
		if(tiendas!=null){
			for (TiendaModel tienda : tiendas) {
				responseTiendas.add(tienda);
			}
		}
		return response;
	}

	
}
