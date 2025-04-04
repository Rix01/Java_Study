package work.com.workshop02;

import java.util.stream.Stream;

public class Test02 {

	public static void main(String[] args) {
		String str = "Line 1 \n Line 2 \r Line 3 \r\n Line 4";

		Stream<String> lines = str.lines();

		lines.forEach(line -> {
			System.out.println(line);
		});
	}

}
