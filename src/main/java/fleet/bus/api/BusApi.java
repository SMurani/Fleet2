package fleet.bus.api;
import javax.ws.rs.Path;

import fleet.bus.bean.BusBeanI;
import fleet.bus.model.Bus;



@Path("/bus")
public class BusApi {
	
	private BusBeanI busBean;
	
	@Path("/add")
	public String add(Bus bus){
		
		busBean.add(bus);
		
		return "{success: true}";
	}

}
