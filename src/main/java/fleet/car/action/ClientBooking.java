package fleet.car.action;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fleet.car.model.CarBooking;
import org.apache.commons.fileupload.FileItemIterator;
import org.apache.commons.fileupload.FileItemStream;
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
@WebServlet("/clientBooking/*")

public class ClientBooking extends HttpServlet{

    private Logger log  = Logger.getLogger(getClass());
    private String uploadsUrl = "uploads/";


    private Car car;
    @EJB
    private CarBeanI carBean;





    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{

        String [] pathRmp = request.getRequestURI().split("/");
        String path = pathRmp[pathRmp.length-1];

        this.list(response);

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{

        //String userId=  request.getSession().getAttribute("uid").toString ();
       // System.out.println(userId);
       // String userName=request.getSession().getAttribute("username").toString();
        //System.out.println(userName);
        CarBooking book=new CarBooking();





        book.setBooingDate(request.getParameter("bookFrom"));
        book.setReturnDate(request.getParameter("bookTo"));
        book.setDriver(request.getParameter("bookDriver"));
        //book.setCar(request.getParameter("car"));
        book.setPurpose(request.getParameter("bookPurpose"));
        book.setComments(request.getParameter("bookComments"));
        //book.setUserId(request.getParameter("userId"));
       // book.setUsername(request.getParameter("userName"));



        carBean.book(book);



    }

    private void list(HttpServletResponse response)
            throws ServletException, IOException{
        PrintWriter resp = response.getWriter();
        List<Car> cars = carBean.list2();


        resp.println("<CENTER>");

        resp.println("<div class=\"panel-body col-lg-12\">");
        resp.println("<div class=\"table-responsive\">");
        resp.println("<table class=\"table table-striped table-hover\" id=\"dataTables-example\">");



        for(Car car : cars){

            resp.println("<tr>");



            resp.println("<td class=\"col-sm-5\">");

            resp.print("<div >"

                    +"<a href=\"#\" class=\"media-box\"><img src="+uploadsUrl + (car.getPhoto()) + " width=\"300px\" height=\"200px\"><span class=\"zoom\"><span class=\"icon\"><i class=\"icon-plus\"></i></span></span></a>"+

                    "</div>");
            resp.println("</td>");

            resp.println("<td class=\"col-sm-7\">");

                    resp.print("<div >"
                            + "<h3>" +"<b>" +(car.getCarName()) + "</b>" +"</h3>" + "<br>"
                           +"<h5>"+"<i>"+ "Type: " +"</i>"  +(car.getVehicleType())+ "<br>"+" </h5>"
                            +"<h5>" + "<i>"+"Make:  " +"</i>"  +(car.getMake())+ "<br>" +" </h5>"
                            +"<h5>" +"<i>"+ "Color: " +"</i>" +"  "+ (car.getColor())+ "<br>" +" </h5>"
                            +"<h5>"+"<i>"+"Model:   "+"</i>"+ (car.getModel()) + "<br>"+ " </h5>"
                            +"<h5 class=\"danger\">"+"<i>"+"Costing:   "+"</i>"+ ("$100 Per Day") +"<br>" + ("$2500 Per Month") + "<br>"+ " </h5>" +
                            "</div>");
            resp.println("</td>");
            resp.print("<td>" + ("<a class=\"btn btn-success btn-sm\"  onclick=\"car.book()\">Book Now</a>")+ "</td>");



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
    public void setCar(Car car){
        this.car=car;
    }

    public Car getCar(){
        return car;
    }

    private void load(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter resp = response.getWriter();
        resp.println(carBean.load(Long.parseLong(request.getParameter("id"))));
    }

    private void listJson(HttpServletResponse response) throws ServletException,
            IOException {
        PrintWriter resp = response.getWriter();
        resp.println(carBean.listInJson());
    }



}
