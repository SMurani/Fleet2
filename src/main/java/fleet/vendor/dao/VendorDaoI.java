package fleet.vendor.dao;

import java.util.List;


import fleet.generic.dao.GenericDaoI;
import fleet.vendor.model.Vendor;

public interface VendorDaoI extends GenericDaoI<Vendor, Long>{

    List<Vendor> active();

    List<Vendor> active2();

    Vendor findByIdNq(Long id);

    List<Vendor> sqlList();
}