package rin.com.hash;

import java.util.Objects;

class Person{
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + "(" + age + "세)";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}
	
	public boolean equals(Object obj) {
		String n = ((Person)obj).name;
		int a = ((Person)obj).age;
		
		if(name.equals(n) && age ==a) {
			return true;
		}
		else {
			return false;
		}
	}
}

public class Practice {

	public static void main(String[] args) {
		Person p1 = new Person("이레오", 5);
		Person p2 = new Person("이레오", 5);
		
		System.out.println(p1.equals(p2));
	}

}
