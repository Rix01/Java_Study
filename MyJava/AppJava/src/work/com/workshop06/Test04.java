package work.com.workshop06;

public class Test04 {
	public static void main(String[] args) {
		int eclipse1 = Integer.parseInt(args[0]);
		int eclipse2 = Integer.parseInt(args[1]);

		if (args.length < 2 || args.length > 2) {
			System.out.println("다시 입력하세요");
		}

		if (eclipse1 < 1 || eclipse1 > 5 || eclipse2 < 1 || eclipse2 > 5) {
			System.out.println("숫자를 확인하세요");
		}

		// 2차원 배열 생성
		int[][] arr = new int[eclipse1][eclipse2];

		double sum = 0;
		int cnt = 0;
		double avg = 0;
		for (int i = 0; i < eclipse1; i++) {
			for (int j = 0; j < eclipse2; j++) {
				arr[i][j] = (int) (Math.random() * 5 + 1);
				System.out.printf("%d ", arr[i][j]);
				sum += arr[i][j];
				cnt++;
			}
			System.out.println();
		}
		avg = sum / cnt;

		System.out.println("\nsum=" + sum);
		System.out.println("avg=" + avg);
	}
}
