package work.com.workshop02;

public class Test03 {

	public static void main(String[] args) {
		String text = "Java\n21\nRocks"; 
		text.lines().forEach(System.out::println);
	}

}
