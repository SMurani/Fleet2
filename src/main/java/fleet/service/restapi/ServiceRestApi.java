package fleet.service.restapi;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


import fleet.service.bean.ServiceBeanI;

@Path("/service")
public class ServiceRestApi {

		
		@EJB	
		private ServiceBeanI serviceBean;
		
		@GET
		@Path("list")
		@Produces(MediaType.APPLICATION_JSON)
		public Response list(){
			
			return Response.ok().entity(serviceBean.list()).build();
			
		}

	


}
