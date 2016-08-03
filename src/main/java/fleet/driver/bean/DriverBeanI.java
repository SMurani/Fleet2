package fleet.driver.bean;

import java.util.List;

import fleet.company.model.Company;
import fleet.driver.model.Driver;

public interface DriverBeanI {

	void add(Driver driver);

	String load(Long id);

	List<Driver> list();

	List<Driver>clientList(Long id);

	boolean delete(Long id);

	String listInJson();

}
