package fleet.service.bean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import fleet.car.model.Car;
import fleet.company.dao.CompanyDao;
import fleet.company.model.Company;
import fleet.service.dao.ServiceDao;
import fleet.service.dao.ServiceDaoI;
import fleet.service.model.Service;
import fleet.vendor.model.Vendor;


@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class ServiceBean implements ServiceBeanI{
	
	@PersistenceContext
	private EntityManager em;
	
	
	@Inject
	private ServiceDaoI serviceDao;
	
	@PostConstruct
	public void init(){
		serviceDao.setEm(em);
	}

	
	public void add(Service service){

		if(service == null)
			return;

		/*if(service.getCarId() != null)
			service.setCar(em.getReference(Car.class, service.getCarId().intValue()));

		if(service.getVendorId() != null)
			service.setVendor(em.getReference(Vendor.class, service.getVendorId().intValue()));*/

		
		serviceDao.save(service);
	}
	
	public List<Service> list(){
		return serviceDao.list(new Service());
	}
	


	public boolean delete(Long id) {
		serviceDao.delete(id);
		return true;
	}


	public String listInJson() {
		Map<String, Object> filter = new HashMap<String, Object>();
		
		

		List<Service> services = serviceDao.active2();
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		
		int count = serviceDao.countAll();
		for(Service service : services){
			sb.append(service.getJson());
			
			count--;
			
			if(count >= 1)
				sb.append(",");
		}
		
		sb.append("]");
		
		return sb.toString();
		
	}


	public String load(Long id){

		Service service=serviceDao.findByIdNq(id);
		
		if(service != null)
			return service.getJson();
		else
			return "{}";
	}	

}
