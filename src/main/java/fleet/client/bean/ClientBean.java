package fleet.client.bean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import fleet.company.dao.CompanyDao;
import fleet.company.model.Company;
import fleet.client.dao.ClientDao;
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

	
	public void add(Client client){


		if(client == null)
			return;

		
		clientDao.save(client);
	}
	
	public List<Client> list(){
		return clientDao.list(new Client());
	}
	


	public boolean delete(Long id) {
		clientDao.delete(id);
		return true;
	}


	public String listInJson() {
		Map<String, Object> filter = new HashMap<String, Object>();
		
		

		List<Client> clients = clientDao.active2();
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		
		int count = clientDao.countAll();
		for(Client client : clients){
			sb.append(client.getJson());
			
			count--;
			
			if(count >= 1)
				sb.append(",");
		}
		
		sb.append("]");
		
		return sb.toString();
		
	}


	public String load(Long id){

		Client client=clientDao.findByIdNq(id);
		
		if(client != null)
			return client.getJson();
		else
			return "{}";
	}	

}
