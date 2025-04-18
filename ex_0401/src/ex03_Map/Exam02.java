package ex03_Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

class Student {
	private String name;		// 이름
	private double totalScore;	// 총점
	private int subjectCount;	// 과목 수
	
//	public Student (String name) {
//		this.name = name;
//	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(double totalScore) {
		this.totalScore = totalScore;
	}
	public int getSubjectCount() {
		return subjectCount;
	}
	public void setSubjectCount(int subjectCount) {
		this.subjectCount = subjectCount;
	}
	
	public int add_Socre (int score) {
		totalScore += score;
		subjectCount++;
		return score;
	}
	
   public double get_Average() {
	   if(subjectCount == 0) {
		   return 0;
	   } else {
		   return (double) totalScore / subjectCount;
	   }
   }

	
	public String get_Name () {
		String get_Name = name;
		return get_Name;
	}
};

public class Exam02 {
	public static void main(String[] args) {
		// 주어진 학생 성적 데이터를 기반으로, 각 학생의 평균 점수를 계산 한 후
		// 가장 평균 점수가 높은 학생의 이름과 평균 점수를 출력하는 프로그램 작성
		
		// 각 데이터는 " 이름 : 과목 : 점수 " 형식의 문자열로 주어짐
		// 예 "Alice:Math:85"
		
		List<String> scores = Arrays.asList("Alice:Math:85", "Alice:English:78",
			    							"Bob:Math:90", "Bob:English:92",  "Bob:Science:88",
			    							"Charlie:Math:70", "Charlie:English:60");

		HashMap<String, Student> map = new HashMap<>();
		
		for (String record : scores) {
			String[] parts = record.split(":");
			String name = parts[0];
			int score = Integer.parseInt(parts[2]);

			Student st = new Student();
			map.putIfAbsent(name, st);
			map.get(name).add_Socre(score);
		}
		
		String topStudent = null;
		double highAvg = 0;
		
		for (Entry<String, Student> entry : map.entrySet()) {
			double avg = entry.getValue().get_Average();
			if (avg > highAvg) {
				highAvg = avg;
				topStudent = entry.getKey();
			}
		}
		
		if (topStudent != null) {
			System.out.println(topStudent + " => " + highAvg);
		}
	}
}