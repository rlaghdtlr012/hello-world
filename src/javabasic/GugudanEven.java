package javabasic;

public class GugudanEven {

	public static void main(String[] args) {
		/*
		 * 작성자 : 김홍식
		 * 구구단 2단에서 9단까지 짝수단만 출력
		 * 작성일 : 20220126
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