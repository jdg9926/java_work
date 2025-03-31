package ex06_List;

import java.util.ArrayList;
import java.util.Scanner;

class UserInfo {
	private String userId;
	private String password;

	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
};

public class Exam03 {
	public static void main(String[] args) {
		UserInfo info = new UserInfo();
		ArrayList<String> arr = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("아이디 생성 or Exit : ");
			String str = sc.next();
			if (str.equals("Exit")) {
				break;
			} else {
				
				System.out.print("아이디 생성 : ");
				info.setUserId(sc.next());
				
				System.out.print("패스워드 입력 : ");
				info.setPassword(sc.next());
				
                arr.add("아이디: " + info.getUserId() + ", 패스워드: " + info.getPassword());
			}			
		}

        System.out.println("\n입력된 아이디와 패스워드 목록:");
        for (String data : arr) {
            System.out.println(data);
        }
	}
}

//package ex06_List;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//class UserInfo {
//	private String userId;
//	private String password;
//
//	public String getUserId() {
//		return userId;
//	}
//	
//	public void setUserId(String userId) {
//		this.userId = userId;
//	}
//	
//	public String getPassword() {
//		return password;
//	}
//	
//	public void setPassword(String password) {
//		this.password = password;
//	}
//};
//
//public class Exam03 {
//	public static void main(String[] args) {
//		UserInfo info = new UserInfo();
//		ArrayList<UserInfo> arr = new ArrayList<>();
//		
//		Scanner sc = new Scanner(System.in);
//		while (true) {
//			System.out.print("아이디 생성 or Exit : ");
//			String str = sc.next();
//			if (str.equals("Exit")) {
//				break;
//			} else {
//				System.out.print("아이디 생성 : ");
//				info.setUserId(sc.next());
//				
//				System.out.print("패스워드 입력 : ");
//				info.setPassword(sc.next());
//				
////                arr.add("아이디: " + info.getUserId() + ", 패스워드: " + info.getPassword());
//                arr.add(info);
//			}			
//		}
//
//        System.out.println("\n입력된 아이디와 패스워드 목록:");
//        
//        for (UserInfo data : arr) {
//            System.out.println(data.getUserId());
//            System.out.println(data.getPassword());
//            System.out.println("--------------");
//        }
//	}
//}
