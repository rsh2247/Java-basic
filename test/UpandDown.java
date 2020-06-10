package test;
import java.util.Random;
import java.util.Scanner;
public class UpandDown {
	public static void main(String[] args) {
		number();
	}
	static void number() {
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		int number = random.nextInt(scan.nextInt());
		System.out.println("숫자를 맞춰보세요.");
		boolean okay = true;
		while(okay) {
			int mynumber = scan.nextInt();
			if(number>mynumber) {
				System.out.println("Up");
			}else if(number<mynumber){
				System.out.println("down");
			}else {
				System.out.println("정답입니다.");
				okay = false;
			}
		}for(int i=1;i<2;i++) {
			System.out.println("다시하시겠습니까? y/n");
			String ans = scan.next();
			if(ans.equals("y")||ans.equals("Y")) {
				System.out.println("재시작");
				number();
			}else if(ans.equals("n") || ans.equals("N")) {
				okay = false;
				System.out.println("종료");
			}else {
				System.out.println("정확히 입력하십시오.");
				i=i-1;
			}
		}	
	}
}
			