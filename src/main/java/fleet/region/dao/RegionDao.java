package fleet.region.dao;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import fleet.region.model.Region;;

public class RegionDao implements RegionDaoI{
	
	private EntityManager em;
	
	public void setEm(EntityManager em) {
		this.em = em;
		
	}

	public Region add(Region region) {
		return em.merge(region);
	}

	public Region load(Region region) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Region> list(Region filter) {
		return em.createQuery("from Region r").getResultList();
	}


	public void delete(Long regionId)
	{
		em.remove(em.find(Region.class, regionId));
	}

	
}

