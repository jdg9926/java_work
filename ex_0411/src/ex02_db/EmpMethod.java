package ex02_db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmpMethod {
	public static List<Emp> find (String job) {
		List<Emp> list = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String url = "select empno, ename, job, sal from emp where job = ?";
		
//		String url = "select empno, ename, job, sal from emp where job = '"+job+"'";
//		String url2 = "select * from emp";
		
		// Statement 보안위험
		// Statment stmt = conn.createStatement();
		// String sql = "select * from emp where ename = '"+ inputName +"'";
		// ResultSet se = stmt.executeQuery(sql);
		
		// 'OR '1' = '1 같은 값이 들어가게 되면 전체 테이블이 출력되는 SQL Injection 발생 위험
		// select * from emp where ename = ''OR'1'='1'
		// id : 'OR'1'='1
		
		try {
			// Emp 테이블에서 사원번호(empno), 이름(ename), 직종(job), 급여(sal)
			// 을 조회해서 하나의 행을 Emp 객체에 넣은 후 그 객체들을 ArrayList에 담아서 반환하기
			
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(url);
			// sql문 첫번째 ? 자리에 job 으로 채워라
			// 
			pstmt.setString(1, job);
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				Emp e = new Emp();
				e.setEmpno(rs.getInt("empno"));
				e.setEname(rs.getString("ename"));
				e.setJob(rs.getString("job"));
				e.setSal(rs.getInt("sal"));
				
				list.add(e);	
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}			
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
				                      
			}
		}
		
		return list;
	}	
}
