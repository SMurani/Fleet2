package fleet.parcel.bean;

import java.util.List;

import fleet.company.model.Company;
import fleet.parcel.model.Parcel;

public interface ParcelBeanI {

	void add(Parcel parcel);
	
	String load(Long id);

	List<Parcel> list();
	
	boolean delete(Long id);

	String listInJson();

}
