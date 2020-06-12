package test;

import java.util.Random;
import java.util.Scanner;

public class Rock {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		Player computer = new Player();
		Player human = new Player();
		boolean check = true;
		while(check == true) {
			System.out.println("가위,바위,보 중에 고르세염");
			check = true;
			while(check) {
				String x = scanner.next();
				if(x.equals("가위")) {
					human.num = 1; 
					check = false;break;
				}else if(x.equals("바위")) {
					human.num = 2; 
					check = false;break;
				}else if(x.equals("보")) {
					human.num = 3; 
					check = false;break;
				}else {
					System.out.println("제대로 입력해주세요.");
				}
			}
			computer.num = (random.nextInt(3)+1);
			computer.parse();
			human.parse();
			System.out.println("당신 :"+human.card);
			System.out.println("컴퓨터 :"+computer.card);
			if(human.num == computer.num) {
				System.out.println("비겼습니다.");
			}else if((human.num ==1 && computer.num== 3) ||(human.num ==2 && computer.num== 1)||(human.num ==3 && computer.num== 3)) {
				System.out.println("당신이 이겼습니다.");
			}else {
				System.out.println("당신이 졌습니다.");
			}
			System.out.println("다시하시겠습니까?");

			while(check == false) {
				String answer = scanner.next();
				if(answer.equals("Y")) {
					System.out.println("재시작");
					check = true;break;
				}else if(answer.equals("N")) {
					System.out.println("종료");
					return;
				}else {
					System.out.println("다시입력하세요.");
				}
			}			
		}
	}
}

class Player{
	int num;
	String card;
	
	void parse() {
		switch(num){
		case 1 : card= "가위";break;
		case 2 : card= "바위";break;
		case 3 : card= "보";
		}
	}

}