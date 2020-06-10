package test;
import java.util.Scanner;
public class Shop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Customer[] customers = new Customer[3];
		
		for(int i=0;i<customers.length;i++) {
			customers[i] = new Customer();
			System.out.println("이름");
			customers[i].setname(scan.next());
			System.out.println("폰가격 (만원)");
			customers[i].setphone(scan.nextInt());
			System.out.println("tv가격 (만원)");
			customers[i].settv(scan.nextInt());
			System.out.println("컴퓨터가격 (만원)");
			customers[i].setcomputer(scan.nextInt());
			customers[i].getsum();
		}
		for(int i=0;i<3;i++) {
			System.out.println(customers[i].getname()+"님 결제하실 가격은 총 "+customers[i].getsum()+"만원 입니다.");			
		}		
	}
}
