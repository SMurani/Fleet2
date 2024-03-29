package fleet.search.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fleet.search.bean.SearchBeanI;

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

      /*  PrintWriter resp = response.getWriter();
        String  search;
        search = request.getParameter("search").toUpperCase();

        int count = searchBean.countCustomerSearch(search);

        if(count == 0){
            resp.println(count);
        }else{
            this.searchCustomer(response,  search);
        }
*/      PrintWriter out = response.getWriter();
        String checkbox = request.getParameter("search");
        String searchParameter = request.getParameter("search");

        if (checkbox.equals("Name")){
            searchBean.searchByName(searchParameter);
            out.println(searchBean.searchByName(searchParameter));

        }

    }

    public void searchCustomer(HttpServletResponse response,  String search)
            throws ServletException, IOException{
        PrintWriter resp = response.getWriter();
        resp.println(searchBean.driverInJson(search));
    }

}