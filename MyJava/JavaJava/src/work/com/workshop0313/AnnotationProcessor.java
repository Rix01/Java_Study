package work.com.workshop0313;

import java.lang.reflect.Method;

public class AnnotationProcessor {
	public static void main(String[] args) throws Exception {
		TestClass obj = new TestClass();
		for(Method method: obj.getClass().getDeclaredMethods()) {
			if(method.isAnnotationPresent(PrintMessage.class)) {
				method.invoke(obj);
			}
		}
	}
}
