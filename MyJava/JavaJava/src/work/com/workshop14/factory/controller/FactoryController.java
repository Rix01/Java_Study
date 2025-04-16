package work.com.workshop14.factory.controller;

import work.com.workshop14.factory.service.FactoryService;
import work.com.workshop14.factory.service.FactoryServiceImple;
import work.com.workshop14.factory.view.FactoryView;

// view -> controller -> service
public class FactoryController {
	private final FactoryService fs = new FactoryServiceImple();
	private final FactoryView fview = new FactoryView();
	
	public void run() {
		fview.displayFactory(fs.getFactoryAll());
	}
}
