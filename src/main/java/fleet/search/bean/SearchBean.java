package fleet.search.bean;

import fleet.car.model.Car;
import fleet.search.dao.SearchDaoI;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by sammy on 7/26/16.
 */
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class SearchBean implements SearchBeanI{
    @PersistenceContext
    private EntityManager em;

    @Inject
    private SearchDaoI searchDao;

    @PostConstruct
    public void init(){
        searchDao.setEm(em);
    }

    public int countCustomerSearch(String confirmationLink, String search) {
        return searchDao.countCustomerSearch(confirmationLink, search);
    }


    public String carsGivenInJson(String confirmationLink, String search) {
        Car filter = new Car();

        List<Car> cars = searchDao.carsGivenInJson(filter, confirmationLink, search);
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        int count = searchDao.countCustomerSearch(confirmationLink, search);
        for(Car car : cars){
            sb.append(car.getJson());

            count--;
            if(count>=1)
                sb.append(",");
        }
        sb.append("]");
        return sb.toString();
    }


}
