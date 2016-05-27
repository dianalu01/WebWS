package com.admazing.core.contracts;

import java.util.List;

import com.admazing.CuponeraModel;

public interface CuponeraRepositorio {
	List<CuponeraModel> getAllById(String idUsuario);
}
