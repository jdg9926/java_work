package ex01_Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student {
	private String name;
	private int Score;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return Score;
	}

	public void setScore(int Score) {
		this.Score = Score;
	}

	public Student (String name, int Score) {
		this.name = name;
		this.Score = Score;
	}
	
	@Override
	public String toString() {
		return String.format("점수가 가장 높은 학생의 이름은 : %s 이고 성적은 % d 이다.", name, Score);
	}
}

public class Exam1 {
	public static void main(String[] args) {
		// 짝수만 출력하기
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		numbers.stream().filter(t -> t % 2 == 0).forEach(System.out::println);
		
		// kim으로 시작하는 이름만 골라서 대문자로 변환하고 알파벳순으로 정렬하여 출력하는 코드 작성하기
		List<String> names = Arrays.asList("kim chulsoo", "lee younghee", "park minsue", "kim younghee", "choi gildong");
		names.stream().sorted().filter(t -> t.startsWith("kim")).map(t -> t.toUpperCase()).forEach(System.out::println);
		
		// 짝수의 제곱값만 모아서 리스트로 반환하기
		List<String> num = Arrays.asList("1", "2", "3", "4", "5", "6");
		List IntNum = num.stream().map(t -> Math.pow(Integer.parseInt(t), 2)).filter(t -> t % 2 == 0).collect(Collectors.toList());
		System.out.println(IntNum);
		
		// 점수가 가장 높은 학생의 이름 출력하기
	    List<Student> students = Arrays.asList( new Student("Alice", 85)
	    									  , new Student("Bob", 92)
	    									  , new Student("Charlie", 78));
	    
	    Stream<Student> stream = students.stream();
	    Optional<Student> result = Optional.ofNullable(stream.max(Comparator.comparing(Student::getScore)).get());
	    System.out.println(result.get().getName());
	    		
	    
	    Stream result1 = students.stream().sorted(Comparator.comparing(Student::getScore)).limit(students.size());
	    
	    
	    
	}
}
