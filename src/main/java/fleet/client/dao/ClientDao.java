package fleet.client.dao;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;


import fleet.generic.dao.GenericDao;
import fleet.client.model.Client;

public class ClientDao extends GenericDao<Client, Long> implements ClientDaoI{

	@SuppressWarnings("unchecked")
	public List<Client> active() {
		Session session = (Session) getEm().getDelegate();
		
		List<Client> clients = session.createCriteria(Client.class)
				.add(Restrictions.isNotNull("name"))
				.list();
		
		return clients;
	}

	@SuppressWarnings("unchecked")
	public List<Client> active2() {
		
		List<Client> clients = getEm().createNamedQuery(Client.NQ_ALL)
				.getResultList();
		
		return clients;
	}

	@SuppressWarnings("unchecked")
	public Client findByIdNq(Long id) {
		List<Client> clients = getEm().createNamedQuery(Client.NQ_FINDBYID)
				.setParameter("id", id)
				.getResultList();
		
		if(clients.isEmpty())
			return null;
		
		return clients.get(0);
	}
	
	@SuppressWarnings("unchecked")
	public List<Client> sqlList() {
		/*Session session = (Session) getEm().getDelegate();
		
		List<Client> clients = new ArrayList<Client>();
		
		List<Object []> results = session.createSQLQuery("select id, name, id_number,description from client_clients")
				.list();
		
		Client client;
		for(Object [] result : results){
			client = new Client();
			if(result[0] != null)client.setId( ((BigInteger) result[0]).longValue());
			if(result[1] != null)client.setName ( (String) result[1]);
			if(result[2] != null)client.setIdNumber ( (String) result[2]);
			if(result[3] != null)client.setClientDescription ( (String) result[3]);
			clients.add(client);
			
			
		}*/
		return null;
	}

}

	
	


