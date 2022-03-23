
public class Book {
	String title;// has-a
	float price;
	STATUS status;

	public Book() {// default constructor
	}

	public Book(String title, float price) {// custom constructor
		this.price = price;
		this.title = title;
	}

	public void issueBook() {
		if (this.status == status.available) {
			this.status = STATUS.issued;
			System.out.println(this.title+" is issued");
		}
		else {
			throw new BookNotAvailableException();
		}
	}

	public void returnBook() {
		this.status = status.available;
	}
}
