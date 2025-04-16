package work.com.workshop14.test04.dao;

import java.util.List;

import java.sql.Date;
import work.com.workshop14.test04.model.Product;

public interface ProductDAO {
	String SELECT_SQL = "SELECT PDNO, PDNAME, PDSUBNAME, FACTNO, PDDATE, PDCOST, PDPRICE,PDAMOUNT\r\n"
			+ "FROM PRODUCT\r\n"
			+ "WHERE PDDATE = ?";
	
	// PDNO, PDNAME, PDSUBNAME, FACTNO, PDDATE, PDCOST, PDPRICE, PDAMOUNT, DISCARDED_DATE
	String INSERT_SQL = "INSERT INTO DISCARDED_PRODUCT\r\n"
			+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
	
	String DELETE_SQL = "DELETE FROM PRODUCT\r\n"
			+ "WHERE PDNO=?";
	
	List<Product> selectDiscard(Date d);
	int insertDiscard(List<Product> list);
	int deleteDiscard(List<Product> list);
}

