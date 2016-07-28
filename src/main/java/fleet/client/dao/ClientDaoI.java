package fleet.client.dao;



import java.util.List;

import fleet.company.model.Company;
import fleet.generic.dao.GenericDaoI;
import fleet.client.model.Client;

public interface ClientDaoI extends GenericDaoI<Client, Long>{

				
	List<Client> active();
	
	List<Client> active2();
	
	Client findByIdNq(Long id);
	
	List<Client> sqlList();
	

}
