package work.com.workshop07.test02;

public class Human {
	protected String name;
	protected int age;
	protected int height;
	protected int weight;
	
	public Human() {
		super();
	}
	
	public Human(String name, int age, int height, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public String printInformation() {
		return String.format("%-5s %-5d %-5d", name, age, height);
	}
	

}
