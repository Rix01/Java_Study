package work.com.workshop12.string2;

import java.text.DecimalFormat;

public class ConvertString {
	public String convert(int money) {
		DecimalFormat df = new DecimalFormat("###,###");
		
		return df.format(money);
	}
}
