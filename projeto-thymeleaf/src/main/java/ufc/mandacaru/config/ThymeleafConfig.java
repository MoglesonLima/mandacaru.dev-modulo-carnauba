package ufc.mandacaru.config;

import org.thymeleaf.ITemplateEngine;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.WebApplicationTemplateResolver;
import org.thymeleaf.web.IWebApplication;
import org.thymeleaf.web.servlet.JakartaServletWebApplication;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;


@WebListener  //Escutador de eventos
public class ThymeleafConfig implements ServletContextListener{
	
	 public static final String TEMPLATE_ENGINE_ATTR = "TemplateEngineInstance";
	 
	    private ITemplateEngine templateEngine;
	 
	    private JakartaServletWebApplication application;
	 
	    @Override	//Inicialização do contexto(oq de fato irá inicializar toda a execução)
	    public void contextInitialized(ServletContextEvent sce) {
	        this.application = JakartaServletWebApplication.buildApplication(sce.getServletContext());
	        this.templateEngine = templateEngine(this.application);
	 
	        sce.getServletContext().setAttribute(TEMPLATE_ENGINE_ATTR, templateEngine);
	    }
	    
	    
	    //Parte Enginer(Aqui onde acontece a magica, onde de fato é gerado o template com base nas
	    //informações indicadas no resolver)
	    private ITemplateEngine templateEngine(IWebApplication application) {
	        //instancia templateEngine
	    	TemplateEngine templateEngine = new TemplateEngine();
	        
	        WebApplicationTemplateResolver templateResolver = templateResolver(application);
	        templateEngine.setTemplateResolver(templateResolver);
	 
	        return templateEngine;
	    }
	    
	    
	    //Resolver pega os templates disponíveis na aplicação no caminho --> /WEB-INF/templates/
	    private WebApplicationTemplateResolver templateResolver(IWebApplication application) {
	        WebApplicationTemplateResolver templateResolver = new WebApplicationTemplateResolver(application);
	 
	        //Aqui é indicado o modo/tipo do template(como o Thymeleaf entende my files)
	        templateResolver.setTemplateMode(TemplateMode.HTML);
	        
	        //Caminho onde estão os templates
	        templateResolver.setPrefix("/WEB-INF/templates/");
	        
	        //Indicando os arquivos que contem meus templates
	        templateResolver.setSuffix(".html");
	 
	        return templateResolver;
	    }
	 
	    @Override
	    public void contextDestroyed(ServletContextEvent sce) {
	        
	    }

}
