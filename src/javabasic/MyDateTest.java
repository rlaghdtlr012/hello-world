package javabasic;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate date1 = new MyDate(30,2,2022);
		date1.isValid();
		MyDate date2 = new MyDate(29,2,2020);
		date2.isValid();
	}
}
