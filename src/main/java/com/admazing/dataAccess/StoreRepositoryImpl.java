package com.admazing.dataAccess;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.admazing.StoreModel;
import com.admazing.core.contracts.StoreRepository;

public class StoreRepositoryImpl implements StoreRepository{

	public List<StoreModel> getAll() {
		Session session=hibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		try{
			List list = session.createSQLQuery("select * from tienda").addEntity(StoreModel.class).list();
			Iterator itr = list.iterator();
			List<StoreModel> stores = new  ArrayList<StoreModel>();
			while(itr.hasNext()){
				stores.add((StoreModel)itr.next());
			}
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
			List list = session.createSQLQuery("select * from tienda where zonacomercial='"+idCommercialArea+"'").addEntity(StoreModel.class).list();
			Iterator itr = list.iterator();
			List<StoreModel> stores = new  ArrayList<StoreModel>();
			while(itr.hasNext()){
				stores.add((StoreModel)itr.next());
			}
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
