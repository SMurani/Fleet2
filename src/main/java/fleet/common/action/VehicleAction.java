package fleet.common.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import fleet.vehicle.bean.VehicleBeanI;
import fleet.vehicle.model.Vehicle;

@SuppressWarnings("serial")
@WebServlet("/vehicle")
public class VehicleAction extends HttpServlet{
	
	@EJB	
	private VehicleBeanI vehicleBean;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	 throws ServletException, IOException{
		
		PrintWriter resp = response.getWriter();
	    List<Vehicle> vehicles = vehicleBean.list();
	    
        resp.println("<div class=\"text-right\">");
        resp.println("<a class=\"btn btn-success\"  onclick=\"vehicle.add()\">Edit</a>");
		resp.println("<a class=\"btn btn-danger\"  onclick=\"vehicle.add()\">Delete</a>");
        resp.println("</div>");
        
	    for(Vehicle vehicle : vehicles){
	    	resp.println("<hr>");
	    	resp.println("<div class=\"row\">");
	    	resp.println("<div class=\"col-md-12\">");

	    	resp.println(vehicle.getReg_no() + " :==> " + vehicle.getCapacity());

	    	resp.println("<p>We have vehicles that achieves customer satisfaction.</p>");
	    	resp.println("</div>");
	    	resp.println("</div>");
	    }
	}
	
}
