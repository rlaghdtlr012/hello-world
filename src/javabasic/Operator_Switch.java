package javabasic;

public class Operator_Switch {

	public static void main(String[] args) {
		/*
		 * �ۼ��� : ��ȫ��
		 * operator ���� +,-,*,/�� ����� ��Ģ����(Switch Case)
		 * �ۼ����� : 20220125
		 */
		int num1 = 10;
		int num2 = 2;
		char operator = '*';
		switch(operator) {
			case '+': 
				System.out.printf("%d + %d = %d",num1,num2,num1+num2);
				break;
			case '-':
				System.out.printf("%d - %d = %d",num1,num2,num1-num2);
				break;
			case '*':
				System.out.printf("%d * %d = %d",num1,num2,num1*num2);
				break;
			case '/':
				System.out.printf("%d / %d = %d",num1,num2,num1/num2);
				break;
		} 
	}

}
