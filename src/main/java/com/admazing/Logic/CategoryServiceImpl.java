package com.admazing.Logic;

import java.util.ArrayList;
import java.util.List;

import com.admazing.CategoryModel;
import com.admazing.PreferedCategoryModel;
import com.admazing.PreferenceModel;
import com.admazing.core.contracts.CategoryRepository;
import com.admazing.core.contracts.CategoryService;
import com.admazing.core.contracts.PreferenceRepository;
import com.admazing.dataAccess.CategoryRepositoryImpl;
import com.admazing.dataAccess.PreferenceRepositoryImpl;

public class CategoryServiceImpl implements CategoryService {

	private CategoryRepository categoryRepository= new CategoryRepositoryImpl();
	private PreferenceRepository preferenceRepository = new PreferenceRepositoryImpl();
	
	@Override
	public List<PreferedCategoryModel> getAllPrefered(String idUser) {
		List<PreferenceModel> preferences=preferenceRepository.getAllById(idUser);
		List<CategoryModel> categories=categoryRepository.getAll();
		List<PreferedCategoryModel> preferedCategories = new ArrayList<PreferedCategoryModel>();
		if(categories!=null){
			for (CategoryModel category : categories) {
				PreferedCategoryModel preferedCategory = new PreferedCategoryModel();
				preferedCategory.setCategory(category);
				preferedCategory.setIsPrefered(isPrefered(category, preferences));				
				preferedCategories.add(preferedCategory);
			}
		}
		return preferedCategories;
	}

	@Override
	public List<CategoryModel> getById(String idStore) {
		List<CategoryModel> categories=categoryRepository.findById(idStore);
		return categories;
		
	}

	@Override
	public List<CategoryModel> getByPreference(String idStore, String idUser) {
		
		List<PreferenceModel> preferences=preferenceRepository.getAllById(idUser);
		List<CategoryModel> categories=categoryRepository.findById(idStore);
		List<CategoryModel> categoriesPrefered = new ArrayList<CategoryModel>();
		if(preferences!=null&&categories!=null){
			for (CategoryModel category : categories) {
				if(isPrefered(category,preferences)){
					categoriesPrefered.add(category);
				}				
			}
		}
		return categoriesPrefered;
	}
	
	private boolean isPrefered(CategoryModel category, List<PreferenceModel> preferences){
		if(preferences!=null){
			for(PreferenceModel preference:preferences){
				if(category.getIdCategory().compareTo(preference.getIdCategory())==0){
					return true;					
				}
			}
		}
		return false;
		
	}


}
