package work.com.workshop14.test02.controller;

import work.com.workshop14.test02.service.ProductService;
import work.com.workshop14.test02.service.ProductServiceImple;
import work.com.workshop14.test02.view.ProductView;

// view -> controller -> service
public class ProductController {
	private final ProductService ps = new ProductServiceImple();
	private final ProductView view = new ProductView();
	
	public void run() {
		view.display(ps.findProduct());
	}
}
