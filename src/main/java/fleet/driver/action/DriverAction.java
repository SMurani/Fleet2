package fleet.driver.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import org.apache.log4j.Logger;


import fleet.driver.bean.DriverBeanI;
import fleet.driver.model.Driver;
import fleet.common.model.Address;

@SuppressWarnings("serial")
@WebServlet("/driver/*")
public class DriverAction extends HttpServlet {

	private Driver driver;

	@EJB
	private DriverBeanI driverBean;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String[] pathCmp = request.getRequestURI().split("/");
		String path = pathCmp[pathCmp.length - 1];

		if (path.equalsIgnoreCase("load"))
			this.load(request, response);
		else
			this.list(response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userId=  request.getSession().getAttribute("uid").toString ();


		Driver driver = new Driver();


		if (request.getParameter("id") != null
				&& !request.getParameter("id").equals("undefined"))
			driver.setId(Long.parseLong(request.getParameter("id")));

		/*if(request.getParameter("carId") != null
				&& !request.getParameter("carId").equals("undefined"))
			driver.setCarId(Long.parseLong(request.getParameter("carId")));*/
		driver.setUserId(Long.parseLong(userId));
		driver.setVehicle(request.getParameter("car"));
		driver.setRegionId(request.getParameter("regionId"));
		driver.setFname(request.getParameter("fname"));
		driver.setLname(request.getParameter("lname"));
		driver.setIdNumber(request.getParameter("idNumber"));

		driver.setAddress(new Address());

		driver.getAddress().setPhoneNo(request.getParameter("phoneNo"));
		driver.getAddress().setEmail(request.getParameter("email"));
		driver.getAddress().setTown(request.getParameter("town"));
		driver.getAddress().setCountry(request.getParameter("country"));
		driver.getAddress().setBox(request.getParameter("box"));


		driverBean.add(driver);

	}

	public void doDelete(HttpServletRequest request,
						 HttpServletResponse response) throws ServletException, IOException {
		Long DriverId = Long.parseLong(request.getParameter("id"));
		driverBean.delete(DriverId);

	}

	private void list(HttpServletResponse response) throws ServletException,
			IOException {
		PrintWriter resp = response.getWriter();
		resp.println(driverBean.listInJson());
	}

	private void load(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter resp = response.getWriter();
		resp.println(driverBean.load(Long.parseLong(request.getParameter("id"))));
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	private void list2(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter resp = response.getWriter();
		Long userId=  Long.parseLong(request.getSession().getAttribute("uid").toString ());


		resp.println(driverBean.clientList(userId));

	}


}
