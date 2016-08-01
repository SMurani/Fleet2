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
@WebServlet("/welcome")
public class WelcomeAction extends HttpServlet {

	@EJB
	private PersonBeanI personBean;


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String username = req.getParameter("username");
		String password = req.getParameter("password");

		/*MessageDigest md;
		try {

			md = MessageDigest.getInstance("SHA-256");
			String text = req.getParameter("password");
			md.update(text.getBytes("UTF-8"));
			byte[] digest = md.digest();
			String sha = String.format("%064x", new java.math.BigInteger(1, digest));*/


			PrintWriter response = resp.getWriter();
			Boolean loginStatus;
			//loginStatus = userBean.login(username, sha, usertype);

			RequestDispatcher rq = req.getRequestDispatcher("index.jsp");

			loginStatus = personBean.login(username, password);
			HttpSession session = req.getSession();
			session.setAttribute("user", username);


			try {


				if (loginStatus == true) {
					rq.forward(req, resp);


				} else {
					//RequestDispatcher err = req.getRequestDispatcher("error.jsp");
					response.println("<p>Invalid login credentials</p>");

				/*response.println("<font color='red'><b>You have entered incorrect password</b></font>");
				RequestDispatcher rd = response.getRequestDispatcher("login.jsp");
				rd.include(request, response);*/

				}


			} catch (Exception e) {
				response.println("<p>An error occured when trying to log in: " + e.getMessage() + "</p>");


			}


		/*} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
*/

	}
}
