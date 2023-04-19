package changyeon.submit10;

import java.util.ArrayList;

public class LibraryDB {
	
	
	// 선언
	ArrayList<Book> bookList = new ArrayList<>();
	
	private LibraryDB() {
		
		String strBooks = "삼국지, 해리포터와 마법사의 돌, 해리포터와 비밀의 방 , 해리포터와 아즈카반의 죄수,해리포터와 불사조 기사단, 해리포터와 혼혈왕자, 해리포터와 죽음의 성물,어린왕자, 나의 라임 오렌지나무, 이것이 자바다, 좋은생각, 반지의 제왕: 반지 원정대, 반지의 제왕: 두 개의 탑, 반지의 제왕: 왕의 귀환, 토익보카, 개미";

		String[] arrBooks = strBooks.split(",");
		
		for(int i = 0; i < arrBooks.length; i++) {
			arrBooks[i] = arrBooks[i].trim();
		}
		
		for(int i = 0; i < arrBooks.length; i++) {
			bookList.add(new Book(bookList.size()+1, arrBooks[i], false));
		}
		
	}
	
	
	
	static LibraryDB instance = new LibraryDB();
	
	public static LibraryDB getInstance() {
		return instance;
	}
	
	// 책 번호 메소드
	public int makeNum() {
		return bookList.size() + 1;
	}
	
	public void maketitle(Book book) {
		bookList.add(book);
	}
	
	public void showBookList() {
		for(int i=0; i < bookList.size(); i++) {
			System.out.println(bookList.get(i));
		}
	}
	public void searchBook(String keyword) {
		for (int i = 0; i < bookList.size(); i++) {
			if(bookList.get(i).getTitle().contains(keyword)) {
				System.out.println(bookList.get(i));
			}
		}
	}
	
	// 책 검색 + 검색된 책 목록 리턴
	public ArrayList<Book> searchBookList(String keyword){
		ArrayList<Book> result = new ArrayList<>();
		for(int i = 0; i < bookList.size(); i++) {
			if(bookList.get(i).getTitle().contains(keyword)) {
				result.add(bookList.get(i));
			}
		}
		return result;
	}
}
