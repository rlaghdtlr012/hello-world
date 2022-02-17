package java20220211;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Lotto {

	static int num;
	static Random rm = new Random();
	static ArrayList<Integer> lotto = new ArrayList<Integer>();
	public static void main(String[] args) {
		while(lotto.size()<6) { // Lotto Arraylist���̰� 6�̸��϶� �ݺ��� ����
			num =  rm.nextInt(45)+1;   // 1~45 ������ ������ ���� num ����
			if (lotto.contains(num)) { 
				continue;              // ������ ���� num�� lotto arraylist�� ���ִٸ� continue
			}
			else {
				lotto.add(num); //�ƴ϶�� lotto�� num�� �߰�	
			}
		}
		Collections.sort(lotto); //�������� ����
		System.out.println(lotto);
		
	}
}
