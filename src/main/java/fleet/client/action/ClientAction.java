package fleet.client.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import org.apache.log4j.Logger;


import fleet.client.bean.ClientBeanI;
import fleet.client.model.Client;
import fleet.common.model.Address;

@SuppressWarnings("serial")
@WebServlet("/client/*")
public class ClientAction extends HttpServlet {

	private Client client;

	@EJB
	private ClientBeanI clientBean;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String[] pathCmp = request.getRequestURI().split("/");
		String path = pathCmp[pathCmp.length - 1];

		if (path.equalsIgnoreCase("load"))
			this.load(request, response);
		else
			this.list(response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Client client = new Client();

		if (request.getParameter("id") != null
				&& !request.getParameter("id").equals("undefined"))
			client.setId(Long.parseLong(request.getParameter("id")));



		client.setName(request.getParameter("clientName"));
		client.setIdNumber(request.getParameter("clientReg"));
		client.setClientDescription(request.getParameter("clientDescription"));

		client.setAddress(new Address());

		client.getAddress().setPhoneNo(request.getParameter("phoneNo"));
		client.getAddress().setEmail(request.getParameter("email"));
		client.getAddress().setTown(request.getParameter("town"));
		client.getAddress().setCountry(request.getParameter("country"));
		client.getAddress().setBox(request.getParameter("box"));


		clientBean.add(client);

	}

	public void doDelete(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Long ClientId = Long.parseLong(request.getParameter("id"));
		clientBean.delete(ClientId);

	}

	private void list(HttpServletResponse response) throws ServletException,
			IOException {
		PrintWriter resp = response.getWriter();
		resp.println(clientBean.listInJson());
	}

	private void load(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter resp = response.getWriter();
		resp.println(clientBean.load(Long.parseLong(request.getParameter("id"))));
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

}
