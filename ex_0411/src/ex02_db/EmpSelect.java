package ex02_db;

import java.util.List;

public class EmpSelect {
	public static void main(String[] args) {
		
		List<Emp> list = EmpMethod.find("CLERK");

		for (Emp x : list) {
			System.out.printf("사번 : %d, 이름 : %s, 직무 : %s, 급여 : %d \n", x.getEmpno(), x.getEname(), x.getJob(), x.getSal());
		}	
	}
}
