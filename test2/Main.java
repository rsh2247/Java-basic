package test2;

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int[] sm = makenumber(number);		//숫자를 입력받아 문자화
		int sum = sm[2];
		int num1 = sm[0];
		int num2 = sm[1];

		if(sum>9) {
			int[] sm1 = makenumber(sum);
			sum = sm1[2];
			num1 = sm[1];
			num2 = sm1[1];
			number = num1*10+num2;
			System.out.println(number);
		}else {
			
		}
		
	}
	
	static int[] makenumber(int number) {
		String temp_str = Integer.toString(number);
		int[] num = new int[3];
		int sum = 0;
		for(int i=0;i<2;i++) {
			num[i] = Integer.parseInt(temp_str.substring(i, i+1));
			//System.out.println(num[i]);
			sum += num[i];	
			}
		num[2] = sum;
		return num;
	}
	
}
