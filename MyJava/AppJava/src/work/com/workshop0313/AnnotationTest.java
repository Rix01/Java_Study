package work.com.workshop0313;

import java.lang.reflect.*;

public class AnnotationTest {
	public static void main(String[] args) {
		Class<MyClass> clazz = MyClass.class;
		if (clazz.isAnnotationPresent(MyAnnotation.class)) {
			MyAnnotation annotation = clazz.getAnnotation(MyAnnotation.class);
			System.out.println("애노테이션 값: " + annotation.value());
		}
	}
}
