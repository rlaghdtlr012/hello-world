package javabasic3;

public class BuyCoffee {

	public static void main(String[] args) {
		Student studentVicky = new Student("Vicky",20000);
		Student studentSpencer = new Student("Spencer",50000);
		StarCoffee star3 = new StarCoffee("3호점");
		studentVicky.takeStarAmericanoCoffee(star3);
		studentVicky.showinfo();
		star3.showinfo();
		
		BeanCoffee bean5 = new BeanCoffee("5호점");
		studentSpencer.takeBeanLatteCoffee(bean5);
		studentSpencer.showinfo();
		bean5.showinfo();
	}

}
