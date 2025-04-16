package work.com.workshop14.factory.service;

import java.util.List;

import work.com.workshop14.factory.dao.FactoryDAO;
import work.com.workshop14.factory.dao.FactoryDAOImple;
import work.com.workshop14.factory.model.Factory;

public class FactoryServiceImple implements FactoryService{
	private final FactoryDAO dao = new FactoryDAOImple();
	@Override
	public List<Factory> getFactoryAll() {
		return dao.getFactoryAll();
	}

}
