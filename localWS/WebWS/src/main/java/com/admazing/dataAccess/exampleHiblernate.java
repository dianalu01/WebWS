package com.admazing.dataAccess;

import java.util.List;
import java.util.Iterator;
import org.hibernate.Session;

import com.admazing.UsuarioModel;

public class exampleHiblernate{
	public static void main(String args[]){
		Session session = hibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List list = session.createSQLQuery("select * from usuario").addEntity(UsuarioModel.class).list();
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			UsuarioModel bd = (UsuarioModel)itr.next();
			System.out.println(bd.getNombre());
		}
		session.getTransaction().commit();
	
}
}

