package javabasic3;

public class Student {
	public String studentName;
	public int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	public void takeStarAmericanoCoffee(StarCoffee StarCoffee) {
		StarCoffee.americano(4000);
		this.money -= 4000;
	}
	public void takeStarLatteCoffee(StarCoffee StarCoffee) {
		StarCoffee.latte(5000);
		this.money -= 5000;
	}
	public void takeStarCocoaCoffee(StarCoffee StarCoffee) {
		StarCoffee.cocoa(5000);
		this.money -= 5000;
	}
	public void takeBeanAmericanoCoffee(BeanCoffee beanCoffee) {
		beanCoffee.americano(4000);
		this.money -= 4000;
	}
	public void takeBeanLatteCoffee(BeanCoffee beanCoffee) {
		beanCoffee.latte(5000);
		this.money -= 5000;
	}
	public void takeBeanCocoaCoffee(BeanCoffee beanCoffee) {
		beanCoffee.cocoa(5000);
		this.money -= 5000;
	}
	public void showinfo() {
		System.out.println(studentName+"´ÔÀÇ ³²Àº µ·Àº "+money+"¿ø ÀÔ´Ï´Ù.");
	}
}
