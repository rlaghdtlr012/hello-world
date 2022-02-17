package javabasic;
public class OddNumberSum {

	public static void main(String[] args) {
		/*
		 * 작성자 : 김홍식
		 * 문자열에서 1부터 100사이의 홀수의 합 출력
		 * 작성일자 : 20220207
		 */
		int sum = 0;
		for(int i = 1;i<100;i++) {
			if(i%2==1) {
				sum += i;
			}
		}
		System.out.printf("1부터 100사이의 홀수의 합은 %d입니다.\n",sum);
	}

}
