package test2;
import java.util.Scanner;
public class RaceApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("선수 수를 입력하세요");
		Player[] player = new Player[scan.nextInt()];
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
		for(int j=0;j<player.length;j++) {
			for(int i=0;i<player.length-1;i++) {
				if(player[i].getrecord()>player[i+1].getrecord()) {
					Player tempplayer = new Player();
					tempplayer = player[i];
					player[i] = player[i+1];
					player[i+1] = tempplayer;
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