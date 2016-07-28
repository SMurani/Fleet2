package fleet.vendor.restapi;

import fleet.vendor.bean.VendorBeanI;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by sammy on 7/24/16.
 */

@Path("/vendor")
public class VendorRestApi {

    @EJB
    private VendorBeanI vendorBean;

    @GET
    @Path("list")
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(){

        return Response.ok().entity(vendorBean.list()).build();

    }
}
