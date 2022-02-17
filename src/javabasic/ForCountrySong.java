package javabasic;

public class ForCountrySong {

	public static void main(String[] args) {
		/*
		 * 작성자 : 김홍식
		 * 문자열에서 특정 문자 추출 & 문자열 길이 출력
		 * 작성일자 : 20220207
		 */
		String letter = "동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세";
		int indexOfDarl = letter.indexOf("닳");
		int lengthOfStr = letter.length();
		System.out.printf("닳은 %d번째 존재합니다.\n",indexOfDarl);
		System.out.printf("letter 문자열의 길이는 %d입니다.\n",lengthOfStr);

	}

}
