package fleet.car.restapi;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


import fleet.car.bean.CarBeanI;

@Path("/car")
public class CarRestApi {

		
		@EJB	
		private CarBeanI carBean;
		
		@GET
		@Path("list")
		@Produces(MediaType.APPLICATION_JSON)
		public Response list(){
			
			return Response.ok().entity(carBean.list()).build();
			
		}

	


}
