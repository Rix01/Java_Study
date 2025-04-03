package work.com.workshop11.test01andtest02;

public class VehicleTest {

	public static void main(String[] args) {
		Truck car = new Truck(1000, 100, 5); 
		// 초기 트럭의 정보를 출력한다.
		System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "최대적재중량" ,"오일탱크크기" ,"잔여오일량" ,"현재적재중량" ,"연비");
		System.out.println("===========================================================");
		System.out.println(car);
		// 50L 주유 후 트럭의 정보를 출력한다.
		System.out.println("\n50L 주유 후");
		car.addOil(50);
		System.out.println(car);
		
		// 50Km 주행 후 트럭의 정보를 출력한다.
		System.out.println("\n50Km 주행 후");
		car.moving(50);
		System.out.println(car);
		
		// 100Kg을 적재한 후 트럭의 정보를 출력한다.
		System.out.println("\n100Kg을 적재한 후");
		car.addWeight(100);
		System.out.println(car);
		
		// 30Km 주행 후 트럭의 정보를 출력한다.
		System.out.println("\n30Km 주행 후");
		car.moving(30);
		System.out.println(car);
		
		// 100Kg을 탑재하고 30Km를 주행하면 요금이 얼마인지 출력한다.
		System.out.println("요금 : "+car.getCost(30));

	}

}
