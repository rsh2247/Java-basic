package test;
import java.util.Scanner;
public class Shop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Customer[] customers = new Customer[3];
		
		for(int i=0;i<customers.length;i++) {
			customers[i] = new Customer();
			System.out.println("�̸�");
			customers[i].setname(scan.next());
			System.out.println("������ (����)");
			customers[i].setphone(scan.nextInt());
			System.out.println("tv���� (����)");
			customers[i].settv(scan.nextInt());
			System.out.println("��ǻ�Ͱ��� (����)");
			customers[i].setcomputer(scan.nextInt());
			customers[i].getsum();
		}
		for(int i=0;i<3;i++) {
			System.out.println(customers[i].getname()+"�� �����Ͻ� ������ �� "+customers[i].getsum()+"���� �Դϴ�.");			
		}		
	}
}
