package fleet.car.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fleet.car.dao.CarDaoI;
import fleet.car.model.Car;

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

	public boolean delete(Long id) {
		carDao.delete(id);

		return true;
	}

}

