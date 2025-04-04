package work.com.workshop12.date;

import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2025, Calendar.AUGUST, 30, 21, 48, 10);

		Date date = cal.getTime();
		ConvertDate converter = new ConvertDate();

		// Type별 출력
		System.out.println("1) " + converter.convert(date, 1));
		System.out.println("2) " + converter.convert(date, 2));
		System.out.println("3) " + converter.convert(date, 3));
	}

}
