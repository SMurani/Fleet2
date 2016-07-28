package fleet.region.restapi;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


import fleet.region.bean.RegionBeanI;

@Path("/region")
public class RegionRestApi {

		
		@EJB	
		private RegionBeanI regionBean;
		
		@GET
		@Path("list")
		@Produces(MediaType.APPLICATION_JSON)
		public Response list(){
			
			return Response.ok().entity(regionBean.list()).build();
			
		}

	


}
