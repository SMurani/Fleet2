package fleet.car.bean;



import java.util.List;

import fleet.car.model.Car;;

public interface CarBeanI {
	
	void add(Car car);
	
	List<Car> list();

	boolean delete(Long id);

}
