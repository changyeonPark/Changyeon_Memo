package changyeon.submit10;

public class Book {
	private int num;
	private String title;
	private boolean rental;
	
	
	public Book() {}

	
	public Book(String title) {
		LibraryDB libDB = LibraryDB.getInstance();
		this.num = libDB.makeNum();
		this.title = title;
		this.rental = false;
	}
	

	public Book(int num, String title, boolean rental) {
		super();
		this.num = num;
		this.title = title;
		this.rental = rental;
	}


	@Override
	public String toString() {
		if (rental == false) {
			return "[책번호: " + num + ", 책 제목: " + title + ", 대여상태: 입고 중]";
		} else {
			return "[책번호: " + num + ", 책 제목: " + title + ", 대여상태: 대여 중]";
		}
		
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public boolean isRental() {
		return rental;
	}


	public void setRental(boolean rental) {
		this.rental = rental;
	}
	
	
	
	
	
	
}
