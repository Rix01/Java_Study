package work.com.workshop07;

public class Student extends Human{
	private String number;
	private String major;
	
	public Student() {
		
	}
	
	public Student(String name, int age, int height, int weight, String number, String major) {
		super(name, age, height, weight);
		this.number = number;
		this.major = major;
	}

	@Override
	public String printInformation() {
		return String.format("%-5s %-5d %-5d %-7s %-5s", this.name, this.age, this.height, number, major);
	}
}
