package fleet.driver.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fleet.driver.dao.DriverDaoI;
import fleet.driver.model.Driver;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class DriverBean implements DriverBeanI{

	@PersistenceContext
	private EntityManager em;
	
	@Inject
	private DriverDaoI driverDao;
	
	@PostConstruct
	public void init(){
		driverDao.setEm(em);
	}

	public void add(Driver driver) {
		if(driver == null || driver.getFname() == null)
			return;
		driverDao.add(driver);
		
	}

	public List<Driver> list() {
		return driverDao.list(new Driver());
	}

	public boolean delete(Long id) {
		driverDao.delete(id);

		return true;
	}

}

