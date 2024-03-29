package fleet.search.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import fleet.driver.model.Driver;


public class SearchDao implements SearchDaoI {

    private EntityManager em;

    public void setEm(EntityManager em) {
        this.em = em;
    }

    @SuppressWarnings("rawtypes")
    public int countCustomerSearch( String search) {

        String id=search;



        Query query = em.createQuery("select count(id) from Driver where id=:id");
        query.setParameter("id", id);

        List result = query.getResultList();



        return ((Long) result.get(0)).intValue();
    }

    @SuppressWarnings("unchecked")
    public List<Driver> driverInJson(Driver services, String search) {

        String id = search;


        Query query = em.createQuery("from Driver where id=:id");
        query.setParameter("id", id);


        return query.getResultList();
    }
   /* public Long searchDriver(Long driverId){

    }*/




    public List<Driver> searchByName(String searchParameter) {
        List <Driver>result = em.createQuery("from Driver d where d.fname like :search")
                .setParameter("search", "%" + searchParameter + "%")
                .getResultList();
        System.out.println("This is the result "+result);
        return result;

    }


    public int countofSearchByName(String searchParameter){
        List result =  em.createQuery("select count (*) from Driver d where d.fname like :search")
                .setParameter("search", "%" + searchParameter + "%").getResultList();
        System.out.println(((Long) result.get(0)).intValue());
        return ((Long) result.get(0)).intValue();
    }

}