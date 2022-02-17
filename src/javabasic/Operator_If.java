package javabasic;

public class Operator_If {

	public static void main(String[] args) {
		/*
		 * 작성자 : 김홍식
		 * operator 값이 +,-,*,/인 경우의 사칙연산(If문)
		 * 작성일자 : 20220125
		 */
		int num1 = 10;
		int num2 = 3;
		char operator = '+';
		if(operator=='+') {
			System.out.printf("%d + %d = %d",num1,num2,num1+num2);
		}
		else if(operator == '-') {
			System.out.printf("%d - %d = %d",num1,num2,num1-num2);
		}
		else if(operator == '*') {
			System.out.printf("%d * %d = %d",num1,num2,num1*num2);
		}
		else {
			System.out.printf("%d / %d = %d",num1,num2,num1/num2);
		}
	}

}
