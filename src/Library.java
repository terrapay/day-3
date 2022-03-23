
public class Library {
	public static void main(String[] args) {
		System.out.println("hello");
		Book b1 = new Book();
		b1.title="Learn Java";
		b1.price=450F;
		b1.status=STATUS.available;
		System.out.println(b1.title);
		
		Book b2 = new Book();
		b2.title="book2";
		b2.status=STATUS.available;
//		b2.url;
		b2.price=150F;
		b2.issueBook();
		b2.issueBook();
		DigitalBook digitalBook = new DigitalBook();
		System.out.println(digitalBook.price);
		digitalBook.issueBook();
	}

}
