package mandacaru.dao;

import java.util.List;

import mandacaru.entities.Product;

public interface ProductDAO {
	
	public void save(Product entProduct);
	
	public void delete(int id);
	
	public Product findById(int id);
	
	public List<Product> findAll();
	
	public Product findByName(String str);
	
	public List<Product> findByAllName(String str);
	
}
