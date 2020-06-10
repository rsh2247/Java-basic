package test2;

import java.util.Scanner;

public class RaceApp2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Player[] player = new Player[3];
		for(int i=0;i<3;i++) {
			player[i] = new Player();
			System.out.println("이름");
			player[i].setname(scan.next());
			System.out.println("기록");
			player[i].setrecord(scan.nextFloat());
		}
		
		Player[] ranking = new Player[3];
		if(player[0].getrecord()<player[1].getrecord()) {
			if(player[0].getrecord()<player[2].getrecord()) {
				ranking[0] = player[0];
				if(player[1].getrecord()<player[2].getrecord()) {
					ranking[1] = player[1];
					ranking[2] = player[2];
				}
				else {
					ranking[1] = player[2];
					ranking[2] = player[1];
				}
			}else {
				ranking[0] = player[2];
				ranking[1] = player[0];
				ranking[2] = player[1];
			}
		}else {
			if(player[2].getrecord()<player[0].getrecord()) {
				ranking[2] = player[0];
			}
		}
	}
}
