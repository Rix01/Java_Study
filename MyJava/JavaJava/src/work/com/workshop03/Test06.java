package work.com.workshop03;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int inputNum = sc.nextInt();
		int sum = 0;
		int lastIdx = (100 / inputNum) * inputNum;

		for (int i = 1; i <= 100; i++) {
			if (i == lastIdx) {
				sum+=i;
				System.out.print(i);
				System.out.print(" = " + sum);
				break;
			}

			if (i % inputNum == 0) {
				sum += i;
				System.out.print(i);
				System.out.print("+");
			}

		}
	}
}
