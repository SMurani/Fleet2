package fleet.car.bean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fleet.car.dao.CarDaoI;
import fleet.car.dao.CarDao;
import fleet.car.model.Car;
import fleet.car.model.CarBooking;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class CarBean implements CarBeanI{

	@PersistenceContext
	private EntityManager em;
	
	@Inject
	private CarDaoI carDao;
	
	@PostConstruct
	public void init(){
		carDao.setEm(em);
	}

	public void add(Car car) {
		if(car == null || car.getCarName() == null)
			return;
		carDao.add(car);
		
	}

	public List<Car> list() {
		return carDao.list(new Car());
	}

	public List<Car> list2() {
		return carDao.list2(new Car());
	}

	public boolean delete(Long id) {
		carDao.delete(id);

		return true;
	}
	
	public String listInJson() {
		Map<String, Object> filter = new HashMap<String, Object>();
		
		
		
		List<Car> cars = carDao.active2();
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		
		int count = carDao.countAll();
		for(Car car : cars){
			sb.append(car.getJson());
			
			count--;
			
			if(count >= 1)
				sb.append(",");
		}
		
		sb.append("]");
		
		return sb.toString();
		
	}

	public void book(CarBooking book) {
		if(book == null || book.getUsername() == null)
			return;
		carDao.book(book);

	}

	public List<CarBooking> carBookingList() {
		return carDao.listBook();
	}

	public int countCars() {
		System.out.println(carDao.countAll());
		return carDao.countAll();


	}

	public String load(Long id){
		
		Car car=carDao.findByIdNq(id);
		
		if(car != null)
			return car.getJson();
		else
			return "{}";
	}

}

