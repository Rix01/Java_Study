package work.com.workshop14.test02.dao;

import java.util.List;

import work.com.workshop14.test02.model.Product;

public interface ProductDAO {
	String SELECT_SQL = "SELECT PDSUBNAME, PDCOST, PDPRICE\r\n"
			+ "FROM PRODUCT\r\n"
			+ "WHERE  PDCOST > (SELECT MIN(PDCOST)\r\n"
			+ "				  FROM PRODUCT\r\n"
			+ "				  WHERE PDNAME=\"TV\")\r\n"
			+ "AND PDCOST <(SELECT MAX(PDCOST)\r\n"
			+ "				 FROM PRODUCT\r\n"
			+ "                 WHERE PDNAME=\"CELLPHONE\")";
	
	List<Product> findProduct();
}
