package fleet.client.action;

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


import fleet.client.bean.ClientBeanI;
import fleet.client.model.Client;
import fleet.common.model.Address;



@SuppressWarnings("Serial")
@WebServlet("/client/action/*")
public class ClientAction extends HttpServlet{
	
	private Logger log  = Logger.getLogger(getClass());
	
	@EJB
	private ClientBeanI clientBean;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		
			String [] pathRmp = request.getRequestURI().split("/");
			String path = pathRmp[pathRmp.length-1];
		
			this.list(response);
		
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		
			/*Client client = new Client();
			client.setClientName(request.getParameter("clientName"));
			client.setClientDescription(request.getParameter("clientDescription"));
			client.setClientManager(request.getParameter("clientManager"));*/



		Client client = new Client();
		client.setClientName(request.getParameter("clientName"));
		client.setIdNo(request.getParameter("clientId"));
		//client.setRegitrationDate();

		client.setAddress(new Address());
		client.getAddress().setPhoneNo(request.getParameter("clientPhoneNo"));
		client.getAddress().setEmail(request.getParameter("clientEmail"));
		client.getAddress().setTown(request.getParameter("clientCity"));
		client.getAddress().setCountry(request.getParameter("clientCountry"));
		client.getAddress().setBox(request.getParameter("clientBox"));

			
			clientBean.add(client);
			
			
	}


	private void list(HttpServletResponse response)
			throws ServletException, IOException{
			PrintWriter resp = response.getWriter();
			List<Client> clients = clientBean.list();
	    
	    resp.println("<div class=\"text-right\">");
        resp.println("<a class=\"btn btn-success\"  onclick=\"client.add()\">Add</a>");
        resp.println("</div>");


		resp.println("<CENTER>");
		//resp.println("<table class=\"table table-condensed table-hover\">");
		resp.println("<div class=\"panel-body col-lg-12\">");
		resp.println("<div class=\"table-responsive\">");
		resp.println("<table class=\"table table-striped table-bordered table-hover\" id=\"dataTables-example\">");

		resp.println("<thead>");
		resp.println("<tr>");
		resp.println("<th>Name</th>");
		resp.println("<th>ID No</th>");
		resp.println("<th>Phone No</th>");
		resp.println("<th>Email Address</th>");
		resp.println("<th>City</th>");
		resp.println("<th>Country</th>");
		resp.println("<th>Box</th>");
		resp.println("<th>Actions</th>");
		resp.println("</tr>");
		resp.println("</thead>");

		for(Client client : clients) {

			resp.println("<tr>");
			resp.print("<td>" + (client.getClientName()) + "</td>");
			resp.print("<td>" + (client.getIdNo()) + "</td>");
			/*resp.print("<td>" + (client.getAddress().getEmail()) + "</td>");*/

			resp.print("<td>" + ("<a class=\"btn btn-sm\"  onclick=\"client.remove(" + client.getId() + ")\"><i class=\"fa fa-trash-o fa-1x\" aria-hidden=\"true\"></i></a>")+ ("<a class=\"btn btn-sm\"  onclick=\"client.remove(\" + client.getId() + \")\"><i class=\"fa fa-pencil fa-1x\" aria-hidden=\"true\"></i></a>")+ "</td>");
			resp.println("</tr>");


		}


		resp.println("</table>");
		resp.println("</div>");
		resp.println("</div>");
		resp.println("</CENTER>");


	}
	public void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		Long clientId = Long.parseLong(request.getParameter("id"));

		clientBean.delete(clientId);

	}
	
	

}
