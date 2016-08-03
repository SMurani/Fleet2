package fleet.person.action;

import fleet.common.model.Address;
import fleet.dispatch.bean.DispatchBeanI;
import fleet.dispatch.model.Dispatch;
import fleet.person.bean.PersonBeanI;
import fleet.person.model.Person;
import org.apache.log4j.Logger;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by sammy on 8/3/16.
 */
@WebServlet("/listUser/*")
public class listUsers extends HttpServlet {
    private Logger log  = Logger.getLogger(getClass());


    @EJB
    private PersonBeanI personBean;

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String [] pathRmp = request.getRequestURI().split("/");
        String path = pathRmp[pathRmp.length-1];

        this.list(response);

    }

  /*  public void doPost(HttpServletRequest request, HttpServletResponse response)
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


    }*/


    private void list(HttpServletResponse response)
            throws ServletException, IOException{
        PrintWriter resp = response.getWriter();
        List<Person> persons = personBean.list();

        resp.println("<div class=\"text-right\">");
        resp.println("<a class=\"btn btn-success\"  onclick=\"person.add()\">Create User</a>");
        resp.println("</div>");
        resp.println("<CENTER>");
        //resp.println("<table class=\"table table-condensed table-hover\">");
        resp.println("<div class=\"panel-body col-lg-12\">");
        resp.println("<div class=\"table-responsive\">");
        resp.println("<table class=\"table table-striped table-bordered table-hover\" id=\"dataTables-example\">");

        resp.println("<thead>");
        resp.println("<tr>");
        resp.println("<th>First Name</th>");
        resp.println("<th>LastName</th>");
        resp.println("<th>Username</th>");
        //resp.println("<th>Email Address</th>");
        resp.println("<th>User Type</th>");
        resp.println("<th>Actions</th>");
        resp.println("</tr>");
        resp.println("</thead>");

        for(Person person : persons){


            resp.println("<tr>");
            resp.print("<td>" + (person.getFirstname()) + "</td>");
            resp.print("<td>" + (person.getLastname()) + "</td>");
            resp.print("<td>" + (person.getUser().getUsername()) + "</td>");

            //resp.print("<td>" + (person.getAddress().getEmail()) + "</td>");
            String userT=person.getUser().getUserType();

            if("1".equals(userT)) {
                resp.print("<td>" + ("<a class=\"btn btn-success btn-sm\">ADMIN</a>")+ "</td>");

            }else if ("2".equals(userT)) {
                resp.print("<td>" + ("<a class=\"btn btn-success btn-sm\">CUSTOMER</a>") + "</td>");

            }else{
            //resp.print("<td>" + (person.getUser().getUserType()) + "</td>");
            resp.print("<td>"+ ("<a class=\"btn btn-danger btn-sm\">Not Activated</a>")+ "</td>");}

            resp.print("<td>" + ("<a class=\"btn btn-sm\"  onclick=\"person.remove(" + person.getId() + ")\"><i class=\"fa fa-trash-o fa-1x\" aria-hidden=\"true\"></i></a>")+ ("<a class=\"btn btn-sm\"  onclick=\"#\")\"><i class=\"fa fa-pencil fa-1x\" aria-hidden=\"true\"></i></a>")+ ("<a class=\"btn btn-sm\"  onclick=\"#\")\"><i class=\"fa fa-power-off fa-1x\" aria-hidden=\"true\"></i></a>")+"</td>");
            resp.println("</tr>");
        }


        resp.println("</table>");
        resp.println("</div>");
        resp.println("</div>");
        resp.println("</CENTER>");

    }
    public void doDelete(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        Long personId = Long.parseLong(request.getParameter("id"));

        personBean.delete(personId);

    }

    /*public void doDelete(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        Long personId = Long.parseLong(request.getParameter("id"));
        personBean.delete(personId);

    }*/




}
