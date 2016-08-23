package com.admazing.dataAccess;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.admazing.CouponBookModel;
import com.admazing.core.contracts.CouponBookRepository;

public class CouponBookRepositoryImpl implements CouponBookRepository{

	
	@Override
	public List<CouponBookModel> getAllById(String idUser) {
		Session session=hibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		try{
			Criteria cr = session.createCriteria(CouponBookModel.class);
			cr.add(Restrictions.eq("idUser", idUser));
			List<CouponBookModel> coupons = new ArrayList<CouponBookModel>(); 
			coupons=cr.list();
	        
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

	@Override
	public boolean save(String idUser, String idPromotion) {
		CouponBookModel lastCouponBook = null;
		if(!exist (idUser,idPromotion)){
				
			Session session=hibernateUtil.getSessionFactory().openSession();
			Transaction transaction=session.beginTransaction();
			try{
				Criteria cr = session.createCriteria(CouponBookModel.class);
				cr.add(Restrictions.eq("idUser", idUser));
				cr.addOrder(Order.desc("idCouponBook"));
				cr.setMaxResults(1);
				List<CouponBookModel> coupons = new ArrayList<CouponBookModel>(); 
				coupons=cr.list();
				for (CouponBookModel coupon:coupons){
					lastCouponBook= coupon;
				}
				String idCurrentCouponBook=getNextIdCouponBook(lastCouponBook.getIdCouponBook());
				
				CouponBookModel currentCouponBook=fillCouponBook(idUser, idCurrentCouponBook ,idPromotion);
			    session.save(currentCouponBook);
			    session.getTransaction().commit();		
		        session.flush();
		        session.clear();
				
			} catch (Exception e) {
		            e.printStackTrace();
		            transaction.rollback();
			} finally {
				if(session.isOpen())
					session.close();
		    }
	        return true;

		}
		return false;
		
	}
	
	
	
	@Override
	public boolean deletePromotion(String idUser, String idPromotion) {
		Session session=hibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		
		//FALTA DESARROLLAR
		return false;
	}
	public boolean exist(String idUser, String idPromotion){
		boolean exist=false;
		Session session=hibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		try{
			Criteria cr = session.createCriteria(CouponBookModel.class);

			Criterion user = Restrictions.eq("idUser", idUser);
			Criterion promotion = Restrictions.eq("idPromotion",idPromotion);
			LogicalExpression andExp = Restrictions.and(user, promotion);
			cr.add( andExp );

			List<CouponBookModel> coupons = new  ArrayList<CouponBookModel>();
			coupons=cr.list();
			for(CouponBookModel coupon:coupons){
				if(coupon!=null){
					exist=true;
				}
			}
			} catch (Exception e) {
	            e.printStackTrace();
	            transaction.rollback();
			} finally {
				if(session.isOpen())
					session.close();
		}
		return exist;
	}

	private CouponBookModel fillCouponBook(String idUser, String idCouponBook, String idPromotion ){
		CouponBookModel currentCouponBook = new CouponBookModel();
		currentCouponBook.setIdUser(idUser);
		currentCouponBook.setIdCouponBook(idCouponBook);
		currentCouponBook.setIdPromotion(idPromotion);
		return currentCouponBook;
	}
	
	private String getNextIdCouponBook(String idLastCoupon){
		Integer idCouponCalculated=Integer.parseInt(idLastCoupon.substring(2))+1;
		String zeros=repeat("0", 6-(int)(Math.log10(idCouponCalculated)+1));
	
	String idCurrentCoupon="CP"+zeros+String.valueOf(idCouponCalculated);
		return idCurrentCoupon;
	}
	private static String repeat(String str, int times) {
	    return new String(new char[times]).replace("\0", str);
	}
	
	
	
}