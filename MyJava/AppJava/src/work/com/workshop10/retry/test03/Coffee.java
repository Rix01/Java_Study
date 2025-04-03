package work.com.workshop10.retry.test03;

public class Coffee {
	private String name;
	private int price;
	
	public Coffee() {
		
	}

	public Coffee(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return String.format("%-10s %10d", name, price);
	}
	
	
}
