package fleet.vehicle.api;

import javax.ws.rs.Path;

import fleet.vehicle.bean.VehicleBeanI;
import fleet.vehicle.model.Vehicle;

@Path("/vehicle")
public class VehicleApi {
	private VehicleBeanI vehicleBean;

	@Path("/add")
	public String add(Vehicle vehicle) {

		vehicleBean.add(vehicle);

		return "{success: true}";
	}

}
