package com.admazing.dataAccess;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.admazing.UserModel;
import com.admazing.core.contracts.UserRepository;

public class UserRepositoryImpl implements UserRepository{
	 
	public UserModel findById(String idUser) {

		hibernateUtil myHibernateConfigurator= hibernateUtil.getHibernateConfigurator();				 
		Session session=myHibernateConfigurator.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		UserModel user = null;
		try{
			user = (UserModel) session.get(UserModel.class, idUser);
	        session.flush();
            session.clear();
		} catch (Exception e) {
	            e.printStackTrace();
	            transaction.rollback();
		} finally {
			if(session.isOpen())
				session.close();
	    }
		return user;
	}
}
