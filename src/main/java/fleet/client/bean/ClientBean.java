package fleet.client.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fleet.client.dao.ClientDaoI;
import fleet.client.model.Client;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class ClientBean implements ClientBeanI{

	@PersistenceContext
	private EntityManager em;
	
	@Inject
	private ClientDaoI clientDao;
	
	@PostConstruct
	public void init(){
		clientDao.setEm(em);
	}

	public void add(Client client) {
		if(client == null || client.getClientName() == null)
			return;
		clientDao.add(client);
		
	}

	public List<Client> list() {
		return clientDao.list(new Client());
	}

	public boolean delete(Long id) {
		clientDao.delete(id);

		return true;
	}

}

