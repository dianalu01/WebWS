package com.admazing.dataAccess;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.admazing.StoreCategoryModel;
import com.admazing.core.contracts.StoreCategoryRepository;


public class StoreCategoryRepositoryImpl implements StoreCategoryRepository{
	
	@Override
	public List<StoreCategoryModel> findById(String idStore) {
		Session session=hibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		List<StoreCategoryModel> storesCategories = null;
		try{
			Criteria cr =session.createCriteria(StoreCategoryModel.class);
			cr.add(Restrictions.eq("idStore", idStore));
			storesCategories = new ArrayList<StoreCategoryModel>();
			storesCategories=cr.list();
			session.flush();
            session.clear();
		} catch (Exception e) {
	            e.printStackTrace();
	            transaction.rollback();
		} finally {
			if(session.isOpen())
				session.close();
	    }
		return storesCategories;
	}
}
