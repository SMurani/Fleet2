package fleet.region.dao;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;


import fleet.generic.dao.GenericDao;
import fleet.region.model.Region;

public class RegionDao extends GenericDao<Region, Long> implements RegionDaoI{

	@SuppressWarnings("unchecked")
	public List<Region> active() {
		Session session = (Session) getEm().getDelegate();
		
		List<Region> regions = session.createCriteria(Region.class)
				.add(Restrictions.isNotNull("name"))
				.list();
		
		return regions;
	}

	@SuppressWarnings("unchecked")
	public List<Region> active2() {
		
		List<Region> regions = getEm().createNamedQuery(Region.NQ_ALL)
				.getResultList();
		
		return regions;
	}

	@SuppressWarnings("unchecked")
	public Region findByIdNq(Long id) {
		List<Region> regions = getEm().createNamedQuery(Region.NQ_FINDBYID)
				.setParameter("id", id)
				.getResultList();
		
		if(regions.isEmpty())
			return null;
		
		return regions.get(0);
	}
	
	@SuppressWarnings("unchecked")
	public List<Region> sqlList() {
		Session session = (Session) getEm().getDelegate();
		
		List<Region> regions = new ArrayList<Region>();
		
		List<Object []> results = session.createSQLQuery("select id, name, manager,description,town from region_regions")
				.list();
		
		Region region;
		for(Object [] result : results){
			region = new Region();
			if(result[0] != null)region.setId( ((BigInteger) result[0]).longValue());
			if(result[1] != null)region.setName ( (String) result[1]);
			if(result[2] != null)region.setManager ( (String) result[2]);
			if(result[3] != null)region.setRegionDescription ( (String) result[3]);
			if(result[4] != null)region.setTown ( (String) result[4]);
			regions.add(region);
			
			
		}
		return regions;
	}
	
	
}

	
	


