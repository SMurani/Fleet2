package fleet.driver.bean;

import java.util.List;

import fleet.company.model.Company;
import fleet.driver.model.Driver;

public interface DriverBeanI {

	void add(Driver driver);

	String load(Long id);

	List<Driver> list();

	boolean delete(Long id);

	String listInJson();

}
