package fleet.region.bean;

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
import fleet.region.dao.RegionDao;
import fleet.region.dao.RegionDaoI;
import fleet.region.model.Region;


@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class RegionBean implements RegionBeanI{
	
	@PersistenceContext
	private EntityManager em;
	
	
	@Inject
	private RegionDaoI regionDao;
	
	@PostConstruct
	public void init(){
		regionDao.setEm(em);
	}

	
	public void add(Region region){


		if(region == null)
			return;

		
		regionDao.save(region);
	}
	
	public List<Region> list(){
		return regionDao.list(new Region());
	}
	


	public boolean delete(Long id) {
		regionDao.delete(id);
		return true;
	}


	public String listInJson() {
		Map<String, Object> filter = new HashMap<String, Object>();
		
		

		List<Region> regions = regionDao.sqlList();
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		
		int count = regionDao.countAll();
		for(Region region : regions){
			sb.append(region.getJson());
			
			count--;
			
			if(count >= 1)
				sb.append(",");
		}
		
		sb.append("]");
		
		return sb.toString();
		
	}


	public String load(Long id){

		Region region=regionDao.findByIdNq(id);
		
		if(region != null)
			return region.getJson();
		else
			return "{}";
	}	

}
