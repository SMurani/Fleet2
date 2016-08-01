package fleet.car.action;

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
import javax.servlet.RequestDispatcher;
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

@WebServlet("/carfileUpload")
@MultipartConfig(maxFileSize = 16177215)
public class CarFileUpload extends HttpServlet {

    @EJB
    private CarBeanI carBean;

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {

    };

    protected void doPost(final HttpServletRequest request,
                          final HttpServletResponse response) throws ServletException,
            IOException {

        carfileUpload(request, response);


    }

    public void carfileUpload(HttpServletRequest request,
                           HttpServletResponse response) throws ServletException, IOException {
        boolean isMultipart = ServletFileUpload.isMultipartContent(request);
        if (isMultipart) {
            ServletFileUpload upload = new ServletFileUpload();
            try {

                String carName = null, carVIN = null, carType = null, carYear = null, carMake = null, carModel = null, carLicence = null, carPhoto = null, carRegistrationTown = null;

                String carColor = null,carMSRP=null, carComments=null, carOwner=null;
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

                        }else if (fieldName.equals("carPhoto")) {
                            carPhoto = value.toString();

                        }else if (fieldName.equals("carRegistrationTown")) {
                            carRegistrationTown = value.toString();

                        }else if (fieldName.equals("carColor")) {
                            carColor = value.toString();

                        }else if (fieldName.equals("carMSRP")) {
                            carMSRP = value.toString();

                        }else if (fieldName.equals("carComments")) {
                            carComments = value.toString();

                        } else if (fieldName.equals("carOwner")) {
                            carOwner = value.toString();
                        }

                    }

                    else {

                        String path = getServletContext().getRealPath("/");

                        if (Upload.processFile(path, item)) {

                            response.getWriter().println("File uploaded ");
                            carPhoto = item.getName().toString();
                            Car car = new Car();

                            car.setCarName(carName);
                            car.setVIN(carVIN);
                            car.setVehicleType(carType);
                            car.setYear(carYear);
                            car.setMake(carMake);
                            car.setModel(carModel);
                            car.setPlateNo(carLicence);
                            car.setPhoto(carPhoto);
                            car.setRegTown(carRegistrationTown);
                            car.setColor(carColor);
                            car.setMSRP(carMSRP);
                            car.setCarDescription(carComments);
                            car.setCarOwner(carOwner);


                            carBean.add(car);

                            RequestDispatcher rq = request.getRequestDispatcher("index.jsp");
                            rq.forward(request, response);

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