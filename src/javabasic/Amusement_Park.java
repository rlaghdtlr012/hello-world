package javabasic;

public class Amusement_Park {

	public static void main(String[] args) {
		/*
		 * �ۼ��� : ��ȫ��
		 * ���̰��� ����� ����
		 * �ۼ����� : 20220125
		 */
		int age = 28;
		int pay = 0;
		if(age<8) {
			pay=1000;
		}
		else if(age<14) {
			pay=2000;
		}
		else if(age<20) {
			pay=2500;
		}
		else if(age>=20) {
			pay=3000;
		}
		else {
			pay = 0;
		}
		System.out.printf("������ ���̰��� ������ %d �Դϴ�.",pay);


	}

}
