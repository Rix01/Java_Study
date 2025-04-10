package work.com.workshop07.test05;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<>();
		double sum = 0.0;

		// HashMap에 1~100까지의 정수를 랜덤하게 10개 저장한다.
		for (int i = 1; i <= 10; i++) {
			// 랜덤 정수
			int num = (int) (Math.random() * 100 + 1);
			map.put(i, num);
		}

		// HashMap 데이터를 화면에 출력한다.
		for (int i = 1; i <= 10; i++) {
			int value = map.get(i);
			System.out.print(value + " ");
			// HashMap 데이터의 합계를 계산한다.
			sum += value;
		}

		// 합계와 평균을 화면에 출력한다.
		System.out.printf("\n합계 : %.2f", (double)sum);
		System.out.printf("\n평균 : %.2f", sum/10.0);
	}

}
