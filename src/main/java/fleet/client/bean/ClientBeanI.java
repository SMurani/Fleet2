package fleet.client.bean;

import java.util.List;

import fleet.company.model.Company;
import fleet.client.model.Client;

public interface ClientBeanI {

	void add(Client client);
	
	String load(Long id);

	List<Client> list();
	
	boolean delete(Long id);

	String listInJson();

}
