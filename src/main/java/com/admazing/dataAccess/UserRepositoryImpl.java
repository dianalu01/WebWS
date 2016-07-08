package com.admazing.dataAccess;


import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.admazing.UserModel;
import com.admazing.core.contracts.UserRepository;

public class UserRepositoryImpl implements UserRepository{
	 
	public UserModel findById(String idUser) {
		Session session=hibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		try{
			List list = session.createSQLQuery("select * from usuario where idusuario='"+idUser+"'").addEntity(UserModel.class).list();
			Iterator itr = list.iterator();
			UserModel user = null ;
			while(itr.hasNext()){
				user = (UserModel)itr.next();
			}
	        session.flush();
            session.clear();
			return user;
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
