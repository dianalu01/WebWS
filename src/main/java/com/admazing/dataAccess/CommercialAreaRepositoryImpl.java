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
	public List<CommercialAreaModel> getAll() {
		hibernateUtil myHibernateConfigurator= hibernateUtil.getHibernateConfigurator();				 
		Session session=myHibernateConfigurator.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		List<CommercialAreaModel> commercialAreas =  null; 
		try{
			Criteria cr = session.createCriteria(CommercialAreaModel.class);
			commercialAreas =  new ArrayList<CommercialAreaModel>(); 
			commercialAreas=cr.list();
			session.flush();
            session.clear();
		} catch (Exception e) {
	            e.printStackTrace();
	            transaction.rollback();
		} finally {
			if(session.isOpen())
				session.close();
	    }
		return commercialAreas;
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
