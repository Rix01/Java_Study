package work.com.workshop14.test04.view;

import java.util.List;

import work.com.workshop14.test04.model.Product;

public class ProductView {
	public void insertMessage(int cnt) {
		System.out.println("=== 삽입 ===");
		if(cnt==0) {
			System.out.println("해당 날짜에 해당하는 제품이 없습니다.");
		}
		else {
			System.out.printf("%d개의 데이터가 정상적으로 INSERT 되었습니다.\n", cnt);
		}
	}
	
	public void deleteMessage(int cnt) {
		System.out.println("=== 삭제 ===");
		if(cnt==0) {
			System.out.println("해당 날짜에 해당하는 제품이 없습니다.");
		}
		else {
			System.out.printf("%d개의 데이터가 정상적으로 Delete 되었습니다.\n", cnt);
		}
	}
}
