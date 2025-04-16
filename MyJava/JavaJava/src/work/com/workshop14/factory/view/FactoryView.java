package work.com.workshop14.factory.view;

import java.util.List;

import work.com.workshop14.factory.model.Factory;

public class FactoryView {
	public void displayFactory(List<Factory> list) {
		System.out.printf("%-10s %-18s %-10s\n", "공장번호", "공장명", "공장위치");
		System.out.println("--------------------------------------------");
		for(Factory f:list) {
			// FACTNO, FACNAME, FACLOC
			System.out.printf("%-10s %-18s %-10s\n", f.factno(), f.facname(), f.facloc());
		}
	}
}
