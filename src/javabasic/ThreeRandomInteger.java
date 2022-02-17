package javabasic;
import java.util.Random;
public class ThreeRandomInteger {

	public static void main(String[] args) {
		/*
		 * 작성자 : 김홍식
		 * 문자열에서 임의의 세 정수(범위:1~9) 출력 
		 * 작성일자 : 20220207
		 */
		Random random = new Random();
		int a = random.nextInt(9)+1;
		int b = random.nextInt(9)+1;
		int c = random.nextInt(9)+1;
		System.out.printf("%d\t%d\t%d\n",a,b,c);
	}

}
