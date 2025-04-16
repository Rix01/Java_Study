package work.com.workshop14.test01.controller;

import work.com.workshop14.test01.service.ProFacStoService;
import work.com.workshop14.test01.service.ProFacStoServiceImple;
import work.com.workshop14.test01.view.View;

public class Controller {
	private final ProFacStoService pfsService = new ProFacStoServiceImple();
	private final View view = new View();
	
	public void run() {
		view.display(pfsService.find());
	}
}
