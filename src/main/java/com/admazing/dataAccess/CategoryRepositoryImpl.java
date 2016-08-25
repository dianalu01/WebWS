package com.admazing.dataAccess;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.admazing.CategoryModel;
import com.admazing.core.contracts.CategoryRepository;


public class CategoryRepositoryImpl implements CategoryRepository{
	
	@Override
	public List<CategoryModel> findById(String idStore) {
		Session session=hibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		try{
			Criteria cr =session.createCriteria(CategoryModel.class)
			   .createCriteria("idCategory")
			   .add(Restrictions.eq("CT.idStore", idStore));
			List<CategoryModel> categories = new  ArrayList<CategoryModel>();
			categories = cr.list();
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
