package com.admazing.dataAccess;


import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.admazing.AccessModel;
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

	@Override
	public boolean save(String idUser, String idPromotion) {
		CouponBookModel lastCouponBook = null;
		Session session=hibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		try{
			List list = session.createSQLQuery("select * from cuponera where idusuario='"+idUser+"' order by idcuponera desc limit 1 ").addEntity(CouponBookModel.class).list();
			Iterator itr = list.iterator();
			List<CouponBookModel> couponBooks = new  ArrayList<CouponBookModel>();
			while(itr.hasNext()){
				lastCouponBook=(CouponBookModel)itr.next();
			}
			String idCurrentCouponBook=getNextIdCouponBook(lastCouponBook.getIdCouponBook());
			
			CouponBookModel currentCouponBook=fillCouponBook(idUser, idCurrentCouponBook ,idPromotion);
		    session.save(currentCouponBook);
		    session.getTransaction().commit();		
	        session.flush();
	        session.clear();
	        return true;
			
		} catch (Exception e) {
	            e.printStackTrace();
	            transaction.rollback();
		} finally {
			if(session.isOpen())
				session.close();
	    }
		return false;

		
	}
	
	
	@Override
	public boolean deletePromotion(String idUser, String idPromotion) {
		Session session=hibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		
		
		return false;
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