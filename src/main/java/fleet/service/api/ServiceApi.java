
package fleet.service.api;
import javax.ws.rs.Path;

import fleet.service.bean.ServiceBeanI;
import fleet.service.model.Service;



@Path("/service")
public class ServiceApi {
	
	private ServiceBeanI serviceBean;
	
	@Path("/add")
	public String add(Service service){

		serviceBean.add(service);
		
		return "{success: true}";
	}

}

