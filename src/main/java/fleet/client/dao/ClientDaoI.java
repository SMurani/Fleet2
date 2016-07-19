package fleet.client.dao;



import java.util.List;

import javax.persistence.EntityManager;

import fleet.client.model.Client;

public interface ClientDaoI {
	
	Client add(Client client);
	
	Client load(Client client);
	
	List<Client> list(Client filter);
	
	void delete(Long clientId);

	void setEm(EntityManager em);

}

