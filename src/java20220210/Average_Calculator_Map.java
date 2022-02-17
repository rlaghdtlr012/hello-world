package java20220210;

import java.util.HashMap;
import java.util.Map;

public class Average_Calculator_Map {

	public static void main(String[] args) {
		Map<String,Integer> scores = new HashMap<String,Integer>();
		scores.put("Math", 80);
		scores.put("Physics", 90);
		scores.put("English", 85);
		scores.put("Programming", 98);
		int sum = 0;
		for (String key : scores.keySet()) {
			sum += scores.get(key);
		}
		double avg = (sum*1.0)/(scores.size());
		System.out.printf("수학 점수는 %d 입니다.\n",scores.get("Math"));
		System.out.printf("물리 점수는 %d 입니다.\n",scores.get("Physics"));
		System.out.printf("영어 점수는 %d 입니다.\n",scores.get("English"));
		System.out.printf("프로그래밍 점수는 %d 입니다.\n",scores.get("Programming"));
		System.out.printf("평균 점수는 %.2f 입니다.\n",avg);
	}

}
