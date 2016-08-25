package com.admazing.dataAccess;


import java.util.ArrayList;
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
		Session session=hibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		List<PromotionModel> promotions = null;
		try{
			Criteria cr = session.createCriteria(PromotionModel.class);
			Criterion category = Restrictions.eq("idCategory", idCategory);
			Criterion store = Restrictions.eq("idStore",idStore);
			LogicalExpression andExp = Restrictions.and(category, store);
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
		Session session=hibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		PromotionModel promotion = null;
		try{
			promotion = (PromotionModel) session.get(PromotionModel.class, idPromotion);
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
}