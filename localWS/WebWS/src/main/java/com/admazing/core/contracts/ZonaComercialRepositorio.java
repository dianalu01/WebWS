package com.admazing.core.contracts;

import com.admazing.ZonaComercialModel;

public interface ZonaComercialRepositorio {
	ZonaComercialModel getByLatitudLongitud(String latitud,String longitud);
}
