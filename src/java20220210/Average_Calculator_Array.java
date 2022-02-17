package java20220210;

public class Average_Calculator_Array {

	public static void main(String[] args) {
		int[] scores = new int[4];
		int sum = 0;
		scores[0] = 90;
		scores[1] = 96;
		scores[2] = 92;
		scores[3] = 91;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		double avg = (sum*1.0)/(scores.length);
		System.out.printf("수학 점수는 %d 입니다.\n",scores[0]);
		System.out.printf("물리 점수는 %d 입니다.\n",scores[1]);
		System.out.printf("영어 점수는 %d 입니다.\n",scores[2]);
		System.out.printf("프로그래밍 점수는 %d 입니다.\n",scores[3]);
		System.out.printf("평균 점수는 %.2f 입니다.\n",avg);
	}

}
