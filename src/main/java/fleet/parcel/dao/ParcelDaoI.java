package fleet.parcel.dao;



import java.util.List;

import fleet.company.model.Company;
import fleet.generic.dao.GenericDaoI;
import fleet.parcel.model.Parcel;

public interface ParcelDaoI extends GenericDaoI<Parcel, Long>{

				
	List<Parcel> active();
	
	List<Parcel> active2();
	
	Parcel findByIdNq(Long id);
	
	List<Parcel> sqlList();
	

}
