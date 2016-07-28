/*
package fleet.car.action;

*/
/**
 * Created by sammy on 7/26/16.
 *//*



import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.jar.Attributes.Name;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.Part;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileItemIterator;
import org.apache.commons.fileupload.FileItemStream;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import fleet.car.bean.CarBeanI;
import fleet.car.model.Car;

@WebServlet("/imageUpload")
@MultipartConfig(maxFileSize = 16177215)
public class ImageUpload extends HttpServlet{
    @EJB
    //private carBeanI carBean;

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {

    };

    protected void doPost(final HttpServletRequest request,
                          final HttpServletResponse response) throws ServletException,
            IOException {

        fileUpload(request, response);
    }

    public void fileUpload(HttpServletRequest request,
                           HttpServletResponse response) throws ServletException, IOException {
        boolean isMultipart = ServletFileUpload.isMultipartContent(request);
        if (isMultipart) {
            ServletFileUpload upload = new ServletFileUpload();
            try {

                String carName = null, carVIN = null, carType = null, carYear = null, carMake = null, carModel = null, carLicence = null, carRegistrationTown = null, carPhoto = null, carMSRP=null, carComments=null, carOwner;

                FileItemIterator itr = upload.getItemIterator(request);
                while (itr.hasNext()) {
                    FileItemStream item = itr.next();
                    if (item.isFormField()) {

                        String fieldName = item.getFieldName();
                        InputStream is = item.openStream();
                        byte[] b = new byte[is.available()];
                        is.read(b);
                        String value = new String(b);

                        response.getWriter().println(
                                fieldName + ":" + value + "</br>");
                        if (fieldName.equals("carName")) {
                            carName = value.toString();

                        } else if (fieldName.equals("carVIN")) {
                            carVIN = value.toString();
                        }

                        else if (fieldName.equals("carType")) {
                            carType = value.toString();
                        } else if (fieldName.equals("carYear")) {
                            carYear = value.toString();

                        } else if (fieldName.equals("carMake")) {
                            carMake = value.toString();
                        } else if (fieldName.equals("carModel")) {
                            carModel = value.toString();
                        } else if (fieldName.equals("carLicence")) {
                            carLicence = value.toString();

                        } else if (fieldName.equals("carRegistrationTown")) {
                            carRegistrationTown = value.toString();
                        }
                        else if (fieldName.equals("carPhoto")) {
                            carPhoto = value.toString();
                        }
                        else if (fieldName.equals("carMSRP")) {
                            carMSRP = value.toString();
                        }
                        else if (fieldName.equals("carComments")) {
                            carComments = value.toString();
                        }
                        else if (fieldName.equals("carOwner")) {
                            carOwner = value.toString();
                        }

                    }

                    else {

                        String path = getServletContext().getRealPath("/");

                        if (Upload.processFile(path, item)) {

                            response.getWriter().println("File uploaded ");
                            carPhoto = item.getName().toString();
                            Car car = new Car();
                            car.setCarName(request.getParameter("carName"));
                            car.setVIN(request.getParameter("carVIN"));
                            car.setVehicleType(request.getParameter("carType"));
                            car.setYear(request.getParameter("carYear"));
                            car.setMake(request.getParameter("carMake"));
                            car.setModel(request.getParameter("carModel"));
                            car.setPlateNo(request.getParameter("carLicence"));
                            car.setRegTown(request.getParameter("carRegistrationTown"));
                            car.setPhoto(carPhoto);
                            car.setColor(request.getParameter("carColor"));
                            car.setMSRP(request.getParameter("carMSRP"));
                            car.setCarDescription(request.getParameter("carComments"));
                            car.setCarOwner(request.getParameter("carOwner"));

                           // carBean.add(car);
                        } else {
                            response.getWriter().println("File failed");
                        }
                    }
                }
            } catch (FileUploadException e) {
                e.printStackTrace();
            }
        }
    }



}
*/
