package javabasic3;

public class StarCoffee {
	public int money;
	public int number;
	public String storeNumber;
	
	public StarCoffee(String storeNumber) {
		this.storeNumber = storeNumber;
	}
	public void americano(int money) {
		this.money += money;
		number++;
	}
	public void latte(int money) {
		this.money += money;
		number++;
	}
	public void cocoa(int money) {
		this.money += money;
		number++;
	}
	public void showinfo()
	{
		System.out.printf("별다방 %s의 총 매출은 %d원이며, 총 판매 잔 수는 %d입니다.\n ",storeNumber,money,number);
	}
}
