package fleet.parcel.api;
import javax.ws.rs.Path;

import fleet.parcel.bean.ParcelBeanI;
import fleet.parcel.model.Parcel;



@Path("/parcel")
public class ParcelApi {
	
	private ParcelBeanI parcelBean;
	
	@Path("/add")
	public String add(Parcel parcel){
		
		parcelBean.add(parcel);
		
		return "{success: true}";
	}

}
