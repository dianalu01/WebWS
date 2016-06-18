package com.admazing.dataAccess;


import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.util.StringUtils;

import com.admazing.AccesoModel;
import com.admazing.core.contracts.AccesoRepositorio;
import com.admazing.core.contracts.ZonaComercialRepositorio;

public class AccesoRepositorioImpl implements AccesoRepositorio{
	@Override
	public boolean save(String idUsuario,String idZonaComercial) {
		AccesoModel accesoAnterior = null;
		Session session=hibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		try{
			List list = session.createSQLQuery("select * from acceso order by idacceso desc limit 1").addEntity(AccesoModel.class).list();
			Iterator itr = list.iterator();
			List<AccesoModel> bd = new  ArrayList<AccesoModel>();
			while(itr.hasNext()){
				accesoAnterior=(AccesoModel)itr.next();
			}
			String idAccesoActual=getNextIdAcceso(accesoAnterior.getIdacceso());
			AccesoModel accesoActual=insertDataAcceso(idUsuario,idZonaComercial,idAccesoActual);
		    session.save(accesoActual);
		    session.getTransaction().commit();		
	        session.flush();
            session.clear();
            return true;
			
		} catch (Exception e) {
	            e.printStackTrace();
	            transaction.rollback();
		} finally {
			if(session.isOpen())
				session.close();
	    }
		return false;
	}
	private AccesoModel insertDataAcceso (String idUsuario, String idZonaComercial, String idAccesoActual ){
		Date date = new Date();
		Time time=new Time(date.getTime());
		AccesoModel accesoActual = new AccesoModel();
		accesoActual.setIdacceso(idAccesoActual);
		accesoActual.setIdusuario(idUsuario);
		accesoActual.setZonacomercial(idZonaComercial);
		accesoActual.setFecha(date);
		accesoActual.setHoraacceso(time);
		return accesoActual;
	}
	
	private String getNextIdAcceso(String idAccesoAnterior)
	{
		Integer idAccesoCalulado=Integer.parseInt(idAccesoAnterior.substring(2))+1;
		String ceros=repeat("0", 8-(int)(Math.log10(idAccesoCalulado)+1));
		
		String idAccesoActual="AC"+ceros+String.valueOf(idAccesoCalulado);
		return idAccesoActual;
	}
	private static String repeat(String str, int times) {
        return new String(new char[times]).replace("\0", str);
    }

}
