package com.admazing.dataAccess;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.admazing.CuponeraModel;
import com.admazing.PromocionModel;
import com.admazing.core.contracts.CuponeraRepositorio;

public class CuponeraRepositorioImpl implements CuponeraRepositorio{

	
	@Override
	public List<CuponeraModel> getAllById(String idUsuario) {
		Session session=hibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		try{
			List list = session.createSQLQuery("select * from cuponera where idusuario='"+idUsuario+"'").addEntity(CuponeraModel.class).list();
			Iterator itr = list.iterator();
			List<CuponeraModel> bd = new ArrayList<CuponeraModel>();
			System.out.println(((CuponeraModel)list.get(3)).getIdcuponera());
			
			while(itr.hasNext()){
				bd.add((CuponeraModel)itr.next());
			}
	        session.flush();
            session.clear();
			return bd;
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
