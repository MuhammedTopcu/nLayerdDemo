package nLayerdDemo;

import nLayerdDemo.business.abstarcts.ProductService;
import nLayerdDemo.business.concretes.ProductManager;
import nLayerdDemo.core.JLoggerManagerAdapter;
import nLayerdDemo.dataAccess.concretes.AbcProductDao;
import nLayerdDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		//ToDo: Spring IoC ile çözülecek.
		ProductService productService = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter());
		
		Product product = new Product (1,2,"Elma",12,50);
		productService.add(product);
		

	}

}
