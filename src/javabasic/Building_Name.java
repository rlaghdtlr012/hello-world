package javabasic;

public class Building_Name {

	public static void main(String[] args) {
		/*
		 * �ۼ��� : ��ȫ��
		 * �ǹ��� � ������ �ִ���
		 * �ۼ����� : 20220125
		 */
		int floor = 3;  //�� ���� 3��
		switch(floor) {
		case 1 : System.out.printf("%d���� �౹�Դϴ�.",floor);   //�� ���� 1���̸� �౹
			break;
		case 2 : System.out.printf("%d���� �����ܰ��Դϴ�.",floor); //�� ���� 2���̸� �����ܰ�
			break;
		case 3 : System.out.printf("%d���� �Ǻΰ��Դϴ�.",floor);  //�� ���� 3���̸� �Ǻΰ�
			break;
		case 4 : System.out.printf("%d���� ġ���Դϴ�.",floor);  //�� ���� 4���̸� ġ��
			break;
		case 5 : System.out.printf("%d���� �ｺ Ŭ���Դϴ�.",floor); //�� ���� 5���̸� �ｺŬ��
			break;
		}

	}

}
