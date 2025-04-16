package work.com.workshop14.test04.service;

import java.sql.Date;
import java.util.List;

import work.com.workshop14.test04.dao.ProductDAO;
import work.com.workshop14.test04.dao.ProductDAOImple;
import work.com.workshop14.test04.model.Product;

public class ProductServiceImple implements ProductService{
	private final ProductDAO dao = new ProductDAOImple();
	@Override
	public List<Product> findDiscard(Date d) {
		return dao.selectDiscard(d);
	}
	@Override
	public int insertDiscard(List<Product> list, Date d) {
		return dao.insertDiscard(dao.selectDiscard(d));
	}
	@Override
	public int deleteDiscard(List<Product> list, Date d) {
		return dao.deleteDiscard(dao.selectDiscard(d));
	}

}
