package java20220217;
import java.util.ArrayList;
import java.util.List;

public class LibraryTest {
	
	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();
		
		bookList.add(new Book("자바",25000));
		bookList.add(new Book("파이썬",15000));
		bookList.add(new Book("안드로이드",25000));
		int total = bookList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println("책의 총 가격은 "+total+ "입니다.");
		bookList.stream().filter(c->c.getPrice()>=20000).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
		}
	

}
