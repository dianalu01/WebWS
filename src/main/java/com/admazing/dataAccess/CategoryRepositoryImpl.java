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
import com.admazing.PromotionModel;
import com.admazing.StoreCategoryModel;
import com.admazing.core.contracts.CategoryRepository;
import com.admazing.core.contracts.StoreCategoryRepository;


public class CategoryRepositoryImpl implements CategoryRepository{
	
	@Override
	public List<CategoryModel> findById(String idStore) {
		Session session=hibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		List<CategoryModel> categories=null;
		try{
			StoreCategoryRepository repository= new StoreCategoryRepositoryImpl();
			List<StoreCategoryModel> storeCategories=new ArrayList<StoreCategoryModel>();
			storeCategories=repository.findById(idStore);
			categories = new  ArrayList<CategoryModel>();
			for(StoreCategoryModel storeCategory:storeCategories){
				categories.add((CategoryModel) session.get(CategoryModel.class, storeCategory.getIdCategory()));
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
		return categories;
	}
}
