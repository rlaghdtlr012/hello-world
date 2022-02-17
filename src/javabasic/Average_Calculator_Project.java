package javabasic;

public class Average_Calculator_Project {

	public static void main(String[] args) {
		/*
		 * 이름 : 김홍식
		 * 임의로 4과목에 대한 점수를 입력 후, 평균 구하기.
		 */
		int math = 90;
		int kor = 85;
		int eng = 96;
		int program = 74;
		double avg = ((math+kor+eng+program)*1.0)/4;
		System.out.println("당신의 4과목 평균은" + avg + "입니다.");

	}

}
