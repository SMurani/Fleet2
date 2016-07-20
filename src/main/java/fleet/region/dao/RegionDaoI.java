package fleet.region.dao;



import java.util.List;

import javax.persistence.EntityManager;

import fleet.region.model.Region;

public interface RegionDaoI {
	
	Region add(Region region);
	
	Region load(Region region);
	
	List<Region> list(Region filter);
	
	void delete(Long regionId);

	void setEm(EntityManager em);

}

