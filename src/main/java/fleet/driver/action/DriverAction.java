package fleet.driver.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

//import fleet.company.model.Company;
import fleet.driver.bean.DriverBeanI;
import fleet.driver.model.Driver;
import fleet.driver.model.Driver;
import fleet.common.model.Address;


@SuppressWarnings("Serial")
@WebServlet("/driver/action/*")
public class DriverAction extends HttpServlet{
	
	private Logger log  = Logger.getLogger(getClass());
	
	@EJB
	private DriverBeanI driverBean;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		
			String [] pathRmp = request.getRequestURI().split("/");
			String path = pathRmp[pathRmp.length-1];
		
			this.list(response);
		
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		
			Driver driver = new Driver();

			/*driver.setDriverName(request.getParameter("driverName"));
			driver.setDriverDescription(request.getParameter("driverDescription"));
			driver.setDriverManager(request.getParameter("driverManager"));
*/




		driver.setFname(request.getParameter("driverFname"));
		driver.setLname(request.getParameter("driverLname"));
		driver.setIdNo(request.getParameter("driverIdNo"));
		driver.setRegionOperation(request.getParameter("driverRegion"));
		driver.setVehicleAssigned(request.getParameter("driverVehicle"));

		driver.setAddress(new Address());
		driver.getAddress().setPhoneNo(request.getParameter("driverPhoneNo"));
		driver.getAddress().setEmail(request.getParameter("driverEmail"));
		driver.getAddress().setTown(request.getParameter("driverCity"));
		driver.getAddress().setCountry(request.getParameter("driverCountry"));
		driver.getAddress().setBox(request.getParameter("driverBox"));

			
			driverBean.add(driver);
			
			
	}


	private void list(HttpServletResponse response)
			throws ServletException, IOException{
			PrintWriter resp = response.getWriter();
			List<Driver> drivers = driverBean.list();
	    
	    resp.println("<div class=\"text-right\">");
        resp.println("<a class=\"btn btn-success\"  onclick=\"driver.add()\">Add</a>");
        resp.println("</div>");


		resp.println("<CENTER>");
		//resp.println("<table class=\"table table-condensed table-hover\">");
		resp.println("<div class=\"panel-body col-lg-12\">");
		resp.println("<div class=\"table-responsive\">");
		resp.println("<table class=\"table table-striped table-bordered table-hover\" id=\"dataTables-example\">");

		resp.println("<thead>");
		resp.println("<tr>");
		resp.println("<th>First Name</th>");
		resp.println("<th>Last Name</th>");
		resp.println("<th>ID No</th>");
		resp.println("<th>Region</th>");
		resp.println("<th>Vehicle</th>");
		resp.println("<th>Phone No</th>");
		resp.println("<th>Email</th>");
		resp.println("<th>Actions</th>");
		resp.println("</tr>");
		resp.println("</thead>");

		for(Driver driver : drivers) {

			resp.println("<tr>");
			resp.print("<td>" + (driver.getFname()) + "</td>");
			resp.print("<td>" + (driver.getLname()) + "</td>");
			resp.print("<td>" + (driver.getIdNo()) + "</td>");
			resp.print("<td>" + (driver.getRegionOperation()) + "</td>");
			resp.print("<td>" + (driver.getVehicleAssigned()) + "</td>");
			resp.print("<td>" + (driver.getAddress().getPhoneNo()) + "</td>");
			resp.print("<td>" + (driver.getAddress().getEmail()) + "</td>");
			resp.print("<td>" + ("<a class=\"btn btn-sm\"  onclick=\"driver.remove(" + driver.getId() + ")\"><i class=\"fa fa-trash-o fa-1x\" aria-hidden=\"true\"></i></a>")+ ("<a class=\"btn btn-sm\"  onclick=\"driver.remove(\" + driver.getId() + \")\"><i class=\"fa fa-pencil fa-1x\" aria-hidden=\"true\"></i></a>")+ "</td>");
			resp.println("</tr>");

		}


		resp.println("</table>");
		resp.println("</div>");
		resp.println("</div>");
		resp.println("</CENTER>");
		
	}
	public void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		Long driverId = Long.parseLong(request.getParameter("id"));

		driverBean.delete(driverId);

	}
	
	

}
