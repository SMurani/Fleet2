package fleet.driver.bean;

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
import fleet.driver.dao.DriverDao;
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


	public void add(Driver driver){


		if(driver == null)
			return;


		driverDao.save(driver);
	}

	public List<Driver> list(){
		return driverDao.list(new Driver());
	}

	public List<Driver> clientList(Long id) {

		return driverDao.clientList(id);
	}


	public boolean delete(Long id) {
		driverDao.delete(id);
		return true;
	}


	public String listInJson() {
		Map<String, Object> filter = new HashMap<String, Object>();



		List<Driver> drivers = driverDao.active2();
		StringBuilder sb = new StringBuilder();
		sb.append("[");

		int count = driverDao.countAll();
		for(Driver driver : drivers){
			sb.append(driver.getJson());

			count--;

			if(count >= 1)
				sb.append(",");
		}

		sb.append("]");

		return sb.toString();

	}


	public String load(Long id){

		Driver driver=driverDao.findByIdNq(id);

		if(driver != null)
			return driver.getJson();
		else
			return "{}";
	}

}
