package fleet.car.dao;



import java.util.List;

import javax.persistence.EntityManager;

import fleet.car.model.Car;

public interface CarDaoI {
	
	Car add(Car car);
	
	Car load(Car car);
	
	List<Car> list(Car filter);
	
	void delete(Long carId);

	void setEm(EntityManager em);

}

