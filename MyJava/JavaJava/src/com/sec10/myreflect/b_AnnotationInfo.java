package com.sec10.myreflect;

import java.lang.reflect.Method;

public class b_AnnotationInfo {

    public static void main(String[] args) {
        try {
            Class<?> clazz = b_MyClass.class;
            for (Method method : clazz.getDeclaredMethods()) {	// 메소드 확인
                if (method.isAnnotationPresent(b_MyAnnotation.class)) {	// 해당 어노테이션이 있으면
                    System.out.println("어노테이션이 적용된 메서드: " + method.getName());	// 메소드 이름 출력
                    method.invoke(clazz.getDeclaredConstructor().newInstance()); // 해당 메소드 실행
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
