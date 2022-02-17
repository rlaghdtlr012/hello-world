package javabasic;

public class Average_Calculator_Grade_Project {

	public static void main(String[] args) {
		/*
		 * 작성자 : 김홍식
		 * 학점 산출기
		 * 작성일자 : 20220125
		 */
		double avg = 95.7;  // 점수가 95.7점
		String grade="";
		if(avg>=95) {      //점수가 95점 이상이면 grade는 A+
			grade="A+";
		}
		else if(avg>=90){  //점수가 90점 이상이면 grade는 A0
			grade="A0";
		}
		else if(avg>=85){  //점수가 85점 이상이면 grade는 B+
			grade="B+";
		}
		else if(avg>=80){  //점수가 80점 이상이면 grade는 B0
			grade="B0";
		}
		else if(avg>=70){  //점수가 70점 이상이면 grade는 C
			grade="C";
		}
		else if(avg>=60){  //점수가 60점 이상이면 grade는 D
			grade="D";
		}
		else {
			grade="F";  // 그 외 점수면 grade는 F
		}
		System.out.println("당신의 학점은 "+ grade +"입니다.");
	}

}