package fleet.vendor.bean;

import fleet.vendor.model.Vendor;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by sammy on 7/23/16.
 */
public interface VendorBeanI {
    void add(Vendor vendor);

    String load(Long id);

    List<Vendor> list();

    boolean delete(Long id);

    String listInJson();
}
