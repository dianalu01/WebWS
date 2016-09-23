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
		List<CouponBookModel> coupons = null;
		try{
			Criteria cr = session.createCriteria(CouponBookModel.class);
			cr.add( Restrictions.eq("idUser", idUser));
			coupons = new  ArrayList<CouponBookModel>();
			coupons=cr.list();	        
			session.flush();
            session.clear();
		} catch (Exception e) {
	            e.printStackTrace();
	            transaction.rollback();
		} finally {
			if(session.isOpen())
				session.close();
	    }
		return coupons;
	}

	@Override
	public boolean save(String idUser, String idPromotion) {
		
		boolean success=false;
		if(!exist (idUser,idPromotion)){				
			Session session=hibernateUtil.getSessionFactory().openSession();
			Transaction transaction=session.beginTransaction();
			try{
				CouponBookModel lastCouponBook = null;
				Criteria cr = session.createCriteria(CouponBookModel.class);
				cr.add(Restrictions.eq("idUser", idUser));
				cr.addOrder(Order.desc("idCouponBook"));
				cr.setMaxResults(1);
				List<CouponBookModel> coupons = new ArrayList<CouponBookModel>(); 
				coupons=cr.list();
				for (CouponBookModel coupon:coupons){
					lastCouponBook= coupon;
				}
				
				String idCurrentCouponBook;
				if(lastCouponBook!=null){
					idCurrentCouponBook=getNextIdCouponBook(lastCouponBook.getIdCouponBook());
				}
				else{
					idCurrentCouponBook="CP000001";
				}
				CouponBookModel currentCouponBook=fillCouponBook(idUser, idCurrentCouponBook ,idPromotion);
			    session.save(currentCouponBook);
			    session.getTransaction().commit();		
		        session.flush();
		        session.clear();
		        success=true;
				
			} catch (Exception e) {
		            e.printStackTrace();
		            transaction.rollback();
			} finally {
				if(session.isOpen())
					session.close();
		    }
		}		
		return success;
	}
	
	
	
	@Override
	public boolean delete(String idUser, String idPromotion) {
		boolean success=false;
			Session session=hibernateUtil.getSessionFactory().openSession();
			Transaction transaction=session.beginTransaction();
			try{
				CouponBookModel coupon = new CouponBookModel();
				coupon=getById(idUser,idPromotion);
				if(coupon!=null){
					session.delete(coupon);
				    session.getTransaction().commit();
					session.flush();
			        session.clear();
			        success=true;	
				}				
				
			} catch (Exception e) {
		            e.printStackTrace();
		            transaction.rollback();
			} finally {
				if(session.isOpen())
					session.close();
		    
		}		
		return success;

	}
	private boolean exist(String idUser, String idPromotion){
		boolean exist=false;
		if(getById(idUser,idPromotion)!=null){
			exist=true;
		}
		return exist;
	}
	private CouponBookModel getById(String idUser, String idPromotion){
		Session session=hibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		CouponBookModel coupon= null;
		try{
			Criteria cr = session.createCriteria(CouponBookModel.class);

			Criterion user = Restrictions.eq("idUser", idUser);
			Criterion promotion = Restrictions.eq("idPromotion",idPromotion);
			LogicalExpression andExp = Restrictions.and(user, promotion);
			cr.add( andExp );

			List<CouponBookModel> coupons = new  ArrayList<CouponBookModel>();
			coupons=cr.list();
			for(CouponBookModel c:coupons){
				coupon=c;
			}
			} catch (Exception e) {
	            e.printStackTrace();
	            transaction.rollback();
			} finally {
				if(session.isOpen())
					session.close();
		}
		return coupon;
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