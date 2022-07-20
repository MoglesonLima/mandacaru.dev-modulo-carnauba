package mandacaru.dev;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;

/**
 * Servlet Filter implementation class HelloFilter
 */
public class HelloFilter extends HttpFilter implements Filter {

	/**
	 * @see HttpFilter#HttpFilter()
	 */
	public HelloFilter() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		// chain.doFilter(request, response);

		// TODO Auto-generated method stub
		response.getWriter();

		// This will print output on console
		System.out.println("Before filter - Preprocessing before servlet");
		
		//acessando parametro na URL -> first_name
		String firstName = request.getParameter("first_name");

		//Aqui testamos se o first_name passado bate com mogly, aqui poderia ser a busca de user e senha em um DB
		if (firstName.equals("mogly")) {
			// some authentication if required - Caso bata com o que foi passado, permite o acessoa ao servlet
			chain.doFilter(request, response);
		} 
		
		else {
			//caso contrario retorna uma pagina html...Com uma informação qualquer.
			response.setContentType("text/html");
			response.getWriter().append("Não autorizado");
		}

		// This will print output on console //Apenas uma msg no console para mostra que o filter foi usado
		System.out.println("After servlet - Following code will execute after running the servlet - PostProcessing");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
