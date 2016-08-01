package fleet.report.action;

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
import fleet.report.bean.ReportBeanI;
import fleet.report.model.Report;
import fleet.report.model.Report;



@SuppressWarnings("Serial")
@WebServlet("/report/action/*")
public class ReportAction extends HttpServlet{
	
	private Logger log  = Logger.getLogger(getClass());
	
	@EJB
	private ReportBeanI reportBean;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		
			String [] pathRmp = request.getRequestURI().split("/");
			String path = pathRmp[pathRmp.length-1];
		
			this.list(response);
		
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		
			Report report = new Report();
			report.setReportName(request.getParameter("reportName"));
			report.setReportDescription(request.getParameter("reportDescription"));
			report.setReportManager(request.getParameter("reportManager"));

			
			reportBean.add(report);
			
			
	}


	private void list(HttpServletResponse response)
			throws ServletException, IOException{
			PrintWriter resp = response.getWriter();
			List<Report> reports = reportBean.list();
	    
	    resp.println("<div class=\"text-right\">");
        resp.println("<a class=\"btn btn-success\"  onclick=\"report.add()\">Add</a>");
        resp.println("</div>");
        
	    for(Report report : reports){
	    	resp.println("<hr>");
	    	
	    	resp.println("<div class=\"row\">");
	    	resp.println("<div class=\"col-md-12\">");

	    	resp.println("Report Name :"+report.getReportName()+"</br>");
	    	
	    	resp.println("Report Description :"+report.getReportDescription() +"</br>");

			resp.println("Report Manager :"+report.getReportManager()+"</br>");

	    	resp.println("</div>");
	    	resp.println("</div>");
			resp.println("<div class=\"text-right\">");

			resp.println("<a class=\"btn btn-sm\"  onclick=\"report.remove(" + report.getId() + ")\"><i class=\"fa fa-pencil fa-1x\" aria-hidden=\"true\"></i></a>");
			/*resp.println("<i class=\"fa fa-pencil fa-1x\" aria-hidden=\"true\"></i>");*/
			resp.println("<a class=\"btn btn-sm\"  onclick=\"report.remove(" + report.getId() + ")\"><i class=\"fa fa-trash-o fa-1x\" aria-hidden=\"true\"></i></a>");

			resp.println("</div>");
	    	
	    }
		
	}
	public void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		Long reportId = Long.parseLong(request.getParameter("id"));

		reportBean.delete(reportId);

	}
	
	

}
