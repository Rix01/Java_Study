package work.com.workshop10.retry.test01;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test01 {
	public static void main(String[] args) {
		int input = 0;
		while (true) {
			System.out.print("정수를 입력하세요 (5~10): ");
			Scanner sc = new Scanner(System.in);
			input = sc.nextInt();
			if (input < 5 || input > 10) {
				System.out.println("다시 입력하세요");
				continue;
			}
			break;
		}

		System.out.printf("\n1부터 %d까지의 숫자:\n", input);
		IntStream.rangeClosed(1, input).forEach(s -> System.out.print(s + " "));

		System.out.println("\n\n짝수 판별:");
		String str1 = IntStream.rangeClosed(1, input).mapToObj(n -> n + (n % 2 == 0 ? " (짝수)" : " (홀수)"))
				.collect(Collectors.joining(" "));
		System.out.println(str1);
		
		System.out.println("\n입력 값:"+input);
		System.out.print("짝수 리스트: ");
		List<Integer> evenList = IntStream.rangeClosed(1, input).boxed().filter(n->n%2==0).toList();
		System.out.println(evenList);
		int maxNum = evenList.stream().max(Integer::compare).orElse(0);
		int minNum = evenList.stream().min(Integer::compare).orElse(0);
		System.out.println("짝수 중 가장 큰 값: "+maxNum);
		System.out.println("짝수 중 가장 작은 값: "+minNum);
		Calc calc = new Calc();
		System.out.println("짝수의 합: "+calc.calculate(input));
	}
}
