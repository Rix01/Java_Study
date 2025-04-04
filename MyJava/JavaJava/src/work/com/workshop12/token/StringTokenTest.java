package work.com.workshop12.token;

import java.util.StringTokenizer;

public class StringTokenTest {

	public static void main(String[] args) {
		String str = "4, 2, 3, 6, 7";
		StringTokenizer st = new StringTokenizer(str, ",");
		int sum =0;
		while(st.hasMoreTokens()) {
			String s = st.nextToken().trim();
			int n = Integer.parseInt(s);
			sum += n;
		}
		System.out.println(sum);
	}

}
