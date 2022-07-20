package ufc.mandacaru;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.web.IWebExchange;
import org.thymeleaf.web.servlet.JakartaServletWebApplication;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ufc.mandacaru.config.ThymeleafConfig;
import ufc.mandacaru.model.Address;
import ufc.mandacaru.model.Person;

/**
 * Servlet implementation class Hello
 */
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public Hello() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}
	//Aqui é onde acontece o processamento do Thymeleaf 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		TemplateEngine templateEngine = 
				(TemplateEngine) getServletContext()
				.getAttribute(ThymeleafConfig.TEMPLATE_ENGINE_ATTR);
		
		IWebExchange webExchange = 
				JakartaServletWebApplication.buildApplication(getServletContext())
				.buildExchange(request, response);
		
		WebContext context = new WebContext(webExchange);
		
		//Indicando variáveis
		context.setVariable("name", "Mogleson Lima");
		
		//Trabalhando com new variables
		Address address01 = new Address("Rua 01", "100");
		Address address02 = new Address("Rua 02", "200");
		Address address03 = new Address("Rua 03", "300");
		Address address04 = new Address("Rua 04", "400");
		
		//Criando o obj. person01 que será usado para preencher campos no template hello.html.
		Person person01 = new Person(1, "Mogleson Lima", address01);
//		Person person02 = new Person(1, "Mogleson Lima", address02);
		//Removendo a rua de person 01
		Person person02 = new Person(2, "Lucas Silva", address02);

		context.setVariable("person", person01);
		context.setVariable("person01", person01);
		context.setVariable("person02", person02);
		
		List<Person> people = new ArrayList<Person>();
		people.add(person01);
		people.add(person02);
		//people.add(person3);
		context.setVariable("people", people);
		
		
				
		//Aqui indicamos o template criado em WEB-INF
		templateEngine.process("hello", context, response.getWriter());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
