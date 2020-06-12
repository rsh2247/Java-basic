package member;

import java.util.Random;
import java.util.Scanner;

public class RpsServiceImpl implements RpsService {
	
	private Member user;
	private Random random;
	
	public RpsServiceImpl() {
		user = new Member();
		random = new Random();
	}

	@Override
	public void gamestart() {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("게임을 시작하겠습니다.");
			System.out.println("가위, 바위, 보 중 하나를 입력해주세요.");
			boolean stop=true;
			while(stop) {
				
				String answer = scanner.next();
				switch(answer) {
				case "가위" : user.setusercard(1); stop=false; break;
				case "바위" : user.setusercard(2); stop=false; break;
				case "보" : user.setusercard(3); stop=false; break;
				default : System.out.println("다시입력해주세요."); break;
				}	
			}
			Member computer = new Member();
			computer.setusercard(random.nextInt(3)+1);
			System.out.println("당신: "+user.getusercard());
			System.out.println("컴퓨터: "+computer.getusercard());
			if(computer.getusercard() == user.getusercard()) {
				System.out.println("비겼습니다.");
			}else if((computer.getusercard() == 2 && user.getusercard() == 1)
					||(computer.getusercard() == 3 && user.getusercard() == 2)
					||(computer.getusercard() == 1 && user.getusercard() == 3)) {
				System.out.println("컴퓨터가 이겼습니다.");
			}else {
				System.out.println("당신이 이겼습니다.");
				user.setwin(1);
			}
			while(true) {
				System.out.println("다시하시겠습니까? y/n");
				String ans = scanner.next();
				if(ans.equals("y")||ans.equals("Y")) {
					System.out.println("재시작");break;
				}else if(ans.equals("n") || ans.equals("N")) {
					System.out.println("종료");return;
				}else {
					System.out.println("정확히 입력하십시오.");break;
				}	
			}	
		}

		
	}

	

}
