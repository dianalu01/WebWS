package com.admazing.core.contracts;

import java.util.List;

import com.admazing.CategoriaModel;

public interface CategoriaRepositorio {
	List<CategoriaModel> findById(String idTienda);
}
