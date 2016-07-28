package fleet.client.soapapi;

import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;

import fleet.client.bean.ClientBeanI;
import fleet.client.model.Client;



public class ClientWs {
	
	@EJB
	private ClientBeanI clientBean;
	
	@WebMethod
	public List<Client> list() {
		return clientBean.list();
	}
	
	@WebMethod
	public Client load(){
		List<Client> client = clientBean.list();
		if(client.isEmpty())
			return new Client();
		else
			return client.get(0);
	}

}
