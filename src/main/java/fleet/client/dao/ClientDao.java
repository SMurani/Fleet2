package fleet.client.dao;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import fleet.client.model.Client;;

public class ClientDao implements ClientDaoI{
	
	private EntityManager em;
	
	public void setEm(EntityManager em) {
		this.em = em;
		
	}

	public Client add(Client client) {
		return em.merge(client);
	}

	public Client load(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Client> list(Client filter) {
		return em.createQuery("from Client r").getResultList();
	}


	public void delete(Long clientId)
	{
		em.remove(em.find(Client.class, clientId));
	}

	
}

