package com.admazing.dataAccess;


import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import com.admazing.AccessModel;
import com.admazing.CommercialAreaModel;
import com.admazing.core.contracts.CommercialAreaRepository;

public class CommercialAreaRepositoryImpl implements CommercialAreaRepository{
	@Override
	public CommercialAreaModel getByLatitudeLongitude(String latitude,String longitude) {
		hibernateUtil myHibernateConfigurator= hibernateUtil.getHibernateConfigurator();				 
		Session session=myHibernateConfigurator.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		double latitudeSearched =Double.parseDouble(latitude);
		double longitudeSearched =Double.parseDouble(longitude);
		CommercialAreaModel commercialArea = null;
		try{
			Criteria cr = session.createCriteria(CommercialAreaModel.class);
			List<CommercialAreaModel> commercialAreas =  new ArrayList<CommercialAreaModel>(); 
			commercialAreas=cr.list();
			for (CommercialAreaModel c : commercialAreas) {
				double currentLatitude=Double.parseDouble(c.getLatitude());
				double currentLongitude=Double.parseDouble(c.getLongitude());
				double currentDistance=Double.parseDouble(c.getDistance());
				double distance=Math.sqrt(Math.pow((latitudeSearched-currentLatitude),2)
						+Math.pow((longitudeSearched-currentLongitude),2));
				if(distance<=currentDistance){
			        session.flush();
	            	session.clear();
					commercialArea= c;
					break;
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
		return commercialArea;
	}

	@Override
	public String getIdLastCommercialArea(String idUser) {
		hibernateUtil myHibernateConfigurator= hibernateUtil.getHibernateConfigurator();				 
		Session session=myHibernateConfigurator.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		String idCommercialArea = null;
		try{
			Criteria cr = session.createCriteria(AccessModel.class);
			cr.add(Restrictions.eq("idUser", idUser));
			cr.addOrder(Order.desc("idAccess"));
			cr.setMaxResults(1);
			List<AccessModel> accesses = new ArrayList<AccessModel>(); 
			accesses=cr.list();
			for (AccessModel access:accesses){
				idCommercialArea=(String) access.getIdCommercialArea();
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
		return idCommercialArea;
	}

}
