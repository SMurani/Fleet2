package fleet.bus.bean;

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


import fleet.company.dao.CompanyDao;
import fleet.company.model.Company;
import fleet.bus.dao.BusDao;
import fleet.bus.dao.BusDaoI;
import fleet.bus.model.Bus;


@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class BusBean implements BusBeanI{
	
	@PersistenceContext
	private EntityManager em;
	
	
	@Inject
	private BusDaoI busDao;
	
	@PostConstruct
	public void init(){
		busDao.setEm(em);
	}

	
	public void add(Bus bus){


		if(bus == null)
			return;

		
		busDao.save(bus);
	}
	
	public List<Bus> list(){
		return busDao.list(new Bus());
	}
	


	public boolean delete(Long id) {
		busDao.delete(id);
		return true;
	}


	public String listInJson() {
		Map<String, Object> filter = new HashMap<String, Object>();
		
		

		List<Bus> buss = busDao.sqlList();
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		
		int count = busDao.countAll();
		for(Bus bus : buss){
			sb.append(bus.getJson());
			
			count--;
			
			if(count >= 1)
				sb.append(",");
		}
		
		sb.append("]");
		
		return sb.toString();
		
	}


	public String load(Long id){

		Bus bus=busDao.findByIdNq(id);
		
		if(bus != null)
			return bus.getJson();
		else
			return "{}";
	}	

}
