package com.admazing.core.contracts;

import java.util.List;

import com.admazing.PromocionModel;

public interface PromocionRepositorio {
	List<PromocionModel> findById(String idTienda, String idCategoria);
	PromocionModel findById(String idPromocion);
}
