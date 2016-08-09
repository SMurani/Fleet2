package fleet.search.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fleet.driver.model.Driver;
import fleet.search.bean.SearchBeanI;
import fleet.search.dao.SearchDaoI;


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

    public int countCustomerSearch( String search) {
        return searchDao.countCustomerSearch(search);
    }

    public String driverInJson( String search) {
        Driver filter = new Driver();

        List<Driver> services = searchDao.driverInJson(filter, search);
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        int count = searchDao.countCustomerSearch( search);
        for(Driver servicesGiven : services){
            sb.append(servicesGiven.getJson());

            count--;
            if(count >= 1)
                sb.append(",");
        }
        sb.append("]");
        return sb.toString();
    }

    public String searchByName(String searchParameter) {

        List<Driver> drivers = searchDao.searchByName(searchParameter);


        StringBuilder sb = new StringBuilder();
        sb.append("[");

        int count = searchDao.countofSearchByName(searchParameter);

        for(Driver driver : drivers){
            sb.append(driver.getJson());

            count--;

            if(count >= 1)
                sb.append(",");
        }

        sb.append("]");
        System.out.println(sb);
        return sb.toString();


    }



}