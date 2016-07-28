package fleet.region.soapapi;

import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;

import fleet.region.bean.RegionBeanI;
import fleet.region.model.Region;



public class RegionWs {
	
	@EJB
	private RegionBeanI regionBean;
	
	@WebMethod
	public List<Region> list() {
		return regionBean.list();
	}
	
	@WebMethod
	public Region load(){
		List<Region> region = regionBean.list();
		if(region.isEmpty())
			return new Region();
		else
			return region.get(0);
	}

}
