package ch09_class.homepage;

import java.util.ArrayList;

public class BoardDB {
	
	private ArrayList <Board> boardList = new ArrayList<>();
	
	// 싱글톤 적용 
	// (프로젝트 내에서 이 클래스로부터 객체를 딱 하나만 생성할 목적으로 사용)
	// 1. 프라이베잇으로 객체 생성을 막아주고
	// 2. 다른곳에서 사용할 수 있도록 static 인스텐스로 만들어주고
	// 3. 프레이베잇으로 막아준다
	
	private BoardDB() {
		boardList.add(new Board(1, "공지사항 필독!!", "욕설 금지", "admin"));
	}
	
	private static BoardDB instance = new BoardDB();
	
	public static BoardDB getInstance() {
		return instance;
	}
	
	// 게시글 목록 출력 메소드
	public void showBoardList() {
		
		for(int i = 0; i < boardList.size(); i++) {
			System.out.println(boardList.get(i));
		}
	}
	
	// 게시글 추가
	public void addBoard(Board board) {
		// 현재 board 객체 내부의 no가 0이 들어있음
		// board 객체 내부 no를 boardList.size() + 1로 변경
		// 파마리터로 들어온 보드 객체내에서
		board.setNo(boardList.size()+1);
		
		boardList.add(board);
	}
	
	public void selectBoard(int no) {
		// boardList에 존재하는 board 객체 중에 
		// 파라미터로 들어온 no와 같은 no를 가지는 board 객체 찾기
		for(int i=0; i < boardList.size(); i++) {
			Board bo = boardList.get(i);
			if(bo.getNo() == no) {
				System.out.println("제목: " + bo.getTitle());
				System.out.println("작성자: " + bo.getAuthor());
				System.out.println("===========================================");
				System.out.println(bo.getContent());
				
				return;
			} 
		}
		
		System.out.println("존재하지 않는 글번호 입니다.");
		
	}
	
	
}
