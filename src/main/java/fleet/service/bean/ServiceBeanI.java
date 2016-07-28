package fleet.service.bean;

import java.util.List;

import fleet.company.model.Company;
import fleet.service.model.Service;

public interface ServiceBeanI {

	void add(Service service);
	
	String load(Long id);

	List<Service> list();
	
	boolean delete(Long id);

	String listInJson();

}
