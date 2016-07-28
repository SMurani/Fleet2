package fleet.search.dao;

import fleet.car.model.Car;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by sammy on 7/26/16.
 */
public class SearchDao implements SearchDaoI{
    private EntityManager em;

    public void setEm(EntityManager em) {
        this.em = em;
    }

    @SuppressWarnings("rawtypes")
    public int countCustomerSearch(String confirmationLink, String search) {
        //String code = "TCN";
        String carName = search;
       // String status = "OPEN";

        Query query = em.createQuery("select count(id) from car_cars where car_name=:carName");
        query.setParameter("car_name", carName);
        //query.setParameter("status",status);
        List result = query.getResultList();

        return ((Long) result.get(0)).intValue();
    }

    @SuppressWarnings("unchecked")
    public List<Car> carsGivenInJson(Car cars, String confirmationLink, String search) {
        //String code = "TCN";
        String carName = search;
        String status = "OPEN";

        Query query = em.createQuery("from Car where car_name=:carName");
        //query.setParameter("assign", assign);
        //query.setParameter("status",status);

        return query.getResultList();
    }

}
