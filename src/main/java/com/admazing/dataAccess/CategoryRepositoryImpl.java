package com.admazing.dataAccess;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.admazing.CategoryModel;
import com.admazing.core.contracts.CategoryRepository;


public class CategoryRepositoryImpl implements CategoryRepository{
	
	@Override
	public List<CategoryModel> findById(String idStore) {
		Session session=hibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		try{
			List list = session.createSQLQuery("select C.* from tiendacategoria TC inner join categoria C on TC.codcategoria=C.idcategoria where codtienda='"+idStore+"'").addEntity(CategoryModel.class).list();
			Iterator itr = list.iterator();
			List<CategoryModel> categories = new  ArrayList<CategoryModel>();
			while(itr.hasNext()){
				categories.add((CategoryModel)itr.next());
			}
	        session.flush();
            session.clear();
			return categories;
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
