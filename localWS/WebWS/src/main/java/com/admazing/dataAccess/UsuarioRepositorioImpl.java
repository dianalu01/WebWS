package com.admazing.dataAccess;


import com.admazing.UsuarioModel;
import com.admazing.core.contracts.UsuarioRepositorio;

public class UsuarioRepositorioImpl implements UsuarioRepositorio{
	 /*SessionFactory sessionFactory = HibernatePersistence.getSessionFactory();
	 Session session = sessionFactory.openSession();
*/
	public void update(UsuarioModel usuario) {
	/*	 session.beginTransaction();
		 session.save(usuario);
	     session.getTransaction().commit();
	     HibernatePersistence.shutdown();
	     session.close();
	*/}

	public UsuarioModel findById(String idUsuario) {

      /*  session.beginTransaction();
        UsuarioModel usuario = (UsuarioModel) session.get(UsuarioModel.class, idUsuario);
        HibernatePersistence.shutdown();
        session.close();
		return usuario;*/ return null;
	}
}
