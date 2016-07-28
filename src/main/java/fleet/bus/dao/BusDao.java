package fleet.bus.dao;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;


import fleet.generic.dao.GenericDao;
import fleet.bus.model.Bus;

public class BusDao extends GenericDao<Bus, Long> implements BusDaoI{

	@SuppressWarnings("unchecked")
	public List<Bus> active() {
		Session session = (Session) getEm().getDelegate();
		
		List<Bus> buss = session.createCriteria(Bus.class)
				.add(Restrictions.isNotNull("name"))
				.list();
		
		return buss;
	}

	@SuppressWarnings("unchecked")
	public List<Bus> active2() {
		
		List<Bus> buss = getEm().createNamedQuery(Bus.NQ_ALL)
				.getResultList();
		
		return buss;
	}

	@SuppressWarnings("unchecked")
	public Bus findByIdNq(Long id) {
		List<Bus> buss = getEm().createNamedQuery(Bus.NQ_FINDBYID)
				.setParameter("id", id)
				.getResultList();
		
		if(buss.isEmpty())
			return null;
		
		return buss.get(0);
	}
	
	@SuppressWarnings("unchecked")
	public List<Bus> sqlList() {
		Session session = (Session) getEm().getDelegate();
		
		List<Bus> buss = new ArrayList<Bus>();
		
		List<Object []> results = session.createSQLQuery("select id, name, manager,description,town from bus_buss")
				.list();
		
		Bus bus;
		for(Object [] result : results){
			bus = new Bus();
			if(result[0] != null)bus.setId( ((BigInteger) result[0]).longValue());
			if(result[1] != null)bus.setName ( (String) result[1]);
			if(result[2] != null)bus.setManager ( (String) result[2]);
			if(result[3] != null)bus.setBusDescription ( (String) result[3]);
			if(result[4] != null)bus.setTown ( (String) result[4]);
			buss.add(bus);
			
			
		}
		return buss;
	}
	
	
}

	
	


