package work.com.workshop07;

import java.util.Scanner;

public class ExTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		try {
			Calc c = new Calc();
			System.out.printf("결과 값: %.1f", (double) c.getSum(input));
		} catch (InvalidException IE) {
			System.out.println("입력 값에 오류가 있습니다.");
		}

	}

}
