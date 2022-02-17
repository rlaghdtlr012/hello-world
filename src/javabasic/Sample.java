package javabasic;
//import java.util.ArrayList;

public class Sample {
	int varTest(int a) {
		a++;
		return a;
	}
	public static void main( String [] args) {
		int a = 1;
		Sample sample = new Sample();
		System.out.println(sample.varTest(a));
		System.out.println(a);
	}
}
