package com.admazing.core.contracts;

import java.util.List;

import com.admazing.TiendaModel;

public interface TiendaRepositorio {
	List<TiendaModel> getAll();
	List<TiendaModel> getAllbyZonaComercial(String idUsuario);
}
