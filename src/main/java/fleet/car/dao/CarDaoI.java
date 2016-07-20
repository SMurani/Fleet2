package fleet.car.dao;



import java.util.List;

import javax.persistence.EntityManager;

import fleet.car.model.Car;
import fleet.generic.dao.GenericDaoI;

public interface CarDaoI  extends GenericDaoI<Car, Long>{
	
	Car add(Car car);
	
	Car load(Car car);
	
	List<Car> list(Car filter);
	
	void delete(Long carId);

	void setEm(EntityManager em);
	List<Car> sqlList();
	
	List<Car> active();
	
	List<Car> active2();
	
	Car findByIdNq(Long id);
	
	

}

