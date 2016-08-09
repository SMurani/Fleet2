package fleet.search.bean;

import fleet.driver.model.Driver;

import java.util.List;

public interface SearchBeanI {

    int countCustomerSearch( String search);
    String driverInJson( String search);

    String searchByName(String searchParameter);



}