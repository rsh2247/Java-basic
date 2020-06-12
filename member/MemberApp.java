package member;

import java.util.Scanner;

public class MemberApp {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		MemberService ms = new MemberServiceImpl();
		RpsService rps = new RpsServiceImpl();
		int scene = 0;
		while(true) {
			if(scene==0) {
				System.out.println("메뉴 0:종료 1:회원가입 2:로그인 3:회원목록 확인");
				int a = scanner.nextInt();
				switch(a) {
				case 0 : System.out.println("종료");
				return;
				case 1 : System.out.println("회원가입");
				ms.signup();
				System.out.println("회원가입 완료");
				break;
				case 2 : System.out.println("로그인");
				ms.login();
				scene = 1;
				break;
				case 3 : System.out.println("회원정보 목록 : ");
				ms.memberlist();
				break;
				default : System.out.println("다시 입력하십시오");break;	
				}
			}else if(scene==1) {
				System.out.println("메뉴 0:종료 1:로그아웃 2:멤버페이지 3:RPS게임");
				int a = scanner.nextInt();
				switch(a) {
				case 0 : System.out.println("종료");
				return;
				case 1 : System.out.println("로그아웃 완료.");
				scene = 0; break;
				case 2 : ms.memberpage(); break;
				case 3 : rps.gamestart(); break;
				}
			}else if(scene==2) {
				
			}
			
		}	
	}
}
