package fleet.region.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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

	public void add(Region region) {
		if(region == null || region.getRegionName() == null)
			return;
		regionDao.add(region);
		
	}

	public List<Region> list() {
		return regionDao.list(new Region());
	}

	public boolean delete(Long id) {
		regionDao.delete(id);

		return true;
	}

}

