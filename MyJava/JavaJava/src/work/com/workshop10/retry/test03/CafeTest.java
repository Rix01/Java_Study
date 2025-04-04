package work.com.workshop10.retry.test03;

import java.util.stream.Stream;

public class CafeTest {

	public static void main(String[] args) {
		Cafe cafe = new Cafe(); 
		// Coffee 객체를 3개 생성하고, setCoffee()이용하여 Coffee 배열에 넣는다.
		cafe.setCoffee(new Coffee("Americano", 4000));
		cafe.setCoffee(new Coffee("Caffelatte", 5000));
		cafe.setCoffee(new Coffee("Macchiato", 6000));
		
		// Coffee 배열에 있는 객체 정보를 모두 출력 한다 – forEach문을 이용 할 것 
		Coffee[] cl = cafe.getCoffeeList();
		Stream.of(cl).forEach(s->System.out.println(s));
		
		// Coffee 가격의 합을 출력 한다
		System.out.println("\nCoffee 가격의 합: "+cafe.totalPrice());
	}

}
