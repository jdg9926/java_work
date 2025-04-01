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
		ArrayList<UserInfo> arr = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("아이디 생성 or Exit : ");
			String str = sc.next();
			if (str.equals("Exit")) {
				break;
			} else {
				UserInfo info = new UserInfo();
				System.out.print("아이디 생성 : ");
				String strSc = sc.next(); 
				
                boolean check = false;
                for (UserInfo data : arr) {
                    if (data.getUserId().equals(strSc)) {
                    	check = true;
                        break;
                    }
                }
                if (check) {
                    System.out.println("이미 사용 중인 아이디입니다. 다른 아이디를 입력해주세요.");
                } else {
                    info.setUserId(strSc);
                    System.out.print("패스워드 입력 : ");
                    info.setPassword(sc.next());

                    arr.add(info);
                    System.out.println("아이디가 생성되었습니다.");
                }
			}			
		}

        System.out.println("입력된 아이디와 패스워드 목록");
        for (UserInfo data : arr) {
            System.out.println("아이디 : " + data.getUserId() + " : : " + "패스워드 : " +data.getPassword());
        }
	}
}