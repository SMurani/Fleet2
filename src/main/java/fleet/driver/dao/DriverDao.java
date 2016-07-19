package fleet.driver.dao;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import fleet.driver.model.Driver;;

public class DriverDao implements DriverDaoI{
	
	private EntityManager em;
	
	public void setEm(EntityManager em) {
		this.em = em;
		
	}

	public Driver add(Driver driver) {
		return em.merge(driver);
	}

	public Driver load(Driver driver) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Driver> list(Driver filter) {
		return em.createQuery("from Driver r").getResultList();
	}


	public void delete(Long driverId)
	{
		em.remove(em.find(Driver.class, driverId));
	}

	
}

