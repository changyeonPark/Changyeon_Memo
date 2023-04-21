package changyeon.submit12;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class BoardDB {
	
	private ArrayList <Board> boardList = new ArrayList<>();
	
	private BoardDB(){
		
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
	
	// 날짜 입력 메소드
	public String makeDate(){
		Date today = new Date();
		SimpleDateFormat abc = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String def = abc.format(today);
		return def;
	}
	
	// 글 번호 생성 메소드
	public int makeNum(){
		return boardList.size()+1;
	}
	
	public void boardListAdd(Board boa) {
		boardList.add(boa);
	}
	
}
