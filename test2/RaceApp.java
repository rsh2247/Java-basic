package test2;
import java.util.Scanner;
public class RaceApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Player[] player = new Player[3];
		for(int i=0;i<player.length;i++) {
			player[i] = new Player();
			System.out.println("�̸��� �Է����ּ���.");
			player[i].setname(scan.next());
			System.out.println("����� �Է����ּ���.");
			player[i].setrecord(scan.nextFloat());
		}		
		for(int i=0;i<player.length;i++) {
			player[i].show();
		}
		float[] records = new float[3];
		for(int i=0;i<player.length;i++) {
			records[i] = player[i].getrecord();			
		}
		for(int j=0;j<2;j++) {
			for(int i=0;i<player.length-1;i++) {
				if(records[i]>records[i+1]) {
					float temp = records[i];
					records[i] = records[i+1];
					records[i+1] = temp;
				}
			}
		}
		System.out.println("��ϼ���");
		for(int i=0;i<player.length;i++) {
			System.out.println(records[i]);
		}

	}
}
