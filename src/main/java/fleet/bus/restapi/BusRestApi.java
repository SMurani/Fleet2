package fleet.bus.restapi;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


import fleet.bus.bean.BusBeanI;

@Path("/bus")
public class BusRestApi {

		
		@EJB	
		private BusBeanI busBean;
		
		@GET
		@Path("list")
		@Produces(MediaType.APPLICATION_JSON)
		public Response list(){
			
			return Response.ok().entity(busBean.list()).build();
			
		}

	


}
