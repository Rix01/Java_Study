package work.com.workshop02_1;

public class Tv {
	private String name;
	private int price;
	private String description;
	
	public Tv(){
		
	}
	
	public Tv(String name, int price, String description){
		this.name = name;
		this.price = price;
		this.description = description;
	}

	@Override
	public String toString() {
		return String.format("%-10s %-10d %-10s\n", name, price, description);
	}

}
