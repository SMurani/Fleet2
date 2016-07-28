package fleet.vendor.bean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;



import fleet.vendor.dao.VendorDao;
import fleet.vendor.dao.VendorDaoI;
import fleet.vendor.model.Vendor;

/**
 * Created by sammy on 7/23/16.
 */

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class VendorBean implements VendorBeanI{

    @PersistenceContext
    private EntityManager em;


    @Inject
    private VendorDaoI vendorDao;

    @PostConstruct
    public void init(){
        vendorDao.setEm(em);
    }


    public void add(Vendor vendor){

        if(vendor == null)
            return;


        vendorDao.save(vendor);
    }

    public List<Vendor> list(){
        return vendorDao.list(new Vendor());
    }



    public boolean delete(Long id) {
        vendorDao.delete(id);
        return true;
    }


    public String listInJson() {
        Map<String, Object> filter = new HashMap<String, Object>();



        List<Vendor> vendors = vendorDao.active2();
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        int count = vendorDao.countAll();
        for(Vendor vendor : vendors){
            sb.append(vendor.getJson());

            count--;

            if(count >= 1)
                sb.append(",");
        }

        sb.append("]");

        return sb.toString();

    }


    public String load(Long id){

        Vendor vendor=vendorDao.findByIdNq(id);

        if(vendor != null)
            return vendor.getJson();
        else
            return "{}";
    }

}
