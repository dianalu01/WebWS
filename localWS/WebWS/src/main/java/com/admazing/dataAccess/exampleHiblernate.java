package com.admazing.dataAccess;

import java.util.List;
import java.util.Iterator;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.admazing.UsuarioModel;
import com.admazing.ZonaComercialModel;
import com.admazing.core.contracts.ZonaComercialRepositorio;

public class exampleHiblernate{
	public static void main(String args[]){
		Session session = hibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
/*		List list = session.createSQLQuery("select * from usuario").addEntity(UsuarioModel.class).list();
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			UsuarioModel bd = (UsuarioModel)itr.next();
			System.out.println(bd.getNombre());
		}*/
		session.getTransaction().commit();
		System.out.println("Zona comercial");
		ZonaComercialRepositorio zonaRepo=new ZonaComercialRepositorioImpl();
		ZonaComercialModel model=zonaRepo.getByLatitudLongitud("-16.416089874820436", "-71.51560485363007");
		System.out.println(model.getNombre());
	
}
}

