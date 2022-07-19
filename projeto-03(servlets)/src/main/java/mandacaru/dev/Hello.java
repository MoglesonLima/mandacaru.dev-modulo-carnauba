package mandacaru.dev;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Hello
 */
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hello() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    //Aqui são recebidos as requisições get http
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Pengando parametros
		String firstName = request.getParameter ("first_name" );
		String lastName = request.getParameter ("last_name" );
		//Recebendo lista params checkbox(aqui -> getParameterValues -> recebemos array de strings)
		String subjects = String.join(", ", request.getParameterValues("subject"));
		
		//init param
		String initParam = getInitParameter("product");
		
		//context param
		String contextParam = getServletContext().getInitParameter("country");
		
		response.getWriter()
		.append("POST \nFirst Name: ")
		.append(firstName)
		.append("\nLast Name: ")
		.append(lastName)
		.append("\nLista checkbox: ")
		.append(subjects)
		.append("\nAqui temos initParams: "+initParam)
		.append("\nAqui temos contextParams: "+contextParam);
		
		/*
		response.getWriter()
		.append("Served at: GET Hello")
		.append("\nfirst_name: "+ firstName)
		.append("\nlast_name: "+ lastName);
		*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	//Aqui são recebidos as requisições post http
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.getWriter().append("Served at: POST Hello");
	}

}
