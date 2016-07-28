package fleet.driver.api;
import javax.ws.rs.Path;

import fleet.driver.bean.DriverBeanI;
import fleet.driver.model.Driver;



@Path("/driver")
public class DriverApi {

	private DriverBeanI driverBean;

	@Path("/add")
	public String add(Driver driver){

		driverBean.add(driver);

		return "{success: true}";
	}

}
