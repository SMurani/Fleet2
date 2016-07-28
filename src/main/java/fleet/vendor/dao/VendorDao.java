package fleet.vendor.dao;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import fleet.generic.dao.GenericDao;
import fleet.vendor.model.Vendor;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;




public class VendorDao extends GenericDao<Vendor, Long> implements VendorDaoI{

    @SuppressWarnings("unchecked")
    public List<Vendor> active() {
        Session session = (Session) getEm().getDelegate();

        List<Vendor> vendors = session.createCriteria(Vendor.class)
                .add(Restrictions.isNotNull("name"))
                .list();

        return vendors;
    }

    @SuppressWarnings("unchecked")
    public List<Vendor> active2() {

        List<Vendor> vendors = getEm().createNamedQuery(Vendor.NQ_ALL)
                .getResultList();

        return vendors;
    }

    @SuppressWarnings("unchecked")
    public Vendor findByIdNq(Long id) {
        List<Vendor> vendors = getEm().createNamedQuery(Vendor.NQ_FINDBYID)
                .setParameter("id", id)
                .getResultList();

        if(vendors.isEmpty())
            return null;

        return vendors.get(0);
    }

    @SuppressWarnings("unchecked")
    public List<Vendor> sqlList() {
        Session session = (Session) getEm().getDelegate();

        List<Vendor> vendors = new ArrayList<Vendor>();

        List<Object []> results = session.createSQLQuery("select id, name, speciality from vendor_vendors")
                .list();

        Vendor vendor;
        for(Object [] result : results){
            vendor = new Vendor();
            if(result[0] != null)vendor.setId( ((BigInteger) result[0]).longValue());
            if(result[1] != null)vendor.setName ( (String) result[1]);
            if(result[2] != null)vendor.setSpeciality ( (String) result[2]);
            vendors.add(vendor);


        }
        return vendors;
    }


}





