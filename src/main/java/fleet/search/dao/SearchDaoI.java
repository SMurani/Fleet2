package fleet.search.dao;

import fleet.car.model.Car;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by sammy on 7/26/16.
 */
public interface SearchDaoI {

    void setEm(EntityManager em);

    int countCustomerSearch(String confirmationLink, String search);

    List<Car> carsGivenInJson(Car cars, String confirmationLink, String search);


}
