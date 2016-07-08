package com.admazing.dataAccess;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.admazing.CouponBookModel;
import com.admazing.PromotionModel;
import com.admazing.core.contracts.CouponBookRepository;

public class CouponBookRepositoryImpl implements CouponBookRepository{

	
	@Override
	public List<CouponBookModel> getAllById(String idUser) {
		Session session=hibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		try{
			List list = session.createSQLQuery("select * from cuponera where idusuario='"+idUser+"'").addEntity(CouponBookModel.class).list();
			Iterator itr = list.iterator();
			List<CouponBookModel> coupons = new ArrayList<CouponBookModel>();
			
			while(itr.hasNext()){
				coupons.add((CouponBookModel)itr.next());
			}
	        session.flush();
            session.clear();
			return coupons;
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