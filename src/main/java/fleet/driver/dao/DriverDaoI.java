package fleet.driver.dao;



import java.util.List;

import fleet.company.model.Company;
import fleet.generic.dao.GenericDaoI;
import fleet.driver.model.Driver;

public interface DriverDaoI extends GenericDaoI<Driver, Long>{


	List<Driver> active();

	List<Driver> active2();

	Driver findByIdNq(Long id);

	List<Driver> sqlList();
	List<Driver>clientList(Long id);


}
