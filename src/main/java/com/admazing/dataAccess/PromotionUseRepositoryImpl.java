package com.admazing.dataAccess;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.admazing.CategoryModel;
import com.admazing.PromotionUseModel;
import com.admazing.StoreCategoryModel;
import com.admazing.core.contracts.PromotionUseRepository;
import com.admazing.core.contracts.StoreCategoryRepository;

public class PromotionUseRepositoryImpl implements PromotionUseRepository{
	
	@Override
	public boolean save(String idUser, String idPromotion) {
		
		boolean success=false;
		hibernateUtil myHibernateConfigurator= hibernateUtil.getHibernateConfigurator();				 
		Session session=myHibernateConfigurator.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		try{
			String idCurrentPromotionUse=null;
			PromotionUseModel lastPromotionUse = null;
			Criteria cr = session.createCriteria(PromotionUseModel.class);
			cr.addOrder(Order.desc("idPromotionUse"));
			cr.setMaxResults(1);
			List<PromotionUseModel> promotionsUse = new ArrayList<PromotionUseModel>(); 
			promotionsUse=cr.list();
			for (PromotionUseModel promotionUse:promotionsUse){
				lastPromotionUse= promotionUse;
			}
			if(lastPromotionUse!=null){
				idCurrentPromotionUse=getNextIdPromotionUse(lastPromotionUse.getIdPromotionUse());
			}
			else{
				idCurrentPromotionUse="PU00000001";
			}
			PromotionUseModel currentPromotionUse=fillPromotionUse(idCurrentPromotionUse,idUser ,idPromotion);
		    session.save(currentPromotionUse);
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
			
	return success;
	}
	@Override
	public List<PromotionUseModel> findById(String idUser) {
		hibernateUtil myHibernateConfigurator= hibernateUtil.getHibernateConfigurator();				 
		Session session=myHibernateConfigurator.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		List<PromotionUseModel> promotionsUse = null;
		try{
			Criteria cr =session.createCriteria(PromotionUseModel.class);
			cr.add(Restrictions.eq("idUser", idUser));
			promotionsUse = new ArrayList<PromotionUseModel>();
			promotionsUse=cr.list();
			session.flush();
            session.clear();
		} catch (Exception e) {
	            e.printStackTrace();
	            transaction.rollback();
		} finally {
			if(session.isOpen())
				session.close();
	    }
		return promotionsUse;
	}


	private PromotionUseModel fillPromotionUse(String idPromotionUse, String idUser, String idPromotion ){
		PromotionUseModel currentPromotionUse = new PromotionUseModel();
		currentPromotionUse.setIdPromotionUse(idPromotionUse);
		currentPromotionUse.setIdUser(idUser);
		currentPromotionUse.setIdPromotion(idPromotion);
		return currentPromotionUse;
	}
	
	private String getNextIdPromotionUse(String idLastPromotionUse){
		Integer idPromotionUseCalculated=Integer.parseInt(idLastPromotionUse.substring(2))+1;
		String zeros=repeat("0", 8-(int)(Math.log10(idPromotionUseCalculated)+1));
		String idCurrenPromotionUse="PU"+zeros+String.valueOf(idPromotionUseCalculated);
		return idCurrenPromotionUse;
	}
	private static String repeat(String str, int times) {
	    return new String(new char[times]).replace("\0", str);
	}

}