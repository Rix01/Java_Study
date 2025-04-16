package work.com.workshop14.test01.view;

import java.util.List;

import work.com.workshop14.test01.model.ProFacStoDTO;

public class View {
	public void display(List<ProFacStoDTO> list) {
		System.out.printf("%-12s %-15s %-9s %-8s %-20s\n", 
				"제품 카테고리", "제품명", "공장명", "판매점명", "판매점재고수량");
		System.out.println("-----------+-------------+-----------------+-------+----------------");
		// PDNAME, PDSUBNAME, FACNAME, STONAME, STAMOUNT
		for(ProFacStoDTO pfs: list) {
			System.out.printf("%-12s %-15s %-15s %-14s %d\n",
					pfs.pdname(),pfs.pdsubname(), pfs.facname(), pfs.stoname(), pfs.stamount());
		}
	}
}
