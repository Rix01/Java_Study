package work.com.workshop14.test01.dao;

import java.util.List;

import work.com.workshop14.test01.model.ProFacStoDTO;

public interface ProFacStoDAO {
	String SELECT_SQL = "SELECT PDNAME, PDSUBNAME, FACNAME, STONAME, IFNULL(STAMOUNT, 0) AS STAMOUNT\r\n"
			+ "FROM PRODUCT\r\n"
			+ "JOIN FACTORY USING(FACTNO)\r\n"
			+ "JOIN STORE USING(PDNO)\r\n"
			+ "WHERE FACLOC LIKE \"%SEOUL%\" AND IFNULL(STAMOUNT, 0) = 0";
	
	List<ProFacStoDTO> find();
}
