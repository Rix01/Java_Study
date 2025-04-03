package work.com.workshop04;

public class Test03 {
	public static void main(String[] args) {
		int[][] arr2 = { { 5, 5, 5, 5, 5 }, 
					{ 10, 10, 10, 10, 10 }, 
					{ 20, 20, 20, 20, 20 }, 
					{ 30, 30, 30, 30, 30 } };
		
		int total = 0;
		double average = 0;
		
		for(int[] i : arr2) {
			for(int j: i) {
				total += j;
			}
		}
		average = (double)total/(arr2[0].length*arr2.length);
		
		System.out.println("total="+total);
		System.out.println("average="+average);
	}

}
