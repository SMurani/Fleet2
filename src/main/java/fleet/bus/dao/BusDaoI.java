package fleet.bus.dao;



import java.util.List;

import fleet.company.model.Company;
import fleet.generic.dao.GenericDaoI;
import fleet.bus.model.Bus;

public interface BusDaoI extends GenericDaoI<Bus, Long>{

				
	List<Bus> active();
	
	List<Bus> active2();
	
	Bus findByIdNq(Long id);
	
	List<Bus> sqlList();
	

}
