package fleet.bus.bean;

import java.util.List;

import fleet.company.model.Company;
import fleet.bus.model.Bus;

public interface BusBeanI {

	void add(Bus bus);
	
	String load(Long id);

	List<Bus> list();
	
	boolean delete(Long id);

	String listInJson();

}
