package work.com.workshop14.test02.service;

import java.util.List;

import work.com.workshop14.test02.dao.ProductDAO;
import work.com.workshop14.test02.dao.ProductDAOImple;
import work.com.workshop14.test02.model.Product;

public class ProductServiceImple implements ProductService{
	private final ProductDAO dao = new ProductDAOImple();

	@Override
	public List<Product> findProduct() {
		return dao.findProduct();
	}

}
