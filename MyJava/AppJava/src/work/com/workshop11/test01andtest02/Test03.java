package work.com.workshop11.test01andtest02;

import java.util.ArrayList;
import java.util.List;

public class Test03 {

	public static void main(String[] args) {
		Truck truck = new Truck(1000, 100, 5);
		List<String> log = new ArrayList<>();
		
		
		truck.addOil(50);
		log.add(truck.toString());
		
		truck.moving(50);
		log.add(truck.toString());
		
		truck.addWeight(100);
		log.add(truck.toString());
		
		truck.moving(30);
		log.add(truck.toString());
		
		log.stream().forEach(s -> System.out.println(s));
		
		// 주행 거리 목록
		List<Integer> distanceList = List.of(30, 30, 50);
		int cost = distanceList.stream().reduce(0, (total, d) -> total + truck.getCost(d));
		System.out.println("총 요금: "+cost+"원");
	}

}
