package fleet.bus.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import org.apache.log4j.Logger;


import fleet.bus.bean.BusBeanI;
import fleet.bus.model.Bus;

@SuppressWarnings("serial")
@WebServlet("/bus/*")
public class BusAction extends HttpServlet {

	private Bus bus;

	@EJB
	private BusBeanI busBean;

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

		Bus bus = new Bus();

		if (request.getParameter("id") != null
				&& !request.getParameter("id").equals("undefined"))
			bus.setId(Long.parseLong(request.getParameter("id")));



		bus.setName(request.getParameter("busName"));
		bus.setManager(request.getParameter("busManager"));
		bus.setBusDescription(request.getParameter("busDescription"));
		bus.setTown(request.getParameter("busTown"));

		busBean.add(bus);

	}

	public void doDelete(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Long BusId = Long.parseLong(request.getParameter("id"));
		busBean.delete(BusId);

	}

	private void list(HttpServletResponse response) throws ServletException,
			IOException {
		PrintWriter resp = response.getWriter();
		resp.println(busBean.listInJson());
	}

	private void load(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter resp = response.getWriter();
		resp.println(busBean.load(Long.parseLong(request.getParameter("id"))));
	}

	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

}
