package com.admazing.dataAccess;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.admazing.ProductModel;
import com.admazing.core.contracts.ProductRepository;


public class ProductRepositoryImpl implements ProductRepository{
	
	@Override
	public ProductModel findById(String idProduct) {
		hibernateUtil myHibernateConfigurator= hibernateUtil.getHibernateConfigurator();				 
		Session session=myHibernateConfigurator.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		ProductModel product = null;
		try{
			product = (ProductModel) session.get(ProductModel.class, idProduct);
	        session.flush();
            session.clear();
		} catch (Exception e) {
	            e.printStackTrace();
	            transaction.rollback();
		} finally {
			if(session.isOpen())
				session.close();
	    }
		return product;
	}
}