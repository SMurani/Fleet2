package fleet.region.bean;

import java.util.List;

import fleet.company.model.Company;
import fleet.region.model.Region;

public interface RegionBeanI {

	void add(Region region);
	
	String load(Long id);

	List<Region> list();
	
	boolean delete(Long id);

	String listInJson();

}
