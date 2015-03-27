package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDAO;

/**
 * Servlet implementation class HighlanderServlet
 */
@WebServlet("/customers")
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		super.service(request, response);
		ClienteDAO dao = new ClienteDAO();
		PrintWriter w = response.getWriter();
		w.println("[{id:1, nome:\"Gleiton\", fone:\"8714\"}]");
		w.close();
//		request.setAttribute("data", "[{id:1, nome:\"Gleiton\", fone:\"8714\"}]");
	}
       
}
