package javabasic;

public class GugudanConditional {

	public static void main(String[] args) {
		/*
		 * 작성자 : 김홍식
		 * 구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력
		 * 작성일 : 20220126
		 */
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				System.out.printf("%d * %d = %d\n",i,j,i*j);
			}
		}

	}

}