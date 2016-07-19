package fleet.vehicle.dao;

import java.util.ArrayList;
import java.util.List;


import fleet.vehicle.model.Capacity;
import fleet.vehicle.model.Vehicle;

public class VehicleDao implements VehicleDaoI{


	

	Capacity s = Capacity.SixtyFourSeater;
	Capacity t = Capacity.ThirtyTwoSeater;


	public void delete(Long companyId) {
		// TODO Auto-generated method stub
		
	}

	public Vehicle add(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return null;
	}

	public Vehicle load(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Vehicle> list(Vehicle filter) {
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		Vehicle vehicle = new Vehicle();
		
		vehicle.setReg_no("KCA 775J");
		vehicle.setCapacity(s);
		vehicles.add(vehicle);
		
 vehicle = new Vehicle();
		
		vehicle.setReg_no("KCR 656Y");
		vehicle.setCapacity(t);
		vehicles.add(vehicle);
		
vehicle = new Vehicle();
		
		vehicle.setReg_no("KCS 566K");
		vehicle.setCapacity(s);
		vehicles.add(vehicle);
		
 vehicle = new Vehicle();
		
		vehicle.setReg_no("KCW 654R");
		vehicle.setCapacity(t);
		vehicles.add(vehicle);
		
 vehicle = new Vehicle();
		
		vehicle.setReg_no("KCW 758P");
		vehicle.setCapacity(s);
		vehicles.add(vehicle);
		
		
		return vehicles;
		
	}
	
	

}
