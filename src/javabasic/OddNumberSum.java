package javabasic;
public class OddNumberSum {

	public static void main(String[] args) {
		/*
		 * �ۼ��� : ��ȫ��
		 * ���ڿ����� 1���� 100������ Ȧ���� �� ���
		 * �ۼ����� : 20220207
		 */
		int sum = 0;
		for(int i = 1;i<100;i++) {
			if(i%2==1) {
				sum += i;
			}
		}
		System.out.printf("1���� 100������ Ȧ���� ���� %d�Դϴ�.\n",sum);
	}

}
