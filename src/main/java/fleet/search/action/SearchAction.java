package fleet.search.action;

import fleet.search.bean.SearchBeanI;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by sammy on 7/26/16.
 */
@SuppressWarnings("serial")
@WebServlet("/search/*")
public class SearchAction extends HttpServlet{
    @EJB
    private SearchBeanI searchBean;

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        String [] pathCmp = request.getRequestURI().split("/");
        String path = pathCmp[pathCmp.length-1];

    }

    public void doPost(HttpServletRequest request,HttpServletResponse response)
            throws ServletException, IOException{

        PrintWriter resp = response.getWriter();
        String confirmationLink, search;
        confirmationLink = request.getSession().getAttribute("user").toString();
        search = request.getParameter("search").toUpperCase();

        int count = searchBean.countCustomerSearch(confirmationLink, search);

        if(count == 0){
            resp.println(count);
        }else{
            this.searchCar(response, confirmationLink, search);
        }
    }

    public void searchCar(HttpServletResponse response, String confirmationLink, String search)
            throws ServletException, IOException{
        PrintWriter resp = response.getWriter();
        resp.println(searchBean.carsGivenInJson(confirmationLink, search));
    }
}
