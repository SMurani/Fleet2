package fleet.client.bean;



import java.util.List;

import fleet.client.model.Client;;

public interface ClientBeanI {
	
	void add(Client client);
	
	List<Client> list();

	boolean delete(Long id);

}
