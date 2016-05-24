package com.admazing.dataAccess;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.admazing.ZonaComercialModel;
import com.admazing.core.contracts.ZonaComercialRepositorio;

public class ZonaComercialRepositorioImpl implements ZonaComercialRepositorio{

	public ZonaComercialModel getByLatitudLongitud(String latitud,String longitud) {
		Session session=hibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		double latitudSearched =Double.parseDouble(latitud);
		double longitudSearched =Double.parseDouble(longitud);
		try{
			List list = session.createSQLQuery("select * from zonacomercial").addEntity(ZonaComercialModel.class).list();
			Iterator itr = list.iterator();
			while(itr.hasNext()){
				ZonaComercialModel currentZonaComercial=(ZonaComercialModel)itr.next();
				double latitudActual=Double.parseDouble(currentZonaComercial.getLatitud());
				double longitudActual=Double.parseDouble(currentZonaComercial.getLongitud());
				double distanciaActual=Double.parseDouble(currentZonaComercial.getDistancia());
				double distancia=Math.sqrt(Math.pow((latitudSearched-latitudActual),2)
						+Math.pow((longitudSearched-longitudActual),2));
				if(distancia<=distanciaActual){
					System.out.println(distancia+ "Distancia Actual"+distanciaActual);
			        session.flush();
	            	session.clear();
					return currentZonaComercial;	
				}

				System.out.println(distancia+ "Distancia Actual"+distanciaActual);
			}
	        session.flush();
            session.clear();
		} catch (Exception e) {
	            e.printStackTrace();
	            transaction.rollback();
		} finally {
			if(session.isOpen())
				session.close();
	    }
		return null;
	}

}
