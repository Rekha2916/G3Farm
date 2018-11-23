package com.g3farm.dao;

import java.util.List;

import org.hibernate.SessionFactory;


import com.g3farm.model.G3FarmFarmer;



public class FarmDaoImplement implements IFarmerDao {
	

	private SessionFactory sessionFactory;
	
	

	public void addFarmer(G3FarmFarmer f) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(f);
		
		
	}

	public G3FarmFarmer updateFarmer(G3FarmFarmer f) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(f);
		return f;
		
	}
	@SuppressWarnings("unchecked")
	public List<G3FarmFarmer> listFarmer() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Farm_Farmer").list();
	}

	public G3FarmFarmer getFarmerById(int id) {
		// TODO Auto-generated method stub
		return (G3FarmFarmer) sessionFactory.getCurrentSession().get(
				G3FarmFarmer.class, id);
	}

	public void removeFarmer(int id) {
		// TODO Auto-generated method stub
		G3FarmFarmer f = (G3FarmFarmer) sessionFactory.getCurrentSession().load(
				G3FarmFarmer.class, id);
		if (null != f) {
			this.sessionFactory.getCurrentSession().delete(f);
		}
		
	}

}
