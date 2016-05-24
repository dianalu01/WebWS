package com.admazing.dataAccess;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.admazing.TiendaModel;
import com.admazing.core.contracts.TiendaRepositorio;

public class TiendaRepositorioImpl implements TiendaRepositorio{

	public List<TiendaModel> getAll() {
		Session session=hibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		try{
			List list = session.createSQLQuery("select * from tienda").addEntity(TiendaModel.class).list();
			Iterator itr = list.iterator();
			List<TiendaModel> bd = new  ArrayList<TiendaModel>();
			while(itr.hasNext()){
				bd.add((TiendaModel)itr.next());
			}
	        session.flush();
            session.clear();
			return bd;
		} catch (Exception e) {
	            e.printStackTrace();
	            transaction.rollback();
		} finally {
			if(session.isOpen())
				session.close();
	    }
		return null;
	}

	@Override
	public List<TiendaModel> getAllbyZonaComercial(String idUsuario,String idZonacomercial) {
		Session session=hibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		try{
			List list = session.createSQLQuery("select * from tienda where zonacomercial='"+idZonacomercial+"'").addEntity(TiendaModel.class).list();
			Iterator itr = list.iterator();
			List<TiendaModel> bd = new  ArrayList<TiendaModel>();
			while(itr.hasNext()){
				bd.add((TiendaModel)itr.next());
			}
	        session.flush();
            session.clear();
			return bd;
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
