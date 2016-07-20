package fleet.region.action;

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

import fleet.company.model.Company;
import fleet.region.bean.RegionBeanI;
import fleet.region.model.Region;
import fleet.region.model.Region;



@SuppressWarnings("Serial")
@WebServlet("/region/action/*")
public class RegionAction extends HttpServlet{
	
	private Logger log  = Logger.getLogger(getClass());
	
	@EJB
	private RegionBeanI regionBean;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		
			String [] pathRmp = request.getRequestURI().split("/");
			String path = pathRmp[pathRmp.length-1];
		
			this.list(response);
		
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		
			Region region = new Region();
			region.setRegionName(request.getParameter("regionName"));
			region.setRegionDescription(request.getParameter("regionDescription"));
			region.setRegionManager(request.getParameter("regionManager"));

			
			regionBean.add(region);
			
			
	}


	private void list(HttpServletResponse response)
			throws ServletException, IOException{
			PrintWriter resp = response.getWriter();
			List<Region> regions = regionBean.list();
	    
	    resp.println("<div class=\"text-right\">");
        resp.println("<a class=\"btn btn-success\"  onclick=\"region.add()\">Add</a>");
        resp.println("</div>");
        
	    for(Region region : regions){
	    	resp.println("<hr>");
	    	
	    	resp.println("<div class=\"row\">");
	    	resp.println("<div class=\"col-md-12\">");

	    	resp.println("Region Name :"+region.getRegionName()+"</br>");
	    	
	    	resp.println("Region Description :"+region.getRegionDescription() +"</br>");

			resp.println("Region Manager :"+region.getRegionManager()+"</br>");

	    	resp.println("</div>");
	    	resp.println("</div>");
			resp.println("<div class=\"text-right\">");

			resp.println("<a class=\"btn btn-sm\"  onclick=\"region.remove(" + region.getId() + ")\"><i class=\"fa fa-pencil fa-1x\" aria-hidden=\"true\"></i></a>");
			/*resp.println("<i class=\"fa fa-pencil fa-1x\" aria-hidden=\"true\"></i>");*/
			resp.println("<a class=\"btn btn-sm\"  onclick=\"region.remove(" + region.getId() + ")\"><i class=\"fa fa-trash-o fa-1x\" aria-hidden=\"true\"></i></a>");

			resp.println("</div>");
	    	
	    }
		
	}
	public void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		Long regionId = Long.parseLong(request.getParameter("id"));

		regionBean.delete(regionId);

	}
	
	

}
