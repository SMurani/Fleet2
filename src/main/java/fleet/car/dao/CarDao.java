package fleet.car.dao;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import fleet.car.model.CarBooking;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import fleet.car.model.Car;
import fleet.generic.dao.GenericDao;

public class CarDao extends GenericDao<Car, Long> implements CarDaoI{
	
	private EntityManager em;
	
	public void setEm(EntityManager em) {
		this.em = em;
		
	}

	public Car add(Car car) {
		return em.merge(car);
	}

	public CarBooking book(CarBooking book) {
		return em.merge(book);
	}

	public List<CarBooking> listBook() {
		List<CarBooking> carBookings = getEm().createNamedQuery(CarBooking.NQ_ALL)
				.getResultList();

		return carBookings;

	}

	public Car load(Car car) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Car> list(Car filter) {
		return em.createQuery("from Car c").getResultList();
	}

	public List<Car> list2(Car filter) {
		return em.createQuery("from Car c where c.Status='Available' ").getResultList();
	}


	public void delete(Long carId)
	{
		em.remove(em.find(Car.class, carId));
	}
	@SuppressWarnings("unchecked")
	public List<Car>sqlList(){
		Session session = (Session) getEm().getDelegate();
		
		List<Car> cars = new ArrayList<Car>();
		
		List<Object []> results = session.createSQLQuery("select id, car_name, car_owner,car_comments,manufacturer_suggested_resale_price, vehicle_identification_no,color, vehicle_make, vehicle_model, photo, plateNo, vehicleType,  	year, registration_Town from car_cars")
				.list();
		
		Car car;
		for(Object [] result : results){
			car = new Car();
			
			 
			if(result[0] != null)car.setId( ((BigInteger) result[0]).longValue());
			if(result[1] != null)car.setCarName ( (String) result[1]);
			if(result[2] != null)car.setCarOwner ( (String) result[2]);
			if(result[3] != null)car.setCarDescription ( (String) result[3]);
			if(result[4] != null)car.setMSRP ( (String) result[4]);
			if(result[5] != null)car.setVIN ( (String) result[5]);
			if(result[6] != null)car.setColor ( (String) result[6]);
			if(result[7] != null)car.setMake ( (String) result[7]);
			if(result[8] != null)car.setModel ( (String) result[8]);
			if(result[9] != null)car.setPhoto ( (String) result[9]);
			if(result[10] != null)car.setPlateNo ( (String) result[10]);
			if(result[11] != null)car.setVehicleType ( (String) result[11]);
			if(result[12] != null)car.setYear ( (String) result[12]);
			if(result[13] != null)car.setRegTown ( (String) result[13]);
			
			cars.add(car);
			
			
		}
		return cars;
	
	}
	@SuppressWarnings("unchecked")
	public Car findByIdNq(Long id) {
		List<Car> cars = getEm().createNamedQuery(Car.NQ_FINDBYID)
				.setParameter("id", id)
				.getResultList();
		
		if(cars.isEmpty())
			return null;
		
		return cars.get(0);
	}

	@SuppressWarnings("unchecked")
	public List<Car> active() {
		Session session = (Session) getEm().getDelegate();
		
		List<Car> cars = session.createCriteria(Car.class)
				.add(Restrictions.isNotNull("car_name"))
				.list();
		
		return cars;
	}

	@SuppressWarnings("unchecked")
	public List<Car> active2() {
		
		List<Car> cars = getEm().createNamedQuery(Car.NQ_ALL)
				.getResultList();
		
		return cars;
	}

	
}

