package fleet.service.dao;



import java.util.List;

import fleet.company.model.Company;
import fleet.generic.dao.GenericDaoI;
import fleet.service.model.Service;

public interface ServiceDaoI extends GenericDaoI<Service, Long>{
	
				
	List<Service> active();
	
	List<Service> active2();
	
	Service findByIdNq(Long id);
	
	List<Service> sqlList();
	

}
