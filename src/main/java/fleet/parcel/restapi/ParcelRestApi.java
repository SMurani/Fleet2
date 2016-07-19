package fleet.parcel.restapi;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


import fleet.parcel.bean.ParcelBeanI;

@Path("/parcel")
public class ParcelRestApi {

		
		@EJB	
		private ParcelBeanI parcelBean;
		
		@GET
		@Path("list")
		@Produces(MediaType.APPLICATION_JSON)
		public Response list(){
			
			return Response.ok().entity(parcelBean.list()).build();
			
		}

	


}
