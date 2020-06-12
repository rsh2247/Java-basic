package test;

import java.util.Random;
import java.util.Scanner;

public class RpsApp {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		Rps computer = new Rps();
		Rps human = new Rps();
		for(int i=0; i<1;i++) {
			System.out.println("가위, 바위, 보 중 하나를 입력해주세요.");
			for(int j=0; j<1; j++) {
				String temp = scanner.next();
				if(temp.equals("가위")) {
					human.a = 1;
				}else if(temp.equals("바위")) {
					human.a = 2;
				}else if(temp.equals("보")) {
					human.a = 3;
				}else
				{
					System.out.println("제대로 입력해주세요.");
					j--;
				}
			}			
			computer.a = (random.nextInt(3)+1);
			human.cac();
			computer.cac();
			System.out.println("당신: "+human.b);
			System.out.println("컴퓨터: "+computer.b);
			if(computer.a == human.a) {
				System.out.println("비겼습니다.");
			}else if((computer.a == 2 && human.a == 1)||(computer.a == 3 && human.a == 2)||(computer.a == 1 && human.a == 3)) {
				System.out.println("컴퓨터가 이겼습니다.");
			}else {
				System.out.println("당신이 이겼습니다.");
			}
			System.out.println("다시하시겠습니까? y/n");
			while(true) {
				System.out.println("다시하시겠습니까? y/n");
				String ans = scanner.next();
				if(ans.equals("y")||ans.equals("Y")) {
					System.out.println("재시작");i--;break;
				}else if(ans.equals("n") || ans.equals("N")) {
					System.out.println("종료");return;
				}else {
					System.out.println("정확히 입력하십시오.");
					}	
			}
		}
	}
}
class Rps
{
	int a;
	String b;
	void cac() 
	{
		switch(a) 
		{
		case 1 : b="가위" ;break;
		case 2 : b="바위" ;break;
		case 3 : b="보" ;break;
		}
	}
}