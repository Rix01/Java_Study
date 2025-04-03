package work.com.workshop0313;

import java.lang.reflect.Field;

public class MaxValueProcessor {

	public static void main(String[] args) throws Exception {
		NumberClass obj = new NumberClass(200);	// 100을 초과하므로 오류 메시지 출력되어야 함.
		for(Field field : obj.getClass().getDeclaredFields()) {
			MaxValue annotation = field.getAnnotation(MaxValue.class);
			int maxValue = annotation.value();
			int fieldValue = field.getInt(obj);
			
			if(fieldValue > maxValue) {
				System.out.println(field.getName() + " 값이 최대값을 초과했습니다! (최대: " + maxValue + ")");
			}
		}

	}

}
