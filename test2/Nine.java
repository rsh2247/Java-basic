package test2;

import java.util.Scanner;
/*
 * 
 * */
public class Nine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("인원수");
		Text[] text = new Text[scanner.nextInt()];
		for(int i=0;i<text.length;i++) {
			text[i] = new Text();
			System.out.println("이름");
			text[i].setname(scanner.next());
			System.out.println("과목");
			text[i].setsub(scanner.next());
			System.out.println("점수");
			text[i].setscore(scanner.nextInt());
			text[i].cacul();
			
			System.out.println("*********************");
			System.out.println(" 이름     과목     점수     등급");
			System.out.println("---------------------");
			System.out.println("|"+text[i].name+"| "+text[i].sub+" | "+text[i].score+" | "+text[i].grade+" |");
			System.out.println("*********************");		
		}
	}
}

class Text{
	String name;
	String sub;
	int score;
	String grade;
	
	void cacul() {
		if(score>=90) {
			grade = "A";	
		}else if(score>=80) {
			grade = "B";
		}else if (score>=70) {
			grade = "C";
		}else {
			grade = "D";
		}
	}
	
	void setname(String name) {
		this.name = name;
	}
	void setsub(String name) {
		this.sub = name;
	}
	void setscore(int name) {
		this.score = name;
	}
	String getname() {
		return this.name;
	}
	String getsub() {
		return this.sub;
	}
	int getscore() {
		return this.score;
	}
	String getgrade() {
		return this.grade;
	}
}