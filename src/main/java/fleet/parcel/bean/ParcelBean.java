package fleet.parcel.bean;

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


import fleet.company.dao.CompanyDao;
import fleet.company.model.Company;
import fleet.parcel.dao.ParcelDao;
import fleet.parcel.dao.ParcelDaoI;
import fleet.parcel.model.Parcel;


@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class ParcelBean implements ParcelBeanI{
	
	@PersistenceContext
	private EntityManager em;
	
	
	@Inject
	private ParcelDaoI parcelDao;
	
	@PostConstruct
	public void init(){
		parcelDao.setEm(em);
	}

	
	public void add(Parcel parcel){
		/*if(parcel == null || parcel.getParcelTo() == null ||parcel.getParcelFrom() == null)
			return;
		
		//parcelDao.add(parcel);
*/		
		if(parcel == null)
			return;

		
		parcelDao.save(parcel);
	}
	
	public List<Parcel> list(){
		return parcelDao.list(new Parcel());
	}
	


	public boolean delete(Long id) {
		parcelDao.delete(id);
		return true;
	}


	public String listInJson() {
		Map<String, Object> filter = new HashMap<String, Object>();
		
		
		//List<Parcel> parcels = parcelDao.list(filter);
		List<Parcel> parcels = parcelDao.sqlList();
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		
		int count = parcelDao.countAll();
		for(Parcel parcel : parcels){
			sb.append(parcel.getJson());
			
			count--;
			
			if(count >= 1)
				sb.append(",");
		}
		
		sb.append("]");
		
		return sb.toString();
		
	}


	public String load(Long id){
		//Parcel parcel = parcelDao.findById(id);
		Parcel parcel=parcelDao.findByIdNq(id);
		
		if(parcel != null)
			return parcel.getJson();
		else
			return "{}";
	}	

}
