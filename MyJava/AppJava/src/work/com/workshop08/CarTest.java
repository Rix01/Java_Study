package work.com.workshop08;

public class CarTest {

	public static void main(String[] args) {
		// Car type의 객체 배열을 2개 만든다
		Car[] cars = new Car[2];
        // 배열에 사용데이터에서 제공된 2개의 Car 객체를 넣는다. 
		cars[0] = new L3("L3", "1500", 50, 25, 0);
		cars[1] = new L5("L5", "2000", 70, 35, 0);
        // 생성된 자동차의 기본 정보 출력
		System.out.printf("%-15s %-15s %-10s %-10s %-10s %-10s\n", "vehicleName", "engineSize", "oilTank", "oilSize", "distance", "temperature");
        System.out.println("------------------------------------------------------------------------------");
		for(Car c : cars) {
        	int temp = 0;
        	if(c instanceof Temp t) {
        		temp= t.getTempGage();
        	}
        	System.out.printf("%-15s %-15s %-10d %-10d %-10d %-10d\n", c.getName(), c.getEngine(), c.getOilTank(), c.getOilSize(), c.getDistance(), temp);
        }
		// 각각의 자동차에 25씩 주유 한다
        for(Car c : cars) {
        	c.setOil(25);
        }
        
        System.out.println("\n25 주유");
        
        // 25씩 주유한 자동차의 정보를 출력 한다
        System.out.printf("%-15s %-15s %-10s %-10s %-10s %-10s\n", "vehicleName", "engineSize", "oilTank", "oilSize", "distance", "temperature");
        System.out.println("------------------------------------------------------------------------------");
        for(Car c : cars) {
        	int temp = 0;
        	if(c instanceof Temp t) {
        		temp= t.getTempGage();
        	}
        	System.out.printf("%-15s %-15s %-10d %-10d %-10d %-10d\n", c.getName(), c.getEngine(), c.getOilTank(), c.getOilSize(), c.getDistance(), temp);
        }
        
        System.out.println("\n80 주행");
        
        // 각각의 자동차에 80씩 주행 한다
        for(Car c : cars) {
        	c.go(80);
        }
        
        // 80씩 주행한 정보를 출력 하며 엔진온도 정보를 출력 한다
        System.out.printf("%-15s %-15s %-10s %-10s %-10s %-10s\n", "vehicleName", "engineSize", "oilTank", "oilSize", "distance", "temperature");
        System.out.println("------------------------------------------------------------------------------");
        for(Car c : cars) {
        	int temp = 0;
        	if(c instanceof Temp t) {
        		temp= t.getTempGage();
        	}
        	System.out.printf("%-15s %-15s %-10d %-10d %-10d %-10d\n", c.getName(), c.getEngine(), c.getOilTank(), c.getOilSize(), c.getDistance(), temp);
        }
	}

}
