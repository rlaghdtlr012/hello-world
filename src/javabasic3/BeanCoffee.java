package javabasic3;

public class BeanCoffee {
	public int money;
	public int number;
	public String storeNumber;
	
	public BeanCoffee(String storeNumber) {
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
		System.out.printf("???ٹ? %s?? ?? ?????? %d???̸?, ?? ?Ǹ? ?? ???? %d?Դϴ?.\n ",storeNumber,money,number);
	}
}
