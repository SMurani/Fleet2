package fleet.car.dao;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import fleet.car.model.Car;;

public class CarDao implements CarDaoI{
	
	private EntityManager em;
	
	public void setEm(EntityManager em) {
		this.em = em;
		
	}

	public Car add(Car car) {
		return em.merge(car);
	}

	public Car load(Car car) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Car> list(Car filter) {
		return em.createQuery("from Car c").getResultList();
	}


	public void delete(Long carId)
	{
		em.remove(em.find(Car.class, carId));
	}

	
}

