package com.admazing.dataAccess;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.admazing.StoreModel;
import com.admazing.core.contracts.StoreRepository;

public class StoreRepositoryImpl implements StoreRepository{

	public List<StoreModel> getAll() {
		Session session=hibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		try{
			Criteria cr = session.createCriteria(StoreModel.class);
			
			List<StoreModel> stores =  new ArrayList<StoreModel>(); 
			stores=cr.list();
	        session.flush();
            session.clear();
			return stores;
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
	public List<StoreModel> getAllbyCommercialArea(String idCommercialArea) {
		Session session=hibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		try{
			Criteria cr = session.createCriteria(StoreModel.class);
			cr.add(Restrictions.eq("idCommercialArea", idCommercialArea));
			List<StoreModel> stores = new ArrayList<StoreModel>(); 
			stores=cr.list();
	        session.flush();
            session.clear();
			return stores;
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
