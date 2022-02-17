package java20220211;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Lotto {

	static int num;
	static Random rm = new Random();
	static ArrayList<Integer> lotto = new ArrayList<Integer>();
	public static void main(String[] args) {
		while(lotto.size()<6) { // Lotto Arraylist길이가 6미만일때 반복문 설정
			num =  rm.nextInt(45)+1;   // 1~45 사이의 임의의 난수 num 생성
			if (lotto.contains(num)) { 
				continue;              // 임의의 난수 num이 lotto arraylist에 들어가있다면 continue
			}
			else {
				lotto.add(num); //아니라면 lotto에 num값 추가	
			}
		}
		Collections.sort(lotto); //오름차순 정렬
		System.out.println(lotto);
		
	}
}
