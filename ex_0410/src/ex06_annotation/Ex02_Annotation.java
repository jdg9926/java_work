package ex06_annotation;

import java.lang.annotation.Annotation;

@TestInfo(name = "홍길동", skills = {"Java", "Spring"})
public class Ex02_Annotation {
	public static void main(String[] args) {
		Ex02_Annotation.class.getAnnotations();
		
		// 리플렉션(Reflection)이란?
		// 클래스, 메서드, 필드, 생성자 등의 정보를 프로그램 실행 중에 동적을 조사하거나 조작할 수 있는 기능
		
		// 리플렉션 API의 핵심 클래스
		// Class<?>			클래스의 메타 정보를 저장할 수 있는 클래스
		// Field			클래스의 필드를 표현
		// Method			클래스의 메서드를 표현
		// Constructor		생성자를 표현
		// Annotation		어노테이션 정보를 표현
		
		// jdbc(Java database connectivity)를 사용해서 연결을 했고
		// oracle <-> DBeaver
		
		// 드라이버 -> 두개를 연결해주는 다리
		// oracle <-> java
		
		// 라이브러리(.jar)
		// 다양한 기능을 쉽게 사용할 수 있도록 미리 만들어진 클래스와 메서드의 집합
		
		// 1. 표준 라이브러리
		// - JDK에 기본적으로 포함되어 있음
		// java.*, javax.*, javafx.*
		
		
		Annotation[] annotations = Ex02_Annotation.class.getAnnotations();
		
		for (Annotation anno : annotations) {
			System.out.println(anno);
		}
		
		TestInfo testInfo = Ex02_Annotation.class.getAnnotation(TestInfo.class);
		System.out.println(testInfo.name());
	}
}

