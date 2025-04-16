package work.com.workshop14.test04.controller;

import java.sql.Date;
import java.util.Scanner;

import work.com.workshop14.test04.view.ProductView;
import work.com.workshop14.test04.service.ProductService;
import work.com.workshop14.test04.service.ProductServiceImple;

// view -> controller -> service
public class ProductController {
	private final ProductView view = new ProductView();
	private final ProductService ps = new ProductServiceImple();
	private final Scanner sc = new Scanner(System.in);
	
	public void run() {
		System.out.print("폐기할 날짜 입력: ");
		String date = sc.nextLine();
		Date d = Date.valueOf(date);
		view.insertMessage(ps.insertDiscard(ps.findDiscard(d), d));
		view.deleteMessage(ps.deleteDiscard(ps.findDiscard(d), d));
	}
}
