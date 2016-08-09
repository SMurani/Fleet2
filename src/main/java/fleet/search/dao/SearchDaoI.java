package fleet.search.dao;

import java.util.List;

import javax.persistence.EntityManager;

import fleet.driver.model.Driver;


public interface SearchDaoI {

    void setEm(EntityManager em);

    int countCustomerSearch( String search);
    List<Driver> driverInJson(Driver services, String search);


    List<Driver> searchByName(String searchParameter);

   // List<Driver> searchByVehicle(String searchParameter);

    int countofSearchByName(String searchParamter);

    //int countofSearchByVehicle(String searchParameter);




}