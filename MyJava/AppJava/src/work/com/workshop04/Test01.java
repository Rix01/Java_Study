package work.com.workshop04;

public class Test01 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50}; 
		int sum =0;
		int avg=0;
		
		for(int i :arr) {
			sum += i;
		}
		avg = sum / arr.length;
		
		System.out.println("sum="+sum);
		System.out.println("avg="+avg);
	}
}
