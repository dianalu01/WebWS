package com.admazing.dataAccess;



import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.admazing.PromotionTypeModel;
import com.admazing.UserModel;
import com.admazing.core.contracts.PromotionTypeRepository;


public class PromotionTypeRepositoryImpl implements PromotionTypeRepository{
	
	@Override
	public PromotionTypeModel findById(String idPromotionType) {
		Session session=hibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		try{
			PromotionTypeModel promotionType = (PromotionTypeModel) session.get(PromotionTypeModel.class, idPromotionType);
	        session.flush();
            session.clear();
			return promotionType;
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