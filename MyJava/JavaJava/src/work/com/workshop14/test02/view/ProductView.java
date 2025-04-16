package work.com.workshop14.test02.view;

import java.util.List;

import work.com.workshop14.test02.model.Product;

public class ProductView {
	public void display(List<Product> list) {
		System.out.printf("%-11s %-8s %-10s\n", "제품명", "제품원가", "제품가격");
		System.out.println("-----------+---------+------------");
		for(Product p:list) {
			System.out.printf("%-12s %-10d %-10d\n", p.pdsubname(), p.pdcost(), p.pdprice());
		}
	}
}
