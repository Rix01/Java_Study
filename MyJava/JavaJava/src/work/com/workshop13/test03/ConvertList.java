package work.com.workshop13.test03;

import java.util.ArrayList;

public class ConvertList {
	public ArrayList<Integer> convertList(int[] array){
		ArrayList<Integer> answer = new ArrayList<>();
		for(int i=array.length-1; i>=0; i-- ) {
			answer.add(array[i]);
		}
		return answer;
	}
}
