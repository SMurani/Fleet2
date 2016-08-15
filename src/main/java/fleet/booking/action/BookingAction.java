package fleet.booking.action;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;

import javax.ejb.EJB;
import javax.persistence.criteria.CriteriaBuilder;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import org.apache.log4j.Logger;

import fleet.company.model.Company;
import fleet.booking.bean.BookingBeanI;
import fleet.booking.model.Booking;
import fleet.booking.model.Booking;
import org.hibernate.mapping.Table;


@SuppressWarnings("Serial")
@WebServlet("/booking/*")
public class BookingAction extends HttpServlet{
	
	private Logger log  = Logger.getLogger(getClass());

	public BookingAction() {
		super();
	}
	
	@EJB
	private BookingBeanI bookingBean;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		
			String [] pathRmp = request.getRequestURI().split("/");
			String path = pathRmp[pathRmp.length-1];

		if(path.equals("update")){
			Long status = Long.parseLong(request.getParameter("id"));
			bookingBean.update(status);


		}
		else if (path.equalsIgnoreCase("UserBook"))
		{
			this.UserBook(request, response);

		}
		else if (path.equalsIgnoreCase("report"))
		{
			this.report(response, request);

		}
		else {

			this.list(response);
		}

		
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		
			Booking booking = new Booking();
			String status="2";
			String userId=  request.getSession().getAttribute("uid").toString ();
			String username=request.getSession().getAttribute("user").toString();
			booking.setReturnDate(request.getParameter("bookTo"));
			booking.setPurpose(request.getParameter("bookPurpose"));
			booking.setBooingDate(request.getParameter("bookFrom"));
			booking.setDriver(request.getParameter("bookDriver"));
			booking.setContactNo(request.getParameter("phoneNumber"));

			DateFormat simDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Date date = new Date();
			booking.setDataPosted(simDateFormat.format(date));
			booking.setStatus(status);
			booking.setUserId(userId);
			booking.setUsername(username);


			booking.setComments(request.getParameter("bookComments"));



			
			bookingBean.add(booking);
			
			
	}


	private void list(HttpServletResponse response)
			throws ServletException, IOException{
			PrintWriter resp = response.getWriter();

			List<Booking> bookings = bookingBean.list();

		//resp.println(bookingBean.countBooking());
		//resp.println(bookingBean.countApproved());
		resp.println("<h4>Bookings Table</h4>");
		resp.println("<CENTER>");
		resp.println("<div class=\"panel-body col-lg-12\">");
		resp.println("<div class=\"table-responsive\">");
		resp.println("<table class=\"table table-striped table-bordered table-hover\" id=\"dataTables-example\">");
		resp.println("<thead>");
		resp.println("<tr>");
		resp.println("<th>#</th>");
		resp.println("<th>Date Posted</th>");
		resp.println("<th>Booking Date</th>");
		resp.println("<th>To Date</th>");
		resp.println("<th>Driver</th>");
		resp.println("<th>Status</th>");
		resp.println("<th>Purpose</th>");
		resp.println("<th>Contact Number</th>");
		resp.println("<th>UserName</th>");
		resp.println("<th>Actions</th>");
		resp.println("</tr>");
		resp.println("</thead>");
        
	    for(Booking booking : bookings){


			resp.println("<tr>");
			resp.println("<td></td>");
			resp.print("<td>" + (booking.getDataPosted()) + "</td>");
			resp.print("<td>" + (booking.getReturnDate()) + "</td>");
			resp.print("<td>" + (booking.getBooingDate()) + "</td>");
			resp.print("<td>" + (booking.getDriver()) + "</td>");

			String status=booking.getStatus();

			if("1".equals(status)) {
				resp.print("<td>" + ("<a class=\"btn btn-success btn-sm\">Approved</a>")+ "</td>");

			}else{
				resp.print("<td>" + ("<a class=\"btn btn-warning btn-sm\">Pending</a>") + "</td>");
			}
			//resp.print("<td>" + (booking.getStatus()) + "</td>");
			resp.print("<td>" + (booking.getPurpose()) + "</td>");
			resp.print("<td>" + (booking.getContactNo()) + "</td>");
			resp.print("<td>" + (booking.getUsername()) + "</td>");


			resp.print("<td>" + ("<a class=\"btn btn-sm\"  onclick=\"booking.remove(" + booking.getId() + ")\"><i class=\"fa fa-trash-o fa-1x\" aria-hidden=\"true\"></i></a>")+ (" || ") + ("<a class=\"btn btn-sm\"  onclick=\"dispatch.remove(\" + dispatch.getId() + \")\"><i class=\"fa fa-pencil fa-1x\" aria-hidden=\"true\"></i></a>")+ ("||") +  ("<a class=\"btn btn-sm\"  onclick=\"booking.update(" + booking.getId() + ")\"><i class=\"fa fa-power-off fa-1x\" aria-hidden=\"true\"></i></a>")+"</td>");
			resp.println("</tr>");
	    	
	    }
		resp.println("</table>");
		resp.println("</div>");
		resp.println("</div>");
		resp.println("</CENTER>");
		
	}
	private void UserBook(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		PrintWriter resp=response.getWriter();
		HttpSession session = request.getSession();
		String id = session.getAttribute("uid").toString();
		List<Booking> bookings = bookingBean.UserBook(id);

		resp.println("<h4>My Bookings</h4>");
		resp.println("<div class=\"text-right\">");
		resp.println("<a class=\"btn btn-success\"  onclick=\"booking.add()\">Add</a>");
		resp.println("</div>");
		resp.println("<CENTER>");
		resp.println("<div class=\"panel-body col-lg-12\">");
		resp.println("<div class=\"table-responsive\">");
		resp.println("<table class=\"table table-striped table-bordered table-hover\" id=\"dataTables-example\">");

		resp.println("<thead>");
		resp.println("<tr>");
		resp.println("<th>#</th>");
		resp.println("<th>Date Posted</th>");
		resp.println("<th>Booking Date</th>");
		resp.println("<th>To Date</th>");
		resp.println("<th>Driver</th>");
		resp.println("<th>Status</th>");
		resp.println("<th>Purpose</th>");

		resp.println("<th>Contact Number</th>");


		resp.println("</tr>");
		resp.println("</thead>");

		for(Booking booking : bookings){


			resp.println("<tr>");
			resp.println("<td></td>");
			resp.print("<td>" + (booking.getDataPosted()) + "</td>");
			resp.print("<td>" + (booking.getReturnDate()) + "</td>");
			resp.print("<td>" + (booking.getBooingDate()) + "</td>");
			resp.print("<td>" + (booking.getDriver()) + "</td>");

			String status=booking.getStatus();

			if("1".equals(status)) {
				resp.print("<td>" + ("<a class=\"btn btn-success btn-sm\">Approved</a>")+ "</td>");

			}else{
				resp.print("<td>" + ("<a class=\"btn btn-warning btn-sm\">Pending</a>") + "</td>");
			}

			resp.print("<td>" + (booking.getPurpose()) + "</td>");

			resp.print("<td>" + (booking.getContactNo()) + "</td>");



			resp.println("</tr>");

		}
		resp.println("</table>");
		resp.println("</div>");
		resp.println("</div>");
		resp.println("</CENTER>");
	}
	public void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		Long bookingId = Long.parseLong(request.getParameter("id"));

		bookingBean.delete(bookingId);

	}

	public void update(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Long status = Long.parseLong(request.getParameter("id"));
		bookingBean.update(status);

	}
	public void report(HttpServletResponse resp, HttpServletRequest request)
		throws ServletException, IOException{



	}








}
