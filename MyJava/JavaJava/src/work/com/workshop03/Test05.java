package work.com.workshop03;

public class Test05 {
	public static void main(String[] args) {
		for(int i =1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				for(int k =1; k<=6; k++) {
					if((i*j*k)%3==0) {
						System.out.printf("%d*%d*%d = %d\n", i, j, k, i*j*k);
					}
				}
			}
		}
	}
}
