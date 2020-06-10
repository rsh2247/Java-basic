package test2;
import java.util.Scanner;
public class RaceApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Player[] player = new Player[3];
		for(int i=0;i<player.length;i++) {
			player[i] = new Player();
			System.out.println("이름을 입력해주세요.");
			player[i].setname(scan.next());
			System.out.println("기록을 입력해주세요.");
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
					String temp2 = player[i].getname();
					player[i].setrecord(records[i+1]);
					player[i].setname(player[i+1].getname());
					records[i] = records[i+1];
					player[i+1].setrecord(temp);
					player[i+1].setname(temp2);
					records[i+1] = temp;
				}
			}
		}
		System.out.println("기록순서");
		for(int i=0;i<player.length;i++) {
			System.out.println(i+1+"등 ");
			player[i].show();
		}

	}
}
