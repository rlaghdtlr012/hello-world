package javabasic;
import java.util.Random;
public class ThreeRandomInteger {

	public static void main(String[] args) {
		/*
		 * �ۼ��� : ��ȫ��
		 * ���ڿ����� ������ �� ����(����:1~9) ��� 
		 * �ۼ����� : 20220207
		 */
		Random random = new Random();
		int a = random.nextInt(9)+1;
		int b = random.nextInt(9)+1;
		int c = random.nextInt(9)+1;
		System.out.printf("%d\t%d\t%d\n",a,b,c);
	}

}
