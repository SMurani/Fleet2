package fleet.dispatch.api;



import javax.ws.rs.Path;

import fleet.dispatch.bean.DispatchBeanI;
import fleet.dispatch.model.Dispatch;

@Path("/dispatch")
public class DispatchApi {
	
	private DispatchBeanI dispatchBean;
	
	@Path("/add")
	public String add(Dispatch dispatch){
		dispatchBean.add(dispatch);
		
		return "{success : true}";
	}
	

}

