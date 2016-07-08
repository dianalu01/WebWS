package com.admazing.dataAccess;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.admazing.PromotionModel;
import com.admazing.core.contracts.PromotionRepository;


public class PromotionRepositoryImpl implements PromotionRepository{
	
	@Override
	public List<PromotionModel> findById(String idStore, String idCategory) {
		Session session=hibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		try{
			List list = session.createSQLQuery("select * from promocion where categoria='"+idCategory+"' and tienda='"+idStore+"'").addEntity(PromotionModel.class).list();
			Iterator itr = list.iterator();
			List<PromotionModel> promotions = new  ArrayList<PromotionModel>();
			while(itr.hasNext()){
				promotions.add((PromotionModel)itr.next());
			}
	        session.flush();
            session.clear();
			return promotions;
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
	public PromotionModel findById(String idPromotion) {
		Session session=hibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		try{
			List list = session.createSQLQuery("select * from promocion where idpromocion='"+idPromotion+"'").addEntity(PromotionModel.class).list();
			Iterator itr = list.iterator();
			PromotionModel promotion = null;
			while(itr.hasNext()){
				promotion=(PromotionModel)itr.next();
			}
	        session.flush();
            session.clear();
			return promotion;
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