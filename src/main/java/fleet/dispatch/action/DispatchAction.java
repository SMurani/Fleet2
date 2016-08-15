package fleet.dispatch.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import fleet.company.model.Company;
import fleet.dispatch.bean.DispatchBeanI;
import fleet.dispatch.model.Dispatch;
import fleet.dispatch.model.Dispatch;



@SuppressWarnings("Serial")
@WebServlet("/dispatch/action/*")
@MultipartConfig(maxFileSize = 16177215)
public class DispatchAction extends HttpServlet{

    private Logger log  = Logger.getLogger(getClass());
    private String uploadsUrl = "documents/";

    @EJB
    private DispatchBeanI dispatchBean;

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{

        String [] pathRmp = request.getRequestURI().split("/");
        String path = pathRmp[pathRmp.length-1];

        this.list(response);

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{





        Dispatch dispatch = new Dispatch();

        dispatch.setCar(request.getParameter("dipatchVehicle"));


        dispatch.setClient(request.getParameter("dispatchClient"));

        DateFormat simDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        dispatch.setDateTaken(simDateFormat.format(date));
        dispatch.setDataReturn(request.getParameter("dispatchReturnDate"));
        dispatch.setAgreement(request.getParameter("dispatchDoc"));
        dispatch.setComments(request.getParameter("dispatchCommet"));


        dispatchBean.add(dispatch);


    }


    private void list(HttpServletResponse response)
            throws ServletException, IOException{
        PrintWriter resp = response.getWriter();
        List<Dispatch> dispatchs = dispatchBean.list();

        resp.println("<h4>Dispatch List</h4>");
        resp.println("<div class=\"text-right\">");
        resp.println("<a class=\"btn btn-success\"  onclick=\"dispatch.add()\">Add</a>");
        resp.println("</div>");
        resp.println("<CENTER>");
        //resp.println("<table class=\"table table-condensed table-hover\">");
        resp.println("<div class=\"panel-body col-lg-12\">");
        resp.println("<div class=\"table-responsive\">");
        resp.println("<table class=\"table table-striped table-bordered table-hover\" id=\"dataTables-example\">");

        resp.println("<thead>");
        resp.println("<tr>");
        resp.println("<th>#</th>");
        resp.println("<th>Vehicle Reg No</th>");
        resp.println("<th>Client Name</th>");
        resp.println("<th>Date Taken</th>");
        resp.println("<th>Return Date</th>");
        resp.println("<th>Document</th>");
        resp.println("<th>Actions</th>");
        resp.println("</tr>");
        resp.println("</thead>");

        for(Dispatch dispatch : dispatchs){


            resp.println("<tr>");
            resp.print("<td></td>");
            resp.print("<td>" + (dispatch.getCar()) + "</td>");
            resp.print("<td>" + (dispatch.getClient()) + "</td>");
            resp.print("<td>" + (dispatch.getDateTaken()) + "</td>");
            resp.print("<td>" + (dispatch.getDataReturn()) + "</td>");
            resp.print("<td>"+ "<a href= "+ uploadsUrl + (dispatch.getAgreement()) + ">Download "+dispatch.getAgreement()+"</a>");


            resp.print("<td>" + ("<a class=\"btn btn-sm\"  onclick=\"dispatch.remove(" + dispatch.getId() + ")\"><i class=\"fa fa-trash-o fa-1x\" aria-hidden=\"true\"></i></a>")+ ("<a class=\"btn btn-sm\"  onclick=\"dispatch.remove(\" + dispatch.getId() + \")\"><i class=\"fa fa-pencil fa-1x\" aria-hidden=\"true\"></i></a>")+ "</td>");
            resp.println("</tr>");
        }


        resp.println("</table>");
        resp.println("</div>");
        resp.println("</div>");
        resp.println("</CENTER>");

    }
    public void doDelete(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        Long dispatchId = Long.parseLong(request.getParameter("id"));

        dispatchBean.delete(dispatchId);

    }



}