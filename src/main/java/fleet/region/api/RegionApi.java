package fleet.region.api;
import javax.ws.rs.Path;

import fleet.region.bean.RegionBeanI;
import fleet.region.model.Region;



@Path("/region")
public class RegionApi {
	
	private RegionBeanI regionBean;
	
	@Path("/add")
	public String add(Region region){
		
		regionBean.add(region);
		
		return "{success: true}";
	}

}
