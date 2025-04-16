package work.com.workshop14.factory.dao;

import java.util.List;

import work.com.workshop14.factory.model.Factory;

public interface FactoryDAO {
	String SELECT_SQL = "SELECT FACTNO, FACNAME, FACLOC\r\n"
			+ "FROM FACTORY";
	
	List<Factory> getFactoryAll();
}
