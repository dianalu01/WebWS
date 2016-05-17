package com.admazing.core.contracts;

import com.admazing.UsuarioModel;

public interface UsuarioRepositorio {
	void update(UsuarioModel usuario);
	UsuarioModel findById(String idUsuario);
}
