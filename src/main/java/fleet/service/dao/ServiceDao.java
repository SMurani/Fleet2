package fleet.service.dao;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import fleet.company.model.Company;
import fleet.generic.dao.GenericDao;
import fleet.service.model.Service;

public class ServiceDao extends GenericDao<Service, Long> implements ServiceDaoI{

	@SuppressWarnings("unchecked")
	public List<Service> active() {
		Session session = (Session) getEm().getDelegate();
		
		List<Service> services = session.createCriteria(Service.class)
				.add(Restrictions.isNotNull("car"))
				.list();
		
		return services;
	}

	@SuppressWarnings("unchecked")
	public List<Service> active2() {
		
		List<Service> services = getEm().createNamedQuery(Service.NQ_ALL)
				.getResultList();
		
		return services;
	}

	@SuppressWarnings("unchecked")
	public Service findByIdNq(Long id) {
		List<Service> services = getEm().createNamedQuery(Service.NQ_FINDBYID)
				.setParameter("id", id)
				.getResultList();
		
		if(services.isEmpty())
			return null;
		
		return services.get(0);
	}
	
	@SuppressWarnings("unchecked")
	public List<Service> sqlList() {
	/*	Session session = (Session) getEm().getDelegate();
		
		List<Service> services = new ArrayList<Service>();
		
		List<Object []> results = session.createSQLQuery("select id, service_date, car,odometer,service_completed, vendor, reference_no,document,comment from service_services")
				.list();
		
		Service service;
		for(Object [] result : results){
			service = new Service();
			if(result[0] != null)service.setId( ((BigInteger) result[0]).longValue());
			if(result[1] != null)service.setServiceDate ( (String) result[1]);
			//if(result[2] != null)service.setVehicle ( (String) result[2]);
			if(result[3] != null)service.setOdometer ( (String) result[3]);
			if(result[4] != null)service.setServiceCompleted ( (String) result[4]);
			//if(result[5] != null)service.setVendor1 ( (String) result[5]);
			if(result[6] != null)service.setReference ( (String) result[6]);
			if(result[7] != null)service.setDocument ( (String) result[7]);
			if(result[8] != null)service.setComment ( (String) result[8]);
			services.add(service);
			
			
		}*/
		return null;
	}
	
	
}
	
	
	


