package fleet.parcel.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import org.apache.log4j.Logger;


import fleet.parcel.bean.ParcelBeanI;
import fleet.parcel.model.Parcel;

@SuppressWarnings("serial")
@WebServlet("/parcel/*")
public class ParcelAction extends HttpServlet {

	private Parcel parcel;

	@EJB
	private ParcelBeanI parcelBean;

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

		Parcel parcel = new Parcel();

		if (request.getParameter("id") != null
				&& !request.getParameter("id").equals("undefined"))
			parcel.setId(Long.parseLong(request.getParameter("id")));



		parcel.setParcelTo(request.getParameter("parcelTo"));
		parcel.setParcelFrom(request.getParameter("parcelFrom"));
		parcel.setParcelDescription(request.getParameter("parcelDescription"));
		parcel.setRoute(request.getParameter("route"));
		parcel.setParcelcost(Double.parseDouble(request
				.getParameter("parcelCost")));

		parcelBean.add(parcel);

	}

	public void doDelete(HttpServletRequest request,
						 HttpServletResponse response) throws ServletException, IOException {
		Long ParcelId = Long.parseLong(request.getParameter("id"));
		parcelBean.delete(ParcelId);

	}

	private void list(HttpServletResponse response) throws ServletException,
			IOException {
		PrintWriter resp = response.getWriter();
		resp.println(parcelBean.listInJson());
	}

	private void load(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter resp = response.getWriter();
		resp.println(parcelBean.load(Long.parseLong(request.getParameter("id"))));
	}

	public Parcel getParcel() {
		return parcel;
	}

	public void setParcel(Parcel parcel) {
		this.parcel = parcel;
	}

}

