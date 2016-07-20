package fleet.region.bean;



import java.util.List;

import fleet.region.model.Region;;

public interface RegionBeanI {
	
	void add(Region region);
	
	List<Region> list();

	boolean delete(Long id);

}
