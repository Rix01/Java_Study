package work.com.workshop10.retry.month;

import java.util.Map;

public class Months {
	private static final Map<Integer, Integer> months = Map.ofEntries(
			Map.entry(1, 31), Map.entry(2, 28), Map.entry(3, 31), Map.entry(4, 30), 
			Map.entry(5, 31), Map.entry(6, 30), Map.entry(7, 31), Map.entry(8, 31),
			Map.entry(9, 30), Map.entry(10, 31), Map.entry(11, 30), Map.entry(12, 31));
	
	public int getDays(int month) {
		return months.getOrDefault(month, 0);
	}
	

}
