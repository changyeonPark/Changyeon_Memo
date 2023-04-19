package changyeon.submit10;

import java.util.Scanner;

public class LibraryMain {

	public static void main(String[] args) {

		LibraryDB libDB = LibraryDB.getInstance();

		String strBooks = "삼국지, 해리포터와 마법사의 돌, 해리포터와 비밀의 방 , 해리포터와 아즈카반의 죄수,해리포터와 불사조 기사단, 해리포터와 혼혈왕자, 해리포터와 죽음의 성물,어린왕자, 나의 라임 오렌지나무, 이것이 자바다, 좋은생각, 반지의 제왕: 반지 원정대, 반지의 제왕: 두 개의 탑, 반지의 제왕: 왕의 귀환, 토익보카, 개미";

		String[] arrBooks = strBooks.split(",");

		for (int i = 0; i < arrBooks.length; i++) {
			String arr = arrBooks[i];
			Book book = new Book(arrBooks[i]);
			libDB.maketitle(book);
		}

		libDB.showBookList();

		Scanner scan = new Scanner(System.in);



		while (true) {
			System.out.println("행동을 선택해주세요.");
			System.out.println("1. 책입고 | 2. 책 대여 | 3. 책 목록 | 4. 책 검색 | 5. 종료");
			System.out.print(">>> ");

			int number = Integer.parseInt(scan.nextLine());
			if (number == 1) {
				// TODO 책입고
				System.out.print("책 번호를 입력해주세요: ");
				int abc = Integer.parseInt(scan.nextLine());
				System.out.println(libDB.bookList.get(abc - 1).getTitle() + "이(가) 입고되었습니다.");
				libDB.bookList.get(abc - 1).setRental(false);
			} else if (number == 2) {
				System.out.println("책 번호를 입력해주세요.");
				System.out.print(">>> ");
				int abc = Integer.parseInt(scan.nextLine());
				libDB.bookList.get(abc - 1).setRental(true);
				System.out.println(libDB.bookList.get(abc - 1).getTitle() + "을 대여하였습니다.");
				
				// title을 포함하는 book 객체를 찾아서

			} else if (number == 3) {
				libDB.showBookList();
			} else if (number == 4) {
				System.out.print("책 이름을 입력해주세요 : ");
				String abc = scan.nextLine();
				for(int i = 0; i < libDB.bookList.size(); i++) {
					if(libDB.bookList.get(i).getTitle().contains(abc)) {
						System.out.println(libDB.bookList.get(i));
					}
				}
			} else {
				System.out.println("종료.");
				break;
			}

		}
	}
}
