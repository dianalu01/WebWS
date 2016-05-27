package com.admazing.core.contracts;

import com.admazing.UsuarioModel;

public interface UsuarioRepositorio {
	
	UsuarioModel findById(String idUsuario);
		
}
