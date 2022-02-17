package java20220217;
import java.util.ArrayList;
import java.util.List;

public class LibraryTest {
	
	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();
		
		bookList.add(new Book("�ڹ�",25000));
		bookList.add(new Book("���̽�",15000));
		bookList.add(new Book("�ȵ���̵�",25000));
		int total = bookList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println("å�� �� ������ "+total+ "�Դϴ�.");
		bookList.stream().filter(c->c.getPrice()>=20000).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
		}
	

}
