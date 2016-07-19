package fleet.car.api;



import javax.ws.rs.Path;

import fleet.car.bean.CarBeanI;
import fleet.car.model.Car;

@Path("/car")
public class CarApi {
	
	private CarBeanI carBean;
	
	@Path("/add")
	public String add(Car car){
		carBean.add(car);
		
		return "{success : true}";
	}
	

}

