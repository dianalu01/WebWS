package com.admazing.dataAccess;


import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.admazing.UsuarioModel;
import com.admazing.core.contracts.UsuarioRepositorio;

public class UsuarioRepositorioImpl implements UsuarioRepositorio{
	 
	public UsuarioModel findById(String idUsuario) {
		Session session=hibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		try{
			List list = session.createSQLQuery("select * from usuario where idusuario='"+idUsuario+"'").addEntity(UsuarioModel.class).list();
			Iterator itr = list.iterator();
			UsuarioModel bd = null ;
			while(itr.hasNext()){
				bd = (UsuarioModel)itr.next();
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
