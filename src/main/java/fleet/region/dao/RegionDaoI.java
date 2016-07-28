package fleet.region.dao;



import java.util.List;

import fleet.company.model.Company;
import fleet.generic.dao.GenericDaoI;
import fleet.region.model.Region;

public interface RegionDaoI extends GenericDaoI<Region, Long>{

				
	List<Region> active();
	
	List<Region> active2();
	
	Region findByIdNq(Long id);
	
	List<Region> sqlList();
	

}
