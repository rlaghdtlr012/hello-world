package javabasic;

public class GugudanEven {

	public static void main(String[] args) {
		/*
		 * �ۼ��� : ��ȫ��
		 * ������ 2�ܿ��� 9�ܱ��� ¦���ܸ� ���
		 * �ۼ��� : 20220126
		 */
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				if(i%2==0) {
					System.out.printf("%d * %d = %d\n",i,j,i*j);
				}
			}
		}

	}

}