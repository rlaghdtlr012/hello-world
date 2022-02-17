package javabasic;

public class Gugudan {

	public static void main(String[] args) {
		/*
		 * 작성자 : 김홍식
		 * 구구단 출력, 2단에서 9단까지
		 * 작성일 : 20220126
		 */
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.printf("%d * %d = %d\n",i,j,i*j);
			}
		}

	}

}
