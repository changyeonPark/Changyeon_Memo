package changyeon.submit12;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {

		ArrayList<Board> boardList = new ArrayList<>();
		Scanner scan = new Scanner(System.in);

		while(true) {
		System.out.println("행동을 선택해주세요.");
		System.out.println("1. 글 목록 | 2. 글 쓰기 | 3. 종료");
		System.out.print(">>> ");
		int commend = Integer.parseInt(scan.nextLine());
			if (commend == 1) {
				System.out.println(boardList);
			} else if (commend == 2) {
				// TODO 글쓰기
				System.out.print("글 제목을 입력해주세요: ");
				String title = scan.nextLine();
				System.out.print("글 내용을 입력해주세요: ");
				String content = scan.nextLine();
				boardList.add()
			} else {
				break;
			}

		}

	}

}
