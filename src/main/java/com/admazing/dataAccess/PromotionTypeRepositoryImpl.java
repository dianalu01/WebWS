package com.admazing.dataAccess;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.admazing.PromotionTypeModel;
import com.admazing.core.contracts.PromotionTypeRepository;


public class PromotionTypeRepositoryImpl implements PromotionTypeRepository{
	
	@Override
	public PromotionTypeModel findById(String idPromotionType) {
		Session session=hibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		PromotionTypeModel promotionType = null;
		try{
			promotionType = (PromotionTypeModel) session.get(PromotionTypeModel.class, idPromotionType);
	        session.flush();
            session.clear();
		} catch (Exception e) {
	            e.printStackTrace();
	            transaction.rollback();
		} finally {
			if(session.isOpen())
				session.close();
	    }
		return promotionType;
	}
}