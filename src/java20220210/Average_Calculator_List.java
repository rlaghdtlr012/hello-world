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
		System.out.printf("���� ������ %d �Դϴ�.\n",scores.get(0));
		System.out.printf("���� ������ %d �Դϴ�.\n",scores.get(1));
		System.out.printf("���� ������ %d �Դϴ�.\n",scores.get(2));
		System.out.printf("���α׷��� ������ %d �Դϴ�.\n",scores.get(3));
		System.out.printf("��� ������ %.2f �Դϴ�.\n",avg);

	}

}
