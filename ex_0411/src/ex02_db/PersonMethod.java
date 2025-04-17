package ex02_db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PersonMethod {
	public static List<Person> find (String name) {
		List<Person> list = new ArrayList<>(); 
		
		Connection conn = null;
		PreparedStatement ptst = null;
		ResultSet rs = null;
		
//		String url = "select * from person where name = ?";
		String url = "select * from person order by idx";
		try {
			conn = DBUtil.getConnection();
			ptst = conn.prepareStatement(url);
//			ptst.setString(1, name);
			rs = ptst.executeQuery();
			
			while (rs.next()) {
				Person p = new Person();
				p.setIdx(rs.getInt("idx"));
				p.setName(rs.getString("name"));
				p.setAge(rs.getInt("age"));
				
				list.add(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
			                     
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (ptst != null) {
					ptst.close();
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
	
	// person 테이블에 데이터를 추가하는 add 메서드
	public static List<Person> add(int idx, String name, int age) {
		List<Person> list = new ArrayList<>();
		Connection conn = null;
		PreparedStatement ptst = null;
		ResultSet rs = null;
		
		String url = "insert into person (idx, name, age) values (?, ?, ?)";
		try {
			conn = DBUtil.getConnection();
			ptst = conn.prepareStatement(url);
			ptst.setInt(1, idx);
			ptst.setString(2, name);
			ptst.setInt(3, age);
			rs = ptst.executeQuery();
			
		} catch (Exception e) {
			e.printStackTrace();
			                     
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (ptst != null) {
					ptst.close();
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
