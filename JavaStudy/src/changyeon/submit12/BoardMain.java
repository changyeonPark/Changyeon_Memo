package changyeon.submit12;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {

		CartoonBoard cd = new CartoonBoard(1, "일빠", "내용", "2023.04.21", "이미지");
		System.out.println(cd);
		
		BoardDB boardDB = BoardDB.getInstance();
		
		Scanner scan = new Scanner(System.in);

		while(true) {
		System.out.println("행동을 선택해주세요.");
		System.out.println("1. 글 목록 | 2. 글 쓰기 | 3. 종료");
		System.out.print(">>> ");
		int commend = Integer.parseInt(scan.nextLine());
			if (commend == 1) {
				
				boardDB.showBoardList();
				
			} else if (commend == 2) {
				
				System.out.print("글 제목을 입력해주세요: ");
				String title = scan.nextLine();
				
				System.out.print("글 내용을 입력해주세요: ");
				String content = scan.nextLine();
				
				Board boa = new Board(boardDB.makeNum(), title, boardDB.makeDate(), content);
				
				boardDB.boardListAdd(boa);
				
			} else {
				System.out.println("종료합니다.");
				break;
			}

		}
	}

}
