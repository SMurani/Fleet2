package fleet.car.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import fleet.company.model.Company;
import fleet.car.bean.CarBeanI;
import fleet.car.model.Car;
import fleet.car.model.Car;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.output.*;

//import java.awt.List;
import java.io.File;


import java.util.Iterator;

@SuppressWarnings("Serial")
@WebServlet("/car/action/*")
public class CarAction extends HttpServlet{
	
	private Logger log  = Logger.getLogger(getClass());

	private String uploadsUrl = "/home/sammy/work/fleet/uploads/";
	
	@EJB
	private CarBeanI carBean;

	private boolean isMultipart;
	private String filePath;
	private int maxFileSize = 500 * 1024;
	private int maxMemSize = 40 * 1024;
	private File file ;

	public void init( ){

		filePath = getServletContext().getInitParameter("file-upload");
	}


	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		
			String [] pathRmp = request.getRequestURI().split("/");
			String path = pathRmp[pathRmp.length-1];
		
			this.list(response);
		
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		isMultipart = ServletFileUpload.isMultipartContent(request);
		response.setContentType("text/html");
		/*java.io.PrintWriter out = response.getWriter( );
		if( !isMultipart ){
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet upload</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<p>No file uploaded</p>");
			out.println("</body>");
			out.println("</html>");
			return;
		}

		DiskFileItemFactory factory = new DiskFileItemFactory();
		// maximum size that will be stored in memory
		factory.setSizeThreshold(maxMemSize);
		// Location to save data that is larger than maxMemSize.
		factory.setRepository(new File("c:\\temp"));

		// Create a new file upload handler
		ServletFileUpload upload = new ServletFileUpload(factory);
		// maximum file size to be uploaded.
		upload.setSizeMax( maxFileSize );*/

		try{
			// Parse the request to get file items.
			//List fileItems = (List) upload.parseRequest(request);


			// Process the uploaded file items
			/*Iterator i = ((java.util.List<FileItem>) fileItems).iterator();
			filePath = request.getSession().getServletContext().getRealPath("/");
			filePath = filePath + uploadsUrl;

			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet upload</title>");
			out.println("</head>");
			out.println("<body>");
			while ( i.hasNext () )
			{
				FileItem fi = (FileItem)i.next();
				if ( !fi.isFormField () )
				{
					// Get the uploaded file parameters
					String fieldName = fi.getFieldName();
					String fileName = fi.getName();
					String contentType = fi.getContentType();
					boolean isInMemory = fi.isInMemory();
					long sizeInBytes = fi.getSize();
					// Write the file
					if( fileName.lastIndexOf("\\") >= 0 ){
						file = new File( filePath +
								fileName.substring( fileName.lastIndexOf("\\"))) ;
					}else{
						file = new File( filePath +
								fileName.substring(fileName.lastIndexOf("\\")+1)) ;
					}
					fi.write( file ) ;
					out.println("Uploaded Filename: " + fileName + "<br>");
				}
			}
			out.println("</body>");
			out.println("</html>");
*/

			Car car = new Car();

		//	filePath = request.getSession().getServletContext().getRealPath("/");

			car.setCarName(request.getParameter("carName"));
			car.setVIN(request.getParameter("carVIN"));
			car.setVehicleType(request.getParameter("carType"));
			car.setYear(request.getParameter("carYear"));
			car.setMake(request.getParameter("carMake"));
			car.setModel(request.getParameter("carModel"));
			car.setPlateNo(request.getParameter("carLicence"));
			car.setRegTown(request.getParameter("carRegistrationTown"));
			car.setPhoto(uploadsUrl+request.getParameter("carPhoto"));
			car.setColor(request.getParameter("carColor"));
			car.setMSRP(request.getParameter("carMSRP"));
			car.setCarDescription(request.getParameter("carComments"));
			car.setCarOwner(request.getParameter("carOwner"));

			carBean.add(car);

		}catch(Exception ex) {
			ex.printStackTrace();
		}

	}


	private void list(HttpServletResponse response)
			throws ServletException, IOException{
			PrintWriter resp = response.getWriter();
			List<Car> cars = carBean.list();
	    
	    resp.println("<div class=\"text-right\">");
        resp.println("<a class=\"btn btn-success\"  onclick=\"car.add()\">Add</a>");
        resp.println("</div>");
		resp.println("<CENTER>");
		//resp.println("<table class=\"table table-condensed table-hover\">");
		resp.println("<div class=\"panel-body col-lg-12\">");
		resp.println("<div class=\"table-responsive\">");
		resp.println("<table class=\"table table-striped table-bordered table-hover\" id=\"dataTables-example\">");

		resp.println("<thead>");
		resp.println("<tr>");
		resp.println("<th>Name</th>");
		resp.println("<th>Type</th>");
		resp.println("<th>Year</th>");
		resp.println("<th>Owner</th>");
		resp.println("<th>Plate No</th>");
		resp.println("<th>Licence</th>");
		resp.println("<th>Color</th>");
		resp.println("<th>Actions</th>");
		resp.println("</tr>");
		resp.println("</thead>");

		for(Car car : cars){

			resp.println("<tr>");
			resp.print("<td>" + (car.getCarName()) + "</td>");
			resp.print("<td>" + (car.getVehicleType()) + "</td>");
			//resp.print("<td>" + (car.getModel()) + "</td>");
			resp.print("<td>" + (car.getYear()) + "</td>");
			resp.print("<td>" + (car.getCarOwner()) + "</td>");
			resp.print("<td>" + (car.getPlateNo()) + "</td>");
			resp.print("<td>" + (car.getVIN()) + "</td>");
			resp.print("<td>" + (car.getColor()) + "</td>");
			//resp.print("<td>" + (car.getRegTown()) + "</td>");



			//resp.print("<td>" + (car.getMake()) + "</td>");


			resp.print("<td> <img src=\"file://" + (car.getPhoto()) + "\"/></td>");

			//resp.print("<td>" + (car.getCarDescription()) + "</td>");
			//resp.print("<td>" + (car.getMSRP()) + "</td>");
			resp.print("<td>" + ("<a class=\"btn btn-sm\"  onclick=\"car.remove(" + car.getId() + ")\"><i class=\"fa fa-trash-o fa-1x\" aria-hidden=\"true\"></i></a>")+ ("<a class=\"btn btn-sm\"  onclick=\"car.remove(\" + car.getId() + \")\"><i class=\"fa fa-pencil fa-1x\" aria-hidden=\"true\"></i></a>")+ "</td>");
			resp.println("</tr>");

		}


		resp.println("</table>");
		resp.println("</div>");
		resp.println("</div>");
		resp.println("</CENTER>");


	}
	public void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		Long carId = Long.parseLong(request.getParameter("id"));

		carBean.delete(carId);

	}
	
	

}
