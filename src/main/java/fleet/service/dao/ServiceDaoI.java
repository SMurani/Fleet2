package fleet.service.dao;



import java.util.List;

import fleet.company.model.Company;
import fleet.generic.dao.GenericDaoI;
import fleet.service.model.Service;

public interface ServiceDaoI extends GenericDaoI<Service, Long>{
	/*
	Service add(Service service);
	
	Service load(Service service);
	
	List<Service> list(Service filter);
	
	void delete(Long serviceId);

	void setEm(EntityManager em);*/
				
	List<Service> active();
	
	List<Service> active2();
	
	Service findByIdNq(Long id);
	
	List<Service> sqlList();
	

}
