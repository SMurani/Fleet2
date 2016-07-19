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
				.add(Restrictions.isNotNull("service_to"))
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
		Session session = (Session) getEm().getDelegate();
		
		List<Service> services = new ArrayList<Service>();
		
		List<Object []> results = session.createSQLQuery("select id, service_to, service_from,description,route, cost from service_services")
				.list();
		
		Service service;
		for(Object [] result : results){
			service = new Service();
			if(result[0] != null)service.setId( ((BigInteger) result[0]).longValue());
			if(result[1] != null)service.setServiceFrom ( (String) result[1]);
			if(result[2] != null)service.setServiceTo ( (String) result[2]);
			if(result[3] != null)service.setServiceDescription ( (String) result[3]);
			if(result[4] != null)service.setRoute ( (String) result[4]);
			if(result[5] != null)service.setServicecost ( (Double) result[5]);
			services.add(service);
			
			
		}
		return services;
	}
	
	
}
	/*private EntityManager em;

	
	public Service add(Service service) {
		
		return em.merge(service);
	}
	
	

	public Service load(Service service) {
		
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<Service> list(Service filter) {
		List<Service>  services = new ArrayList<Service>();
		Service service = new Service();
		return em.createQuery("from Service p").getResultList();
		
	}

	public void delete(Long serviceId) {
		
	}



	public void setEm(EntityManager em) {
		this.em=em;
		
	}*/
	
	


