package com.admazing.dataAccess;


import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

import com.admazing.PromotionModel;
import com.admazing.core.contracts.PromotionRepository;


public class PromotionRepositoryImpl implements PromotionRepository{
	
	@Override
	public List<PromotionModel> findById(String idStore, String idCategory) {
		hibernateUtil myHibernateConfigurator= hibernateUtil.getHibernateConfigurator();				 
		Session session=myHibernateConfigurator.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		List<PromotionModel> promotions = null;
		try{
			Criteria cr = session.createCriteria(PromotionModel.class);
			Criterion category = Restrictions.eq("idCategory", idCategory);
			Criterion store = Restrictions.eq("idStore",idStore);
			Criterion startDate = Restrictions.lt("startDate",getTodayDate());
			Criterion endDate = Restrictions.gt("endDate",getTodayDate());
			LogicalExpression andExp1 = Restrictions.and(category, store);
			LogicalExpression andExp2 = Restrictions.and(startDate, endDate);
			LogicalExpression andExp = Restrictions.and(andExp1, andExp2);
			cr.add( andExp );
			promotions = new  ArrayList<PromotionModel>();
			promotions=cr.list();
	        session.flush();
            session.clear();
		} catch (Exception e) {
	            e.printStackTrace();
	            transaction.rollback();
		} finally {
			if(session.isOpen())
				session.close();
	    }
		return promotions;
	}

	@Override
	public PromotionModel findById(String idPromotion) {
		hibernateUtil myHibernateConfigurator= hibernateUtil.getHibernateConfigurator();				 
		Session session=myHibernateConfigurator.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		PromotionModel promotion = null;
		try{
			Criteria cr = session.createCriteria(PromotionModel.class);
			Criterion promoVerification = Restrictions.eq("idPromotion", idPromotion);
			Criterion startDate = Restrictions.lt("startDate",getTodayDate());
			Criterion endDate = Restrictions.gt("endDate",getTodayDate());
			LogicalExpression andExp1 = Restrictions.and(startDate, endDate);
			LogicalExpression andExp = Restrictions.and(promoVerification, andExp1);
			cr.add( andExp );
			List<PromotionModel> promotions = null;
			promotions = new  ArrayList<PromotionModel>();
			promotions=cr.list();
			for(PromotionModel promo:promotions){
				promotion=promo;				
			}
			session.flush();
            session.clear();
		} catch (Exception e) {
	            e.printStackTrace();
	            transaction.rollback();
		} finally {
			if(session.isOpen())
				session.close();
	    }
		return promotion;
	}


	private Date getTodayDate(){
		Date date = new Date();
		return date;
	}	
}