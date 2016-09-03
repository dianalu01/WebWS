package com.admazing.dataAccess;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;

import com.admazing.PromotionUseModel;
import com.admazing.core.contracts.PromotionUseRepository;

public class PromotionUseRepositoryImpl implements PromotionUseRepository{
	
	@Override
	public boolean save(String idUser, String idPromotion) {
		
		boolean success=false;
		Session session=hibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		try{
			PromotionUseModel lastPromotionUse = null;
			Criteria cr = session.createCriteria(PromotionUseModel.class);
			cr.addOrder(Order.desc("idPromotionUse"));
			cr.setMaxResults(1);
			List<PromotionUseModel> promotionsUse = new ArrayList<PromotionUseModel>(); 
			promotionsUse=cr.list();
			for (PromotionUseModel promotionUse:promotionsUse){
				lastPromotionUse= promotionUse;
			}
			
			String idCurrentPromotionUse;
			if(lastPromotionUse!=null){
				idCurrentPromotionUse=getNextIdPromotionUse(lastPromotionUse.getIdPromotionUse());
			}
			else{
				idCurrentPromotionUse="PU000001";
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
	
	private PromotionUseModel fillPromotionUse(String idPromotionUse, String idUser, String idPromotion ){
		PromotionUseModel currentPromotionUse = new PromotionUseModel();
		currentPromotionUse.setIdPromotionUse(idPromotionUse);
		currentPromotionUse.setIdUser(idUser);
		currentPromotionUse.setIdPromotion(idPromotion);
		return currentPromotionUse;
	}
	
	private String getNextIdPromotionUse(String idLastPromotionUse){
		Integer idPromotionUseCalculated=Integer.parseInt(idLastPromotionUse.substring(2))+1;
		String zeros=repeat("0", 6-(int)(Math.log10(idPromotionUseCalculated)+1));
		String idCurrenPromotionUse="PU"+zeros+String.valueOf(idPromotionUseCalculated);
		return idCurrenPromotionUse;
	}
	private static String repeat(String str, int times) {
	    return new String(new char[times]).replace("\0", str);
	}

}