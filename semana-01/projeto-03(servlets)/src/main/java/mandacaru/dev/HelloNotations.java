package mandacaru.dev;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class Hello
 */
public class HelloNotations extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HelloNotations() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	// Aqui são recebidos as requisições get http
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Pengando parametros
		String firstName = request.getParameter("first_name");
		String lastName = request.getParameter("last_name");
		// Recebendo lista params checkbox(aqui -> getParameterValues -> recebemos array
		// de strings)
		String subjects = String.join(", ", request.getParameterValues("subject"));

		// init param
		String initParam = getInitParameter("product");

		// context param
		String contextParam = getServletContext().getInitParameter("country");

		// Coletando no obj session dados referentes a sessao
		HttpSession session = request.getSession();

		// Cria a sessao caso ela n exista
		if (session.getAttribute("first_name") == null) {

			session.setAttribute("first_name", firstName);
			response.getWriter().append("Session created !");

		} else {
			response.getWriter().append("Session exist !");
		}

		// Criação do Cookie
		Cookie cookie = new Cookie("aula", "web");
		// Adição do cookie na resposta
		response.addCookie(cookie);

		// Leitura dos cookies
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie aux : cookies) {
				response.getWriter().append("\n" + aux.getName() + " - " + aux.getValue());
			}
		}

		response.getWriter().append("GET \nFirst Name: ").append(firstName).append("\nLast Name: ").append(lastName)
				.append("\nLista checkbox: ").append(subjects)
				.append("\ninitParams NULL POIS ESTAMOS NO SERVLET HelloNotations\nAqui temos initParams: " + initParam)
				.append("\nAqui temos contextParams: " + contextParam);

		/*
		 * response.getWriter() .append("Served at: GET Hello")
		 * .append("\nfirst_name: "+ firstName) .append("\nlast_name: "+ lastName);
		 */
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	// Aqui são recebidos as requisições post http
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		response.getWriter().append("Served at: POST Hello");
	}

}
