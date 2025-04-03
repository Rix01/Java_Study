package work.com.workshop10.com.elite;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int flag = 0;
		int input=0;
		
 		while(flag==0) {
			System.out.print("정수를 입력하세요 (5~10): ");
			input = sc.nextInt();
			// 5~10 이외의 정수형이 입력되면 “다시 입력하세요”라고 출력
			if(input<5 || input >10) {
				System.out.println("다시 입력하세요");
				continue;
			}
			flag = 1;
		}
		
		int[] arr = new int[input];
		// 배열 만들기
		for(int i = 0; i<input; i++) {
			arr[i] = i+1; 
		}
		
		System.out.println();
		
		IntStream stream = Arrays.stream(arr);
		System.out.printf("1부터 %d까지의 숫자: \n", input);
		stream.forEach(n -> System.out.printf("%d ", n));
		
		System.out.println("\n짝수 판별: ");
		Arrays.stream(arr).mapToObj(n-> n + (n%2==0 ? " (짝수)":" (홀수)")).forEach(s -> System.out.print(s + " "));
		
	}

}
