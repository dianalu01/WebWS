package com.admazing.dataAccess;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.admazing.StoreModel;
import com.admazing.UserModel;
import com.admazing.core.contracts.StoreRepository;

public class StoreRepositoryImpl implements StoreRepository{

	public List<StoreModel> getAll() {
		hibernateUtil myHibernateConfigurator= hibernateUtil.getHibernateConfigurator();				 
		Session session=myHibernateConfigurator.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		List<StoreModel> stores = null;
		try{
			Criteria cr = session.createCriteria(StoreModel.class);			
			stores =  new ArrayList<StoreModel>(); 
			stores = cr.list();
	        session.flush();
            session.clear();
		} catch (Exception e) {
	            e.printStackTrace();
	            transaction.rollback();
		} finally {
			if(session.isOpen())
				session.close();
	    }
		return stores;
	}

	@Override
	public List<StoreModel> getAllbyCommercialArea(String idCommercialArea) {
		hibernateUtil myHibernateConfigurator= hibernateUtil.getHibernateConfigurator();				 
		Session session=myHibernateConfigurator.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		List<StoreModel> stores = null;
		try{
			Criteria cr = session.createCriteria(StoreModel.class);
			cr.add(Restrictions.eq("idCommercialArea", idCommercialArea));
			stores = new ArrayList<StoreModel>();
			stores=cr.list();
	        session.flush();
            session.clear();
		} catch (Exception e) {
	            e.printStackTrace();
	            transaction.rollback();
		} finally {
			if(session.isOpen())
			{	
				session.close();
			}
		}
		return stores;
	}

	@Override
	public StoreModel getStoreById(String idStore) {
		hibernateUtil myHibernateConfigurator= hibernateUtil.getHibernateConfigurator();				 
		Session session=myHibernateConfigurator.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		StoreModel store = null;
		try{
			store = (StoreModel) session.get(StoreModel.class, idStore);
	        session.flush();
            session.clear();
		} catch (Exception e) {
	            e.printStackTrace();
	            transaction.rollback();
		} finally {
			if(session.isOpen())
				session.close();
	    }
		return store;
	}	
}