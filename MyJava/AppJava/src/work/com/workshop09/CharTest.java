package work.com.workshop09;

import java.util.Scanner;

public class CharTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		input = input.toUpperCase(); // 대문자로 만들기
		char[] arrInput = input.toCharArray(); // 입력 문자열을 char array로 변환.

		for (int i = input.length(); i > 0; i--) {
			System.out.print(arrInput[i - 1]);
		}
	}

}
