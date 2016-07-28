package fleet.search.bean;

/**
 * Created by sammy on 7/26/16.
 */
public interface SearchBeanI {

    int countCustomerSearch(String confirmationLink, String search);
    String carsGivenInJson(String confirmationLink, String search);
}
