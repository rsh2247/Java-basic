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
		System.out.println("���ڸ� �Է����ּ���.");
		int number = random.nextInt(scan.nextInt());
		System.out.println("���ڸ� ���纸����.");
		boolean okay = true;
		while(okay) {
			int mynumber = scan.nextInt();
			if(number>mynumber) {
				System.out.println("Up");
			}else if(number<mynumber){
				System.out.println("down");
			}else {
				System.out.println("�����Դϴ�.");
				okay = false;
			}
		}for(int i=1;i<2;i++) {
			System.out.println("�ٽ��Ͻðڽ��ϱ�? y/n");
			String ans = scan.next();
			if(ans.equals("y")||ans.equals("Y")) {
				System.out.println("�����");
				number();
			}else if(ans.equals("n") || ans.equals("N")) {
				okay = false;
				System.out.println("�׸�");
			}else {
				System.out.println("�ٽ� �Է����ּ���.");
				i=i-1;
			}
		}	
	}
}
			