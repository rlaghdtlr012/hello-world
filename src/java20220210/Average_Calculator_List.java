package java20220210;

import java.util.ArrayList;

public class Average_Calculator_List {

	public static void main(String[] args) {
		ArrayList<Integer> scores = new ArrayList<Integer>();
		int sum = 0;
		scores.add(90);
		scores.add(92);
		scores.add(96);
		scores.add(100);
		for (int i = 0; i < scores.size(); i++) {
			sum += scores.get(i);
		}
		double avg = (sum*1.0)/(scores.size());
		System.out.printf("수학 점수는 %d 입니다.\n",scores.get(0));
		System.out.printf("물리 점수는 %d 입니다.\n",scores.get(1));
		System.out.printf("영어 점수는 %d 입니다.\n",scores.get(2));
		System.out.printf("프로그래밍 점수는 %d 입니다.\n",scores.get(3));
		System.out.printf("평균 점수는 %.2f 입니다.\n",avg);

	}

}
