package fleet.service.soapapi;

import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;

import fleet.service.bean.ServiceBeanI;
import fleet.service.model.Service;



public class ServiceWs {
	
	@EJB
	private ServiceBeanI serviceBean;
	
	@WebMethod
	public List<Service> list() {
		return serviceBean.list();
	}
	
	@WebMethod
	public Service load(){
		List<Service> service = serviceBean.list();
		if(service.isEmpty())
			return new Service();
		else
			return service.get(0);
	}

}
