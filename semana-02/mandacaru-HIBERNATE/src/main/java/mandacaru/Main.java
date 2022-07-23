package mandacaru;

import java.util.List;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import mandacaru.dao.ProductDAO;
import mandacaru.dao.ProductHibernateDAO;
import mandacaru.dao.ProductJDBCDAO;
import mandacaru.entities.Product;

public class Main {
	public static void main(String[] args) {
		// Testando Hibernate(Aqui indicamos persistence-unit name="mandacaru")
		EntityManagerFactory sessionFactory = Persistence.createEntityManagerFactory("mandacaru");

		// Fechamos a conexão
		sessionFactory.close();
		// Aqui apenas testando
		// Connection con = ConnectionFactory.getConnection();

		ProductDAO productDAO = new ProductHibernateDAO();

		Product product0 = new Product(0, "notebook", 2000.4);
		Product product1 = new Product(0, "geladeira", 2999.99);
		Product product2 = new Product(0, "microndas", 499.90);

		productDAO.save(product0);
		productDAO.save(product1);
		productDAO.save(product2);
		// productDAO.save(product1);

//		// Add
//		productDAO.save(product);
//
//		// Find
		// Product auxProduct = productDAO.find(1);
		// System.out.println(auxProduct);
//
//		// Find by Name
		// Product auxProduct2 = productDAO.findByName("televisao");
		// System.out.println(auxProduct2);
//
//		// Find All
//		List<Product> list = productDAO.findAll();
//		System.out.println(list);
//
//		// Find All by Name
//		list = productDAO.findAllByName("notebook");
//		System.out.println(list);
//
//		// Update
//		Product auxProduct3 = productDAO.find(4);
//		auxProduct3.setName("geladeira");
//    	auxProduct3.setPrice(1999.99);
//		productDAO.save(auxProduct3);
//
//		System.out.println(auxProduct3);

		// Delete
		// productDAO.delete(4);

	}
}
