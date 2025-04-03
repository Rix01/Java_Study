package work.com.workshop06;

public class Test03 {
	public static void main(String[] args) {
		int eclipse = Integer.parseInt(args[0]);
		int sum = 0;
		for (int i = eclipse; i <= 10; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("결과 : " + sum);
	}
}
