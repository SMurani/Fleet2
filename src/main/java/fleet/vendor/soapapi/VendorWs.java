package fleet.vendor.soapapi;

import fleet.vendor.bean.VendorBeanI;
import fleet.vendor.model.Vendor;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import java.util.List;

/**
 * Created by sammy on 7/24/16.
 */
public class VendorWs {
    @EJB
    private VendorBeanI vendorBean;

    @WebMethod
    public List<Vendor> list() {
        return vendorBean.list();
    }

    @WebMethod
    public Vendor load(){
        List<Vendor> vendor = vendorBean.list();
        if(vendor.isEmpty())
            return new Vendor();
        else
            return vendor.get(0);
    }
}
