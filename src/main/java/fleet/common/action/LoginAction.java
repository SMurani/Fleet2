package fleet.common.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fleet.person.bean.PersonBeanI;

import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/autostars")
public class LoginAction extends HttpServlet {

    @EJB
    private PersonBeanI personBean;


    public static String hashPassword(String password)
            throws NoSuchAlgorithmException {

        MessageDigest md = MessageDigest.getInstance("MD5");

        md.update(password.getBytes());

        byte[] b = md.digest();

        StringBuffer sb = new StringBuffer();

        for (byte b1 : b) {

            sb.append(Integer.toHexString(b1 & 0xff).toString());

        }

        return sb.toString();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        String hashedPass = "";

        try {

            hashedPass = hashPassword(password);

        } catch (NoSuchAlgorithmException e1) {

            e1.printStackTrace();
        }


        PrintWriter response = resp.getWriter();
        Boolean loginStatus;

        RequestDispatcher rq = req.getRequestDispatcher("index.jsp");
        RequestDispatcher rq1 = req.getRequestDispatcher("client.jsp");
        RequestDispatcher rq2 = req.getRequestDispatcher("error.jsp");
        RequestDispatcher rq3 = req.getRequestDispatcher("wait.jsp");

        loginStatus = personBean.login(username, hashedPass);

        HttpSession session = req.getSession();
        /*if (session != null && !session.isNew()) {*/
            session.setAttribute("user", username);
            String uid = personBean.userId(username, hashedPass);
            session.setAttribute("uid", uid);
            session.setMaxInactiveInterval(30 * 60);


            try {
                String uType = personBean.userType(username, hashedPass).toString();


                if (loginStatus == true) {

                    System.out.println("The user ID is" + uid);
                    System.out.println("The user type is " + uType);

                    if ("1".equals(uType)) {

                        response.println("index.jsp");
                        rq.forward(req, resp);

                    } else if ("2".equals(uType)) {

                        response.println("client.jsp");
                        rq1.forward(req, resp);
                    } else if ("3".equals(uType)) {

                        response.println("Sorry your account is not yet activated");
                        rq3.forward(req, resp);
                    }


                } else if (loginStatus == false) {



                    response.println("<p>Invalid login credentials</p>");


                }


            } catch (Exception e) {
                response.println("<p>An error occured when trying to log in: " + e.getMessage() + "</p>");
                rq2.forward(req, resp);


            }


       /* }else {
            response.println("<p>An error occured when trying to log in </p>");
            rq2.forward(req, resp);
        }*/
    }
}
