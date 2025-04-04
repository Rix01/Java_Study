package work.com.workshop10.retry.test03;

import java.util.Arrays;

public class Cafe {
	private Coffee[] coffeeList = new Coffee[3];
	private int index=0;
	
	public Cafe() {
		
	}
	public int totalPrice() {
		return Arrays.stream(coffeeList).map(Coffee::getPrice).reduce(0, Integer::sum);
	}
	
	public void setCoffee(Coffee coffee) {
		coffeeList[index] = coffee;
		index++;
	}
	
	public Coffee[] getCoffeeList() {
		return coffeeList;
	}
}
