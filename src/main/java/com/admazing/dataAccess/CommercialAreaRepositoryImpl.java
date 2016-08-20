package com.admazing.dataAccess;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.admazing.CommercialAreaModel;
import com.admazing.core.contracts.CommercialAreaRepository;

public class CommercialAreaRepositoryImpl implements CommercialAreaRepository{
	@Override
	public CommercialAreaModel getByLatitudeLongitude(String latitude,String longitude) {
		Session session=hibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		double latitudeSearched =Double.parseDouble(latitude);
		double longitudeSearched =Double.parseDouble(longitude);
		try{
			Criteria cr = session.createCriteria(CommercialAreaModel.class);
			List<CommercialAreaModel> commercialAreas =  new ArrayList<CommercialAreaModel>(); 
			commercialAreas=cr.list();
			for (CommercialAreaModel commercialArea : commercialAreas) {
				double currentLatitude=Double.parseDouble(commercialArea.getLatitude());
				double currentLongitude=Double.parseDouble(commercialArea.getLongitude());
				double currentDistance=Double.parseDouble(commercialArea.getDistance());
				double distance=Math.sqrt(Math.pow((latitudeSearched-currentLatitude),2)
						+Math.pow((longitudeSearched-currentLongitude),2));
				if(distance<=currentDistance){
			        session.flush();
	            	session.clear();
					return commercialArea;	
				}
			}
	        session.flush();
            session.clear();
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
	public String getIdLastCommercialArea(String idUser) {
		Session session=hibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		try{
			List list = session.createSQLQuery("select zonacomercial from acceso where idusuario='"+idUser+"' order by idacceso desc limit 1").list();
			Iterator itr = list.iterator();
			String idCommercialArea = null;
			while(itr.hasNext()){
				idCommercialArea=(String) itr.next();
			}
	        session.flush();
            session.clear();
			return idCommercialArea;
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
