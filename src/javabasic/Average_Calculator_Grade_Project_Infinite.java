package javabasic;

import java.util.Scanner;

public class Average_Calculator_Grade_Project_Infinite {

	public static void main(String[] args) {
		String answer;
		while(true) {
			System.out.println("�ý����� ����� ������ ���θ� �����ϼ��� : ");
			@SuppressWarnings("resource")
			Scanner scan1 = new Scanner(System.in);
			answer = scan1.next();
			if(answer.equalsIgnoreCase("keep")) {
				System.out.println("������ �Է��ϼ��� : ");
				@SuppressWarnings("resource")
				Scanner scan = new Scanner(System.in);
				int score = scan.nextInt();
				String grade="";
				if(score>=95) {      //������ 95�� �̻��̸� grade�� A+
					grade="A+";
				}
				else if(score>=90){  //������ 90�� �̻��̸� grade�� A0
					grade="A0";
				}
				else if(score>=85){  //������ 85�� �̻��̸� grade�� B+
					grade="B+";
				}
				else if(score>=80){  //������ 80�� �̻��̸� grade�� B0
					grade="B0";
				}
				else if(score>=70){  //������ 70�� �̻��̸� grade�� C
					grade="C";
				}
				else if(score>=60){  //������ 60�� �̻��̸� grade�� D
					grade="D";
				}
				else {
					grade="F";  // �� �� ������ grade�� F
				}
				System.out.println("����� ������ "+ grade +"�Դϴ�.");
			}
			else if(answer.equalsIgnoreCase("quit")){
				break;
			}
		}

	}
}
