package fleet.parcel.soapapi;

import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;

import fleet.parcel.bean.ParcelBeanI;
import fleet.parcel.model.Parcel;



public class ParcelWs {
	
	@EJB
	private ParcelBeanI parcelBean;
	
	@WebMethod
	public List<Parcel> list() {
		return parcelBean.list();
	}
	
	@WebMethod
	public Parcel load(){
		List<Parcel> parcel = parcelBean.list(); 
		if(parcel.isEmpty())
			return new Parcel();
		else
			return parcel.get(0);
	}

}
