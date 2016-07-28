package fleet.vendor.action;

import fleet.common.model.Address;
import fleet.vendor.bean.VendorBeanI;
import fleet.vendor.model.Vendor;


import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by sammy on 7/23/16.
 */
@SuppressWarnings("serial")
@WebServlet("/vendor/*")
public class VendorAction extends HttpServlet{

    private Vendor vendor;

    @EJB
    private VendorBeanI vendorBean;

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

        Vendor vendor = new Vendor();

        if(request.getParameter("id") != null
                && !request.getParameter("id").equals("undefined"))
            vendor.setId(Long.parseLong(request.getParameter("id")));

        vendor.setName(request.getParameter("name"));
        vendor.setSpeciality(request.getParameter("speciality"));

        vendor.setAddress(new Address());
        vendor.getAddress().setPhoneNo(request.getParameter("phoneNo"));
        vendor.getAddress().setEmail(request.getParameter("email"));
        vendor.getAddress().setTown(request.getParameter("town"));
        vendor.getAddress().setCountry(request.getParameter("country"));
        vendor.getAddress().setBox(request.getParameter("box"));

        vendorBean.add(vendor);

    }

    public void doDelete(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        Long vendorId = Long.parseLong(request.getParameter("id"));
        vendorBean.delete(vendorId);

    }

    private void list(HttpServletResponse response)
            throws ServletException, IOException{
        PrintWriter resp = response.getWriter();
        resp.println(vendorBean.listInJson());
    }

    private void load(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException{
        PrintWriter resp = response.getWriter();
        resp.println(vendorBean.load(Long.parseLong(request.getParameter("id"))));
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }



}
