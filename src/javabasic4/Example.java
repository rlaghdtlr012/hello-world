package javabasic4;

import java.util.ArrayList;

public class Example {

	public static void main(String[] args) {
		ArrayList<Integer> scores = new ArrayList<Integer>();
		scores.add(100);
		scores.add(97);
		scores.add(90);
		scores.add(93);
		
		for(int i =  scores.size()-1; i >= 0;i--) {
			scores.remove(i);
			System.out.println(scores);
		}
		
	}

}
