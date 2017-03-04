package com.admazing.dataAccess;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
 
public class hibernateUtil {
	 
	private SessionFactory sessionFactory;
	private static hibernateUtil myHibernateConfigurator;
	private hibernateUtil(){
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	public static hibernateUtil getHibernateConfigurator(){
		if(myHibernateConfigurator==null){
			myHibernateConfigurator= new hibernateUtil();
		}
		return myHibernateConfigurator;
	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
    public void shutdown() {
        getSessionFactory().close();
    }
}

