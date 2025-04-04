package work.com.workshop10.retry.month;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MonthTest {

	public static void main(String[] args) {
		System.out.print("월을 입력하세요(1~12): ");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		boolean isInvalidMonth = IntStream.rangeClosed(1, 12).noneMatch(n->n==m);
		if(isInvalidMonth) {
			System.out.println("입력된 값이 잘못되었습니다.");
		}
		
		System.out.println();
		
		Months ms = new Months();
		List<String> monthInfo = Stream.of(m)
								.map(n->String.format("%02d", n))
								.map(n->List.of(
										"입력받은 월: "+n+"월",
										"짝수/홀수 여부: "+ (Integer.parseInt(n)%2==0?"짝수월":"홀수월"),
										"마지막 일자: "+ms.getDays(Integer.parseInt(n))+"일"))
													 .findFirst()
										             .orElse(Collections.emptyList());		
		monthInfo.forEach(System.out::println);
	}

}
