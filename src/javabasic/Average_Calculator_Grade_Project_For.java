package javabasic;
import java.util.Scanner;

public class Average_Calculator_Grade_Project_For {

	public static void main(String[] args) {	
		for(int i=0;i<4;i++) {
			System.out.println("점수fmf 입력하세요 : ");
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			int score = scan.nextInt();
			String grade="";
			if(score>=95) {      //점수가 95점 이상이면 grade는 A+
				grade="A+";
			}
			else if(score>=90){  //점수가 90점 이상이면 grade는 A0
				grade="A0";
			}
			else if(score>=85){  //점수가 85점 이상이면 grade는 B+
				grade="B+";
			}
			else if(score>=80){  //점수가 80점 이상이면 grade는 B0
				grade="B0";
			}
			else if(score>=70){  //점수가 70점 이상이면 grade는 C
				grade="C";
			}
			else if(score>=60){  //점수가 60점 이상이면 grade는 D
				grade="D";
			}
			else {
				grade="F";  // 그 외 점수면 grade는 F
			}
			System.out.println("당신의 학점은 "+ grade +"입니다.");
		}
	}

}
