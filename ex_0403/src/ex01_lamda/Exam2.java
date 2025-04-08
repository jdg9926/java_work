package ex01_lamda;

import java.util.ArrayList;
import java.util.function.BiPredicate;
import java.util.function.Function;

class Greeting {
	private String name;
	
	public Greeting(String name) {
		this.name = name;
	}
	
	public String sayHello() {
		return "hello, " + name;
	}
}

class Student {
	private int score;
	
	public Student(int score) {
		this.score = score;
	}
	
	public boolean isPassed(int cutLine) {
		return score >= cutLine;
	}
}

public class Exam2 {
	public static void main(String[] args) {
//		Function<Greeting, String> test = Greeting::sayHello;

		Function<Greeting, String> grt = t -> t.sayHello();
		Greeting gt = new Greeting("홍길동");
		System.out.println(grt.apply(gt));
		
		// 학생이 특정 점수 이상인지 확인하는 메서드를 메서드 참조로 구하기
		BiPredicate<Student, Integer> passChecker = Student::isPassed;
		
		System.out.println("-------------------");
		
		Function<Student, Boolean> st = t -> t.isPassed(70);
		
		Student stu = new Student(90);
		
		System.out.println(passChecker.test(stu, 70));
		System.out.println("-------------------");
		System.out.println(st.apply(stu));
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		// removeIf()
		// 조건에 맞으면 삭제해라
		list.removeIf(x -> x % 2 == 0);
		System.out.println(list);
	}
}

