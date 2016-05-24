package com.admazing.Lib;


import java.util.List;

import com.admazing.AdmazingPortType;
import com.admazing.CategoriaModel;
import com.admazing.GetAllTiendaRequest;
import com.admazing.GetAllTiendaResponse;
import com.admazing.GetAllTiendabyZonaComercialRequest;
import com.admazing.GetAllTiendabyZonaComercialResponse;
import com.admazing.GetByIdCategoriaRequest;
import com.admazing.GetByIdCategoriaResponse;
import com.admazing.GetByIdPromocionRequest;
import com.admazing.GetByIdPromocionResponse;
import com.admazing.GetbyZonaComercialCuponeraRequest;
import com.admazing.GetbyZonaComercialCuponeraResponse;
import com.admazing.IniciarSesionRequest;
import com.admazing.IniciarSesionResponse;
import com.admazing.PromocionModel;
import com.admazing.SaveAccesoRequest;
import com.admazing.SaveAccesoResponse;
import com.admazing.TiendaModel;
import com.admazing.UsuarioModel;
import com.admazing.ZonaComercialModel;
import com.admazing.core.contracts.AccesoRepositorio;
import com.admazing.core.contracts.CategoriaRepositorio;
import com.admazing.core.contracts.PromocionRepositorio;
import com.admazing.core.contracts.TiendaRepositorio;
import com.admazing.core.contracts.UsuarioRepositorio;
import com.admazing.core.contracts.ZonaComercialRepositorio;
import com.admazing.dataAccess.AccesoRepositorioImpl;
import com.admazing.dataAccess.CategoriaRepositorioImpl;
import com.admazing.dataAccess.PromocionRepositorioImpl;
import com.admazing.dataAccess.TiendaRepositorioImpl;
import com.admazing.dataAccess.UsuarioRepositorioImpl;
import com.admazing.dataAccess.ZonaComercialRepositorioImpl;


public class AdmazingWSImpl implements AdmazingPortType {
	UsuarioRepositorio usuarioRepositorio= new UsuarioRepositorioImpl();
	TiendaRepositorio tiendaRepositorio= new TiendaRepositorioImpl();
	CategoriaRepositorio categoriaRepositorio= new CategoriaRepositorioImpl();
	PromocionRepositorio promocionRepositorio= new PromocionRepositorioImpl();
	ZonaComercialRepositorio zonaComercialRepositorio= new ZonaComercialRepositorioImpl();
	AccesoRepositorio accesoRepositorio = new AccesoRepositorioImpl(); 
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
		List<TiendaModel> tiendas=tiendaRepositorio.getAll();
		List<TiendaModel> responseTiendas = response.getTiendas();
		if(tiendas!=null){
			for (TiendaModel tienda : tiendas) {
				responseTiendas.add(tienda);
			}
		}
		return response;
	}

	@Override
	public GetAllTiendabyZonaComercialResponse getAllTiendabyZonaComercial(
			GetAllTiendabyZonaComercialRequest parameters) {
		GetAllTiendabyZonaComercialResponse response = new GetAllTiendabyZonaComercialResponse();
		String idUsuario= parameters.getIdUsuario();
		String idZonacomercial=zonaComercialRepositorio.getIdLastZonaComercial(idUsuario);
		List<TiendaModel> tiendas=tiendaRepositorio.getAllbyZonaComercial(idUsuario,idZonacomercial);
		List<TiendaModel> responseTiendas = response.getTiendas();
		if(tiendas!=null){
			for (TiendaModel tienda : tiendas) {
				responseTiendas.add(tienda);
			}
		}
		return response;
		
	}
	
	@Override
	public GetByIdCategoriaResponse getByIdCategoria(GetByIdCategoriaRequest parameters) {
		GetByIdCategoriaResponse response = new GetByIdCategoriaResponse();
		List<CategoriaModel> categorias=categoriaRepositorio.findById(parameters.getIdTienda());
		List<CategoriaModel> responsecategorias = response.getCategorias();
		if(categorias!=null){
			for (CategoriaModel categoria : categorias) {
				responsecategorias.add(categoria);
			}
		}
		return response;
	}

	@Override
	public GetByIdPromocionResponse getByIdPromocion(GetByIdPromocionRequest parameters) {
		GetByIdPromocionResponse response = new GetByIdPromocionResponse();
		List<PromocionModel> promociones=promocionRepositorio.findById(parameters.getIdTienda(),parameters.getIdCategoria());
		List<PromocionModel> responsepromociones = response.getPromociones();
		if(promociones!=null){
			for (PromocionModel promocion : promociones) {
				responsepromociones.add(promocion);
			}
		}
		return response;
	}

	@Override
	public SaveAccesoResponse saveAcceso(SaveAccesoRequest parameters) {
		SaveAccesoResponse response = new SaveAccesoResponse();
		ZonaComercialModel zonaComercialModel=zonaComercialRepositorio.getByLatitudLongitud(parameters.getLatitud(), parameters.getLongitud());
		if(zonaComercialModel!=null){
			response.setNombreZonaComercial(zonaComercialModel.getNombre());
			boolean resultado=accesoRepositorio.save(parameters.getIdUsuario(), zonaComercialModel.getIdzonacomercial());
			if(resultado)
				response.setResultado(true);
			else
				response.setResultado(false);
		}
		else
			response.setResultado(false);
		return response;
	}

	@Override
	public GetbyZonaComercialCuponeraResponse getbyZonaComercialCuponera(GetbyZonaComercialCuponeraRequest parameters) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
