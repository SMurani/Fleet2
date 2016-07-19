package fleet.client.api;



import javax.ws.rs.Path;

import fleet.client.bean.ClientBeanI;
import fleet.client.model.Client;

@Path("/client")
public class ClientApi {
	
	private ClientBeanI clientBean;
	
	@Path("/add")
	public String add(Client client){
		clientBean.add(client);
		
		return "{success : true}";
	}
	

}

