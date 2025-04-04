package work.com.workshop13.test01;

import java.util.HashSet;
import java.util.Scanner;

public class SetTest {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		for(int i = 0; i<str.length(); i++) {
			hs.add(String.valueOf(str.charAt(i)));	// charAt, valueOf()
		}
		System.out.println(hs);
	}
}
