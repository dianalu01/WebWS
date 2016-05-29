package com.admazing.dataAccess;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.admazing.core.models.PromocionModel;
import com.admazing.core.contracts.PromocionRepositorio;


public class PromocionRepositorioImpl implements PromocionRepositorio{
	
	@Override
	public List<PromocionModel> findById(String idTienda, String idCategoria) {
		Session session=hibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		try{
			List list = session.createSQLQuery("select * from promocion where categoria='"+idCategoria+"' and tienda='"+idTienda+"'").addEntity(PromocionModel.class).list();
			Iterator itr = list.iterator();
			List<PromocionModel> bd = new  ArrayList<PromocionModel>();
			while(itr.hasNext()){
				bd.add((PromocionModel)itr.next());
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
	public PromocionModel findById(String idPromocion) {
		Session session=hibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		try{
			List list = session.createSQLQuery("select * from promocion where idpromocion='"+idPromocion+"'").addEntity(PromocionModel.class).list();
			Iterator itr = list.iterator();
			PromocionModel bd = null;
			while(itr.hasNext()){
				bd=(PromocionModel)itr.next();
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
