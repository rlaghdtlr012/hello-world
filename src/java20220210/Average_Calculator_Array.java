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
		System.out.printf("���� ������ %d �Դϴ�.\n",scores[0]);
		System.out.printf("���� ������ %d �Դϴ�.\n",scores[1]);
		System.out.printf("���� ������ %d �Դϴ�.\n",scores[2]);
		System.out.printf("���α׷��� ������ %d �Դϴ�.\n",scores[3]);
		System.out.printf("��� ������ %.2f �Դϴ�.\n",avg);
	}

}
