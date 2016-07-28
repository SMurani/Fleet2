package fleet.region.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import org.apache.log4j.Logger;


import fleet.region.bean.RegionBeanI;
import fleet.region.model.Region;

@SuppressWarnings("serial")
@WebServlet("/region/*")
public class RegionAction extends HttpServlet {

	private Region region;

	@EJB
	private RegionBeanI regionBean;

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

		Region region = new Region();

		if (request.getParameter("id") != null
				&& !request.getParameter("id").equals("undefined"))
			region.setId(Long.parseLong(request.getParameter("id")));



		region.setName(request.getParameter("regionName"));
		region.setManager(request.getParameter("regionManager"));
		region.setRegionDescription(request.getParameter("regionDescription"));
		region.setTown(request.getParameter("regionTown"));

		regionBean.add(region);

	}

	public void doDelete(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Long RegionId = Long.parseLong(request.getParameter("id"));
		regionBean.delete(RegionId);

	}

	private void list(HttpServletResponse response) throws ServletException,
			IOException {
		PrintWriter resp = response.getWriter();
		resp.println(regionBean.listInJson());
	}

	private void load(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter resp = response.getWriter();
		resp.println(regionBean.load(Long.parseLong(request.getParameter("id"))));
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

}
