package work.com.workshop07.test01;

public class ArrayTest {
	public static void main(String[] args) {
		int [][] array = { 
				{12, 41, 36, 56, 21}, 
				{82, 10, 12, 61, 45}, 
				{14, 16, 18, 78, 65}, 
				{45, 26, 72, 23, 34} 
				};
		
		double sum =0;
		double avg = 0;
		for(int[] row : array) {
			for(int col : row) {
				sum += col;
			}
		}
		// array.length : 행의 길이(4), array[0].length : 열의 길이(5)
		avg = (double) sum / (array[0].length * array.length);
		
		System.out.printf("합계 : %.1f\n", sum);
		System.out.printf("평균 : %.2f", avg);
	}
}
