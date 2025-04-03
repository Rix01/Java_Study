package work.com.workshop04;

public class Test05 {
	public static void main(String[] args) {
		Student[] students = new Student[] {
				new Student("Kim", 100, 90, 95, 89),
				new Student("Lee", 60, 70, 99, 98),
				new Student("Park", 68, 86, 60, 40)
		};
		
		for(Student s:students) {
			System.out.println(s);
		}
	}
}
