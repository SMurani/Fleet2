package fleet.dispatch.action;

import fleet.car.bean.CarBeanI;
import fleet.car.model.Car;
import fleet.dispatch.bean.DispatchBeanI;
import fleet.dispatch.model.Dispatch;
import org.apache.commons.fileupload.FileItemIterator;
import org.apache.commons.fileupload.FileItemStream;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

@WebServlet("/fileUpload")
@MultipartConfig(maxFileSize = 16177215)
public class FileUpload extends HttpServlet {

    @EJB
    private DispatchBeanI dispatchBean;

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

                String dipatchVehicle = null, dispatchClient = null, dispatchReturnDate = null, dispatchDoc = null, dispatchCommet = null;


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
                        if (fieldName.equals("dipatchVehicle")) {
                            dipatchVehicle = value.toString();

                        } else if (fieldName.equals("dispatchClient")) {
                            dispatchClient = value.toString();
                        }

                        else if (fieldName.equals("dispatchReturnDate")) {
                            dispatchReturnDate = value.toString();
                        } else if (fieldName.equals("dispatchDoc")) {
                            dispatchDoc = value.toString();

                        } else if (fieldName.equals("dispatchCommet")) {
                            dispatchCommet = value.toString();
                        }

                    }

                    else {

                        String path = getServletContext().getRealPath("/");

                        if (Upload.processFile(path, item)) {

                            response.getWriter().println("File uploaded ");
                            dispatchDoc = item.getName().toString();
                            Dispatch dispatch = new Dispatch();

                            dispatch.setVehicle_id(Long.parseLong(dipatchVehicle));
                            dispatch.setClient_id(Long.parseLong(dispatchClient));
                            dispatch.setDataReturn(dispatchReturnDate);
                            dispatch.setAgreement(dispatchDoc);

                            dispatch.setComments(dispatchCommet);


                            dispatchBean.add(dispatch);



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