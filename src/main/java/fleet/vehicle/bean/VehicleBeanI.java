package fleet.vehicle.bean;

import java.util.List;


import fleet.vehicle.model.Vehicle;

public interface VehicleBeanI {
	void add(Vehicle vehicle);

	List<Vehicle> list();

}
