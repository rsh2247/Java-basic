package test2;

import java.util.Scanner;

public class GradeDemo2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] score = new int[3];
		for(int i=0;i<3;i++) {
			score[i] = scanner.nextInt();
		}
		
		if(score[0]>score[1] && score[0]>score[2]) {
			System.out.println("1등점수는 "+score[0]+"점");
		}else if(score[1]>score[0] && score[1]>score[2]) {
			System.out.println("1등점수는 "+score[1]+"점");
		}else {
			System.out.println("1등점수는 "+score[2]+"점");
		}
	}
}
