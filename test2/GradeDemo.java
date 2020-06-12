package test2;

import java.util.Scanner;

public class GradeDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student[] student = new Student[3];
		for(int i=0; i<student.length;i++) {
			student[i] = new Student();
			System.out.println("학생"+(i+1)+" 점수");
			student[i].score = scanner.nextInt();
		}
		for(int i=0; i<student.length;i++) {
			if(student[i].score>=90) {
				student[i].grade = 'A';
			}else if(student[i].score>=80) {
				student[i].grade = 'B';
			}else if(student[i].score>=70) {
				student[i].grade = 'C';
			}else {
				student[i].grade = 'D';
			}		
		}	
		for(int i=0; i<student.length;i++) {
			for(int j=0; j<student.length-1;j++) {
				if(student[j].score<student[j+1].score) {
					Student studentemp = new Student();
					studentemp = student[j];
					student[j] = student[j+1];
					student[j+1] = studentemp;
				}
			}
		}
		for(int i=0;i<student.length;i++) {
			System.out.println(i+1+"등"+student[i].score+"점, "+student[i].grade+"등급");
		}
	}
}

class Student{
	int score;
	char grade;
}
