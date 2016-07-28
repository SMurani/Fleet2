package fleet.bus.soapapi;

import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;

import fleet.bus.bean.BusBeanI;
import fleet.bus.model.Bus;



public class BusWs {
	
	@EJB
	private BusBeanI busBean;
	
	@WebMethod
	public List<Bus> list() {
		return busBean.list();
	}
	
	@WebMethod
	public Bus load(){
		List<Bus> bus = busBean.list();
		if(bus.isEmpty())
			return new Bus();
		else
			return bus.get(0);
	}

}
