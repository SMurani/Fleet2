package fleet.car.bean;



import java.util.List;

import fleet.car.model.Car;;

public interface CarBeanI {
	
	void add(Car car);
	
	String load(Long id);
	
	List<Car> list();
	List<Car> list2();

	boolean delete(Long id);
	
	String listInJson();

}
