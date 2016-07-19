package fleet.driver.dao;



import java.util.List;

import javax.persistence.EntityManager;

import fleet.driver.model.Driver;

public interface DriverDaoI {
	
	Driver add(Driver driver);
	
	Driver load(Driver driver);
	
	List<Driver> list(Driver filter);
	
	void delete(Long driverId);

	void setEm(EntityManager em);

}

