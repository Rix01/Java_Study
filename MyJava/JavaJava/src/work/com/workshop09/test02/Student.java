package work.com.workshop09.test02;

public class Student {
	private String name;
	private int age;
	private int height;
	private int weight;

	public Student() {
		super();
	}

	public Student(String name, int age, int height, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public String studentInfo() {
		return String.format("%-5s %-5d %-5d %-5d", name, age, height, weight);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}
