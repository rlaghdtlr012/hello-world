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
		System.out.printf("���� ������ %d �Դϴ�.\n",scores.get("Math"));
		System.out.printf("���� ������ %d �Դϴ�.\n",scores.get("Physics"));
		System.out.printf("���� ������ %d �Դϴ�.\n",scores.get("English"));
		System.out.printf("���α׷��� ������ %d �Դϴ�.\n",scores.get("Programming"));
		System.out.printf("��� ������ %.2f �Դϴ�.\n",avg);
	}

}
