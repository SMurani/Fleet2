package fleet.parcel.dao;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;


import fleet.generic.dao.GenericDao;
import fleet.parcel.model.Parcel;

public class ParcelDao extends GenericDao<Parcel, Long> implements ParcelDaoI{

	@SuppressWarnings("unchecked")
	public List<Parcel> active() {
		Session session = (Session) getEm().getDelegate();
		
		List<Parcel> parcels = session.createCriteria(Parcel.class)
				.add(Restrictions.isNotNull("parcel_to"))
				.list();
		
		return parcels;
	}

	@SuppressWarnings("unchecked")
	public List<Parcel> active2() {
		
		List<Parcel> parcels = getEm().createNamedQuery(Parcel.NQ_ALL)
				.getResultList();
		
		return parcels;
	}

	@SuppressWarnings("unchecked")
	public Parcel findByIdNq(Long id) {
		List<Parcel> parcels = getEm().createNamedQuery(Parcel.NQ_FINDBYID)
				.setParameter("id", id)
				.getResultList();
		
		if(parcels.isEmpty())
			return null;
		
		return parcels.get(0);
	}
	
	@SuppressWarnings("unchecked")
	public List<Parcel> sqlList() {
		Session session = (Session) getEm().getDelegate();
		
		List<Parcel> parcels = new ArrayList<Parcel>();
		
		List<Object []> results = session.createSQLQuery("select id, parcel_to, parcel_from,description,route, cost from parcel_parcels")
				.list();
		
		Parcel parcel;
		for(Object [] result : results){
			parcel = new Parcel();
			if(result[0] != null)parcel.setId( ((BigInteger) result[0]).longValue());
			if(result[1] != null)parcel.setParcelFrom ( (String) result[1]);
			if(result[2] != null)parcel.setParcelTo ( (String) result[2]);
			if(result[3] != null)parcel.setParcelDescription ( (String) result[3]);
			if(result[4] != null)parcel.setRoute ( (String) result[4]);
			if(result[5] != null)parcel.setParcelcost ( (Double) result[5]);
			parcels.add(parcel);
			
			
		}
		return parcels;
	}
	
	
}

	
	


