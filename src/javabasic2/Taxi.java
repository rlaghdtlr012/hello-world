package javabasic2;

public class Taxi {
	public int money;
	public int passengerCount;
	public int taxiNumber;
	
	public Taxi(int taxiNumber) {
		this.taxiNumber = taxiNumber;
	}
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	public void showinfo() {
		System.out.println("택시"+taxiNumber+"의 승객은 "+passengerCount+"명이고, 택시 기사의 수입은 "+money+"입니다." );
	}
}
