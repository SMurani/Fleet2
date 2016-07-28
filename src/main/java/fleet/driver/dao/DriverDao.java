package fleet.driver.dao;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;


import fleet.generic.dao.GenericDao;
import fleet.driver.model.Driver;

public class DriverDao extends GenericDao<Driver, Long> implements DriverDaoI{

	@SuppressWarnings("unchecked")
	public List<Driver> active() {
		Session session = (Session) getEm().getDelegate();

		List<Driver> drivers = session.createCriteria(Driver.class)
				.add(Restrictions.isNotNull("fname"))
				.list();

		return drivers;
	}

	@SuppressWarnings("unchecked")
	public List<Driver> active2() {

		List<Driver> drivers = getEm().createNamedQuery(Driver.NQ_ALL)
				.getResultList();

		return drivers;
	}

	@SuppressWarnings("unchecked")
	public Driver findByIdNq(Long id) {
		List<Driver> drivers = getEm().createNamedQuery(Driver.NQ_FINDBYID)
				.setParameter("id", id)
				.getResultList();

		if(drivers.isEmpty())
			return null;

		return drivers.get(0);
	}

	@SuppressWarnings("unchecked")
	public List<Driver> sqlList() {
		/*Session session = (Session) getEm().getDelegate();

		List<Driver> drivers = new ArrayList<Driver>();

		List<Object []> results = session.createSQLQuery("select id, name, id_number,description from driver_drivers")
				.list();

		Driver driver;
		for(Object [] result : results){
			driver = new Driver();
			if(result[0] != null)driver.setId( ((BigInteger) result[0]).longValue());
			if(result[1] != null)driver.setName ( (String) result[1]);
			if(result[2] != null)driver.setIdNumber ( (String) result[2]);
			if(result[3] != null)driver.setDriverDescription ( (String) result[3]);
			drivers.add(driver);


		}*/
		return null;
	}

}





