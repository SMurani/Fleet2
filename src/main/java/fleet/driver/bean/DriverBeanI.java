package fleet.driver.bean;



import java.util.List;

import fleet.driver.model.Driver;;

public interface DriverBeanI {
	
	void add(Driver driver);
	
	List<Driver> list();

	boolean delete(Long id);

}
