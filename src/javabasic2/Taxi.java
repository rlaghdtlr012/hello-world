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
		System.out.println("�ý�"+taxiNumber+"�� �°��� "+passengerCount+"���̰�, �ý� ����� ������ "+money+"�Դϴ�." );
	}
}
