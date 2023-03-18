/*
Q.  미리 설정해 놓은 아이디와 비밀번호를 
	이용하여 로그인 기능을 만들어 봅시다.
    로그인 화면에서 사용자로부터 
    아이디와 비밀번호를 입력받고
    아이디와 비밀번호가 일치하면 로그인에 성공 메세지를,
    아이디와 비밀번호가 틀리면 로그인에 실패 메세지를 
    출력하도록 작성해보시오.
    
    //주어진 코드
    String user_id = "hyun";
	String user_pw = "1043";

    ↓ Console ↓
	***********로그인 화면***********
    회원 아이디와 비밀번호를 입력해주세요.
    아이디: hyun
    비밀번호: 0000
    로그인에 실패했습니다.
    아이디와 비밀번호를 다시 확인해주세요.
    ***********로그인 화면***********
    회원 아이디와 비밀번호를 입력해주세요.
    아이디: hyun
    비밀번호: 1043
    로그인에 성공했습니다!
    hyun님 어서오세요:)
    
    Tip) 문자열 비교 방법
	String str1 = "msg";
	String str2 = "msg";
	str1.equals(str2): 같으면 true, 
					   다르면 false
	
	nextLine(): 문자열 한줄 입력받기
*/

package account;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String user_id = "park";
		String user_pw = "1120";
		
		while(true) {
			System.out.println("***********로그인 화면***********");
			System.out.println("회원 아이디와 비밀번호를 입력해주세요.");
			System.out.print("아이디: ");
			String id = sc.nextLine();
			System.out.print("비밀번호: ");
			String pw = sc.nextLine();
			boolean judgeId = user_id.equals(id);
			boolean judgePw = user_pw.equals(pw);
			
			if(judgeId && judgePw) {
				System.out.println("로그인에 성공했습니다!");
				System.out.println(user_id + "님 어서오세요:)");
				break;
			} else {
				System.out.println("로그인에 실패했습니다.");
				System.out.println("아이디와 비밀번호를 다시 확인해주세요.");
			}
		}
	}
}
