package work.com.workshop14.test01.service;

import java.util.List;

import work.com.workshop14.test01.dao.ProFacStoDAO;
import work.com.workshop14.test01.dao.ProFacStoDAOImple;
import work.com.workshop14.test01.model.ProFacStoDTO;

public class ProFacStoServiceImple implements ProFacStoService{
	private final ProFacStoDAO dao = new ProFacStoDAOImple();

	@Override
	public List<ProFacStoDTO> find() {
		return dao.find();
	}
	
}
