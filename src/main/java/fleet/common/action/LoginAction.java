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
public class LoginAction extends HttpServlet {

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
			RequestDispatcher rq1 = req.getRequestDispatcher("client.jsp");
			RequestDispatcher rq2 = req.getRequestDispatcher("error.jsp");
			RequestDispatcher rq3 = req.getRequestDispatcher("wait.jsp");

			loginStatus = personBean.login(username, password);

			HttpSession session = req.getSession();
			session.setAttribute("user", username);
			String uid = personBean.userId(username, password);


			session.setAttribute("uid", uid);

		



			try {
				String uType = personBean.userType(username, password).toString();


				if (loginStatus == true) {

					System.out.println("The user ID is" + uid);
					System.out.println("The user type is " + uType);

					if("1".equals(uType)){

						response.println("index.jsp");
						rq.forward(req, resp);

					}else if ("2".equals(uType)){

						response.println("client.jsp");
						rq1.forward(req, resp);
					}
					else if ("3".equals(uType)){

						response.println("Sorry your account is not yet activated");
						rq3.forward(req, resp);
					}


					//rq.forward(req, resp);


				} else if (loginStatus==false){

					response.println("<p>Invalid login credentials</p>");
					//rq2.forward(req, resp);





				}


			} catch (Exception e) {
				response.println("<p>An error occured when trying to log in: " + e.getMessage() + "</p>");
				rq2.forward(req, resp);




			}


		/*} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
*/

	}
}
