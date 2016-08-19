package com.admazing.dataAccess;



import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.admazing.ProductModel;
import com.admazing.UserModel;
import com.admazing.core.contracts.ProductRepository;


public class ProductRepositoryImpl implements ProductRepository{
	
	@Override
	public ProductModel findById(String idProduct) {
		Session session=hibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		try{
			ProductModel product = (ProductModel) session.get(ProductModel.class, idProduct);
	        session.flush();
            session.clear();
			return product;
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