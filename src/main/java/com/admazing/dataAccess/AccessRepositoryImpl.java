package com.admazing.dataAccess;


import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import com.admazing.AccessModel;
import com.admazing.core.contracts.AccessRepository;

public class AccessRepositoryImpl implements AccessRepository{
	
	@Override
	public boolean save(String idUser,String idCommercialArea) {
		boolean success=false;
		AccessModel lastAccess = null;
		hibernateUtil myHibernateConfigurator= hibernateUtil.getHibernateConfigurator();				 
		Session session=myHibernateConfigurator.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		try{
			Criteria cr = session.createCriteria(AccessModel.class);
			cr.addOrder(Order.desc("idAccess"));
			cr.setMaxResults(1);
			List<AccessModel> accesses = new ArrayList<AccessModel>(); 
			accesses=cr.list();
			for (AccessModel access: accesses){
				lastAccess=access;
			}

			String idCurrentAccess=null;
			if(lastAccess!=null){
				idCurrentAccess=getNextIdAccess(lastAccess.getIdAccess());
			}
			else{
				idCurrentAccess="AC00000001";
			}
			AccessModel currentAccess=fillAccess(idUser, idCommercialArea, idCurrentAccess);
			session.save(currentAccess);
		    
		    session.getTransaction().commit();	
		    session.flush();
            session.clear();
            success= true;
			
		} catch (Exception e) {
	            e.printStackTrace();
	            transaction.rollback();
		} finally {
			if(session.isOpen())
				session.close();
	    }
		return success;
		
	}
	private AccessModel fillAccess (String idUser, String idCommercialArea, String idCurrentAccess ){
		Date date = new Date();
		Time time=new Time(date.getTime());
		AccessModel currentAccess = new AccessModel();
		currentAccess.setIdAccess(idCurrentAccess);
		currentAccess.setIdUser(idUser);
		currentAccess.setIdCommercialArea(idCommercialArea);
		currentAccess.setDate(date);
		currentAccess.setTime(time);
		return currentAccess;
	}
	
	private String getNextIdAccess(String idLastAccess){
		Integer idAccessCalculated=Integer.parseInt(idLastAccess.substring(2))+1;
		String zeros=repeat("0", 8-(int)(Math.log10(idAccessCalculated)+1));
		
		String idCurrentAccess="AC"+zeros+String.valueOf(idAccessCalculated);
		return idCurrentAccess;
	}
	private static String repeat(String str, int times) {
        return new String(new char[times]).replace("\0", str);
    }
}