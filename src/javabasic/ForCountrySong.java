package javabasic;

public class ForCountrySong {

	public static void main(String[] args) {
		/*
		 * �ۼ��� : ��ȫ��
		 * ���ڿ����� Ư�� ���� ���� & ���ڿ� ���� ���
		 * �ۼ����� : 20220207
		 */
		String letter = "���ع��� ��λ��� ������ �⵵�� �ϴ����� �����ϻ� �츮���� ����";
		int indexOfDarl = letter.indexOf("��");
		int lengthOfStr = letter.length();
		System.out.printf("���� %d��° �����մϴ�.\n",indexOfDarl);
		System.out.printf("letter ���ڿ��� ���̴� %d�Դϴ�.\n",lengthOfStr);

	}

}
