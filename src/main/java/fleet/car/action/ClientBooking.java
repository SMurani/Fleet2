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


        Car car = new Car();



        car.setCarName(request.getParameter("carName"));
        car.setVIN(request.getParameter("carVIN"));
        car.setVehicleType(request.getParameter("carType"));
        car.setYear(request.getParameter("carYear"));
        car.setMake(request.getParameter("carMake"));
        car.setModel(request.getParameter("carModel"));
        car.setPlateNo(request.getParameter("carLicence"));
        car.setRegTown(request.getParameter("carRegistrationTown"));
        car.setPhoto(request.getParameter("carPhoto"));
        car.setColor(request.getParameter("carColor"));
        car.setMSRP(request.getParameter("carMSRP"));
        car.setCarDescription(request.getParameter("carComments"));
        car.setCarOwner(request.getParameter("carOwner"));

        carBean.add(car);



    }


    private void list(HttpServletResponse response)
            throws ServletException, IOException{
        PrintWriter resp = response.getWriter();
        List<Car> cars = carBean.list2();

        resp.println("<div class=\"text-right\">");

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
        resp.println("<th>Model</th>");

        resp.println("<th>Plate No</th>");

        resp.println("<th>Color</th>");
        resp.println("<th>Photo</th>");
        resp.println("<th>Actions</th>");
        resp.println("</tr>");
        resp.println("</thead>");

        for(Car car : cars){

            resp.println("<tr>");
            resp.print("<td>" + (car.getCarName()) + "</td>");
            resp.print("<td>" + (car.getVehicleType()) + "</td>");
            resp.print("<td>" + (car.getModel()) + "</td>");

            resp.print("<td>" + (car.getPlateNo()) + "</td>");

            resp.print("<td>" + (car.getColor()) + "</td>");

            resp.print("<td> <img src="+uploadsUrl + (car.getPhoto()) + "  width=\"60px\" ></td>");


            resp.print("<td>" + ("<a class=\"btn btn-success btn-sm\">Book Car</a>")+ "</td>");
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
