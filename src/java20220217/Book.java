package java20220217;
import java.util.ArrayList;
import java.util.List;
public class Book {
	public static int sum = 0;
	String name;
	int price;
	Book(String name, int price){
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void viewInfo() {
	}
	
}
