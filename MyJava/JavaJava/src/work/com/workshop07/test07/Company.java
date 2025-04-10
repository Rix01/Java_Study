package work.com.workshop07.test07;

import java.util.HashMap;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Employee> map = new HashMap<Integer, Employee>(); 
		 
        // 1번의 데이터를 기반으로 객체를 생성하여 HashMap에 넣는다. 
		//  HashMap에 넣을 때 키 값은 각 객체의 Number로 한다.
		map.put(1, new Secretary("Hilery", 1, "secretary", 800));
		map.put(2, new Sales("Clinten", 2, "sales", 1200));
		
        // 모든 객체의 기본 정보를 출력한다(for문을 이용하여 출력한다.)
		System.out.printf("%-10s %-15s %-10s\n", "name", "department", "salary");
		System.out.println("-----------------------------------------");
		for(int key:map.keySet()) {
			Employee e = map.get(key);
			System.out.printf("%-10s %-15s %-10s\n", e.getName(), e.getDepartment(), e.getSalary());
		}
		
		System.out.println("\n인센티브 100 지급\n");
		
        // 모든 객체에 인센티브 100씩 지급한다. 
		for(int key:map.keySet()) {
			Employee e = map.get(key);
			if(e instanceof Bonus b) {
				b.incentive(100);
			}
		}
		
        // 모든 객체의 정보와 세금을 출력한다 (for문을 이용하여 출력한다.)
		System.out.printf("%-10s %-15s %-10s %-10s\n", "name", "department", "salary", "tax");
		System.out.println("------------------------------------------------");
		for(int key:map.keySet()) {
			Employee e = map.get(key);
			System.out.printf("%-10s %-15s %-10s %-10s\n", e.getName(), e.getDepartment(), e.getSalary(), e.tax());
		}
	}

}
