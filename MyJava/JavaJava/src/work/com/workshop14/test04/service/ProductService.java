package work.com.workshop14.test04.service;

import java.sql.Date;
import java.util.List;

import work.com.workshop14.test04.model.Product;

public interface ProductService {
	
	List<Product> findDiscard(Date d);
	int insertDiscard(List<Product> list, Date d);
	int deleteDiscard(List<Product> list, Date d);
}
