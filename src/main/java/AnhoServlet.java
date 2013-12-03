import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AnhoServlet extends HttpServlet {
	Anho anho = new Anho();
	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		String year = request.getParameter("anho");
		response.getWriter().println("Este es el anho ingresado: " + '\n'
				+ anho);
		anho.setAnho(Integer.parseInt(year));
		if(anho.esAnho())
			if(anho.esBisiesto())
				response.getWriter().println("El anho es bisiesto");
			else
				response.getWriter().println("El anho no es bisiesto");
		else
			response.getWriter().println("El anho no es valido");
	}
}
