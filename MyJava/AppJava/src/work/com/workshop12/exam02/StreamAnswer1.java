package work.com.workshop12.exam02;

import java.util.List;

public class StreamAnswer1 {

	public static void main(String[] args) {
		List<String> names = List.of("Tom", "Jerry", "Mike", "James", "Anna", "Sue");
		names.stream().filter(n -> n.length()>3).sorted().forEach(s -> System.out.println(s));
	}

}
