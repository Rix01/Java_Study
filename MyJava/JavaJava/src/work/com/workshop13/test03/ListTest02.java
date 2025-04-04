package work.com.workshop13.test03;

import java.util.ArrayList;

public class ListTest02 {
	public static void main(String[] args) {
		int array[] = {3,4,2,5,2,3,6,7,5,7,9}; 
		ConvertList cl = new ConvertList();
		ArrayList<Integer> answer = cl.convertList(array);
		
		answer.stream().forEach(a-> System.out.println(a));
	}
}
