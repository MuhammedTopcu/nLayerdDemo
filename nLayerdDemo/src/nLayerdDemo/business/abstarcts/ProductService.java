package nLayerdDemo.business.abstarcts;

import java.util.List;

import nLayerdDemo.entities.concretes.Product;

public interface ProductService {
	void add(Product product);
	List<Product> getAll();
}
