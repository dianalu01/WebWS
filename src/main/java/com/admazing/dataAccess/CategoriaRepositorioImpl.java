package com.admazing.dataAccess;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.admazing.CategoriaModel;
import com.admazing.core.contracts.CategoriaRepositorio;


public class CategoriaRepositorioImpl implements CategoriaRepositorio{
	
	@Override
	public List<CategoriaModel> findById(String idTienda) {
		Session session=hibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		try{
			List list = session.createSQLQuery("select C.* from tiendacategoria TC inner join categoria C on TC.codcategoria=C.idcategoria where codtienda='"+idTienda+"'").addEntity(CategoriaModel.class).list();
			Iterator itr = list.iterator();
			List<CategoriaModel> bd = new  ArrayList<CategoriaModel>();
			while(itr.hasNext()){
				bd.add((CategoriaModel)itr.next());
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
