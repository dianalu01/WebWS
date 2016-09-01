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
import com.admazing.PreferenceModel;
import com.admazing.core.contracts.PreferenceRepository;

public class PreferenceRepositoryImpl implements PreferenceRepository{
	
	@Override
	public boolean save(String idUser, String idCategory) {
		
		boolean success=false;
		if(!exist (idUser,idCategory)){				
			Session session=hibernateUtil.getSessionFactory().openSession();
			Transaction transaction=session.beginTransaction();
			try{
				PreferenceModel lastPreference = null;
				Criteria cr = session.createCriteria(PreferenceModel.class);
				cr.addOrder(Order.desc("idPreference"));
				cr.setMaxResults(1);
				List<PreferenceModel> preferences = new ArrayList<PreferenceModel>(); 
				preferences=cr.list();
				for (PreferenceModel preference:preferences){
					lastPreference= preference;
				}
				String idCurrentPreference=null;
				if(lastPreference!=null){
					idCurrentPreference=getNextIdPreference(lastPreference.getIdPreference());
				}
				else{
					idCurrentPreference="PF000001";
				}
				PreferenceModel currentPreference=fillPreference(idUser, idCurrentPreference ,idCategory);
			    session.save(currentPreference);
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
	public boolean delete(String idUser, String idCategory) {
		boolean success=false;
			Session session=hibernateUtil.getSessionFactory().openSession();
			Transaction transaction=session.beginTransaction();
			try{
				PreferenceModel preference = new PreferenceModel();
				preference=getById(idUser,idCategory);
				if(preference!=null){
					session.delete(preference);
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
	@Override
	public List<PreferenceModel> getAllById(String idUser) {
		Session session=hibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		List<PreferenceModel> preferences= null;
		try{
			Criteria cr = session.createCriteria(PreferenceModel.class);
			cr.add( Restrictions.eq("idUser", idUser));
			preferences = new  ArrayList<PreferenceModel>();
			preferences=cr.list();
			
			} catch (Exception e) {
	            e.printStackTrace();
	            transaction.rollback();
			} finally {
				if(session.isOpen())
					session.close();
		}
		return preferences;

	}

	private boolean exist(String idUser, String idCategory){
		boolean exist=false;
		if(getById(idUser,idCategory)!=null){
			exist=true;
		}
		return exist;
	}
	private PreferenceModel getById(String idUser, String idCategory){
		Session session=hibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		PreferenceModel preference= null;
		try{
			Criteria cr = session.createCriteria(PreferenceModel.class);

			Criterion user = Restrictions.eq("idUser", idUser);
			Criterion category = Restrictions.eq("idCategory",idCategory);
			LogicalExpression andExp = Restrictions.and(user, category);
			cr.add( andExp );

			List<PreferenceModel> preferences = new  ArrayList<PreferenceModel>();
			preferences=cr.list();
			for(PreferenceModel p:preferences){
				preference=p;
			}
			} catch (Exception e) {
	            e.printStackTrace();
	            transaction.rollback();
			} finally {
				if(session.isOpen())
					session.close();
		}
		return preference;
	}
	private PreferenceModel fillPreference(String idUser, String idPreference, String idCategory ){
		PreferenceModel currentPreference = new PreferenceModel();
		currentPreference.setIdUser(idUser);
		currentPreference.setIdPreference(idPreference);
		currentPreference.setIdCategory(idCategory);
		return currentPreference;
	}
	private String getNextIdPreference(String idLastPreference){
		Integer idPreferenceCalculated=Integer.parseInt(idLastPreference.substring(2))+1;
		String zeros=repeat("0", 6-(int)(Math.log10(idPreferenceCalculated)+1));
		String idCurrentPreference="PF"+zeros+String.valueOf(idPreferenceCalculated);
		return idCurrentPreference;
	}
	private static String repeat(String str, int times) {
	    return new String(new char[times]).replace("\0", str);
	}


	

}