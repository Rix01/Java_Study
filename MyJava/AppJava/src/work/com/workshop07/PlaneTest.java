package work.com.workshop07;

public class PlaneTest {
	public static void main(String[] args) {
		// Airplane과 Cargoplane 객체 생성
		Plane p1 = new Airplane("L747", 1000);
		Plane p2 = new Cargoplane("C40", 1000);
		 
        // 생성된 객체의 정보 출력
		System.out.printf("%-10s %-10s\n", "Plane", "fuelSize");
		System.out.println("----------------------");
		System.out.printf("%-10s %-10s\n", p1.getPlaneName(), p1.getFuelSize());
		System.out.printf("%-10s %-10s\n", p2.getPlaneName(), p2.getFuelSize());
 
        // Airplane과 Cargoplane 객체에 100씩 운항  
        p1.flight(100);
        p2.flight(100);
        
        System.out.println("\n100 운항");
		
        // 운항 후 객체의 변경된 정보 출력 
        System.out.printf("%-10s %-10s\n", "Plane", "fuelSize");
		System.out.println("----------------------");
		System.out.printf("%-10s %-10s\n", p1.getPlaneName(), p1.getFuelSize());
		System.out.printf("%-10s %-10s\n", p2.getPlaneName(), p2.getFuelSize());
		
		
        // Airplane과 Cargoplane 객체에 200씩 주유
		p1.refuel(200);
		p2.refuel(200);
		
		System.out.println("\n200 주유");
      
        // 주유 후 객체의 변경된 정보 출력
		System.out.printf("%-10s %-10s\n", "Plane", "fuelSize");
		System.out.println("----------------------");
		System.out.printf("%-10s %-10s\n", p1.getPlaneName(), p1.getFuelSize());
		System.out.printf("%-10s %-10s\n", p2.getPlaneName(), p2.getFuelSize());
		
	}
}
