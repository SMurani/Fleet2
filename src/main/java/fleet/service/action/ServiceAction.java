package fleet.service.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import org.apache.log4j.Logger;


import fleet.service.bean.ServiceBeanI;
import fleet.service.model.Service;

@SuppressWarnings("serial")
@WebServlet("/service/*")
public class ServiceAction extends HttpServlet {

	private Service service;

	@EJB
	private ServiceBeanI serviceBean;

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

		Service service = new Service();

		if(request.getParameter("id") != null
				&& !request.getParameter("id").equals("undefined"))
			service.setId(Long.parseLong(request.getParameter("id")));


		service.setVehicle(request.getParameter("vehicle"));
		service.setServiceDate(request.getParameter("serviceDate"));
		//System.out.println("vendorId");
		service.setVendorId(request.getParameter("vendorId"));

		service.setOdometer(request.getParameter("serviceOdometer"));
		service.setServiceCompleted(request.getParameter("serviceCompleted"));
		//service.setVendor1(request.getParameter("serviceVendor"));
		service.setReference(request.getParameter("serviceReference"));
		service.setDocument(request.getParameter("serviceDocument"));
		service.setComment(request.getParameter("serviceComments"));

		serviceBean.add(service);

	}

	public void doDelete(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Long ServiceId = Long.parseLong(request.getParameter("id"));
		serviceBean.delete(ServiceId);

	}

	private void list(HttpServletResponse response) throws ServletException,
			IOException {
		PrintWriter resp = response.getWriter();
		resp.println(serviceBean.listInJson());
	}

	private void load(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter resp = response.getWriter();
		resp.println(serviceBean.load(Long.parseLong(request.getParameter("id"))));
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

}

