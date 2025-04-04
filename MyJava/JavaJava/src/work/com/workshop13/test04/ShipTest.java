package work.com.workshop13.test04;

import java.util.ArrayList;

public class ShipTest {
	public static void main(String[] args) {
		// ArrayList를 만들어 각각의 Boat 객체와 Cruise객체를 생성하여 넣는다
		ArrayList<Ship> ships = new ArrayList<>();
		ships.add(new Boat("Boat01", 500));
		ships.add(new Cruise("Cruise01", 1000));
		
		// 생성된 객체의 정보 출력 - for문 사용
		System.out.printf("  %-15s %-15s\n", "shipName", "fuelTank");
		System.out.println("-----------------------------");
		for(Ship s:ships) {
			System.out.printf("  %-15s %-15d\n", s.getShipName(), s.getFuelTank());
		}
		
		System.out.println("\n10 운항");
		System.out.printf("  %-15s %-15s\n", "shipName", "fuelTank");
		System.out.println("-----------------------------");
		// 각각의 Ship 객체에 10 운항 후 객체 정보 출력 - for 문 사용
		for(Ship s:ships) {
			s.sail(10);
			System.out.printf("  %-15s %-15d\n", s.getShipName(), s.getFuelTank());
		}
		
		System.out.println("\n50 주유");
		System.out.printf("  %-15s %-15s\n", "shipName", "fuelTank");
		System.out.println("-----------------------------");
		// 각각의 Ship 객체에 50 주유 후 객체 정보 출력 – for문 사용
		for(Ship s:ships) {
			s.refuel(50);
			System.out.printf("  %-15s %-15d\n", s.getShipName(), s.getFuelTank());
		}
	}
}
