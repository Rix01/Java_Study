package work.com.workshop0313;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(ElementType.FIELD)
public @interface MaxValue {
	int value();	// 최대값 지정. 이거 넘으면 오류 메시지 출력
}
