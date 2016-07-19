package fleet.vehicle.dao;

import java.util.List;


import fleet.vehicle.model.Vehicle;

public interface VehicleDaoI {
	

	Vehicle add(Vehicle vehicle);
	
	Vehicle load(Vehicle vehicle);
	
	List<Vehicle> list(Vehicle filter);
	
	void delete(Long VehicleId);

}
