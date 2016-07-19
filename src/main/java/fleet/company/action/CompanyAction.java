/*
package fleet.company.action;

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

import fleet.company.bean.CompanyBeanI;
import fleet.company.model.Company;

@SuppressWarnings("serial")
//@WebServlet("/company/action*/
/*")
@WebServlet("/company*/
/*")
public class CompanyAction extends HttpServlet{
	
	private Logger log  = Logger.getLogger(getClass());
	
	@EJB	
	private CompanyBeanI companyBean;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	 throws ServletException, IOException{
		String [] pathCmp = request.getRequestURI().split("/");
		String path = pathCmp[pathCmp.length-1];
*/
/*
		if(path.equalsIgnoreCase("add"))
			this.add(request, response);
		else*//*

		this.list(response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{

		if(request.getParameter("id") != null
				&& !request.getParameter("id").equals("undefined"))
			company.setId(Long.parseLong(request.getParameter("id")));

		Company company = new Company();
		company.setName(request.getParameter("name"));
		company.setRegNo(request.getParameter("regNo"));
		
		companyBean.add(company);
		
	}
	
	public void doDelete(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		Long companyId = Long.parseLong(request.getParameter("id"));

		companyBean.delete(companyId);
		
	}
	
	private void list(HttpServletResponse response) 
			throws ServletException, IOException {
		PrintWriter resp = response.getWriter();
		List<Company> companies = companyBean.list();

		resp.println("<div class=\"text-right\">");
		resp.println("<a class=\"btn btn-success\"  onclick=\"company.add()\">Add</a>");
		resp.println("</div>");


		resp.println("<CENTER>");
		resp.println("<table class=\"table table-condensed table-hover\">");

		for(Company company : companies) {

			resp.println("<tr>");
			resp.print("<td>" + ("Come") + "</td>");
			resp.print("<td>" + (company.getName()) + "</td>");
			resp.print("<td>" + (company.getName()) + "</td>");
			resp.print("<td>" + ("what") + "</td>");
			resp.print("<td>" + ("here") + "</td>");
			resp.print("<td>" + ("there") + "</td>");
			resp.print("<td>" + ("when ") + "</td>");
			resp.println("</tr>");

		}




		resp.println("</table>");
		resp.println("</CENTER>");
	}
	
}
*/

package fleet.company.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fleet.common.model.Address;
import fleet.company.bean.CompanyBeanI;
import fleet.company.model.Company;

@SuppressWarnings("serial")
@WebServlet("/company/*")
public class CompanyAction extends HttpServlet{

	private Company company;

	@EJB
	private CompanyBeanI companyBean;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		String [] pathCmp = request.getRequestURI().split("/");
		String path = pathCmp[pathCmp.length-1];

		if(path.equalsIgnoreCase("load"))
			this.load(request, response);
		else
			this.list(response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{

		Company company = new Company();

		if(request.getParameter("id") != null
				&& !request.getParameter("id").equals("undefined"))
			company.setId(Long.parseLong(request.getParameter("id")));

		company.setName(request.getParameter("name"));
		company.setRegNo(request.getParameter("regNo"));

		company.setAddress(new Address());
		company.getAddress().setPhoneNo(request.getParameter("phoneNo"));
		company.getAddress().setEmail(request.getParameter("email"));
		company.getAddress().setTown(request.getParameter("town"));
		company.getAddress().setCountry(request.getParameter("country"));
		company.getAddress().setBox(request.getParameter("box"));

		companyBean.add(company);

	}

	public void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		Long companyId = Long.parseLong(request.getParameter("id"));
		companyBean.delete(companyId);

	}

	private void list(HttpServletResponse response)
			throws ServletException, IOException{
		PrintWriter resp = response.getWriter();
		resp.println(companyBean.listInJson());
	}

	private void load(HttpServletRequest request,
					  HttpServletResponse response)
			throws ServletException, IOException{
		PrintWriter resp = response.getWriter();
		resp.println(companyBean.load(Long.parseLong(request.getParameter("id"))));
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

}
