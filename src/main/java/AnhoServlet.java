import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AnhoServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		String anho = request.getParameter("anho");
		response.getWriter().println("Este es el anho ingresado: " + '\n'
				+ anho);
	}
}
