package mandacaru.dao;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionFactory {

	private static String url = null;
	private static String user = null;
	private static String password = null;
	
	public static Connection getConnection() {
		try {
			//Verficando se a url está vazia
			if (url == null) {
				//Instancia class para coletar os dados do arquivo db.properties
				Properties prop = new Properties();
				
				//Indicando file
				InputStream inputStream = ConnectionFactory.class.getClassLoader().getResourceAsStream("db.properties");
				
				//Lendo valores
				prop.load(inputStream);
				//Set url
				url = prop.getProperty("url");
				//Set user
				user = prop.getProperty("user");
				//set pass
				password = prop.getProperty("password");
			}
			
			//retornando driver pronto para possibilitar a conexao
			return DriverManager.getConnection(url, user, password);
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
