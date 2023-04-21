package changyeon.submit12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Board {
	

	
	private int num; 			// 글 번호
	private String title;		// 글 제목
	private String date;		// 글 게시일
	private String content;		// 글 내용
	
	public Board() {
		
		
	}
	
	public Board(String title, String content) {
		BoardDB boardDB = BoardDB.getInstance();
		System.out.println(boardDB);
		this.num = boardDB.makeNum();
		this.title = title;
		this.date = boardDB.makeDate();
//		Date currentTime = new Date();
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		this.content = content;
	}
	
	public Board(int num, String title, String date, String content) {
		super();
		this.num = num;
		this.title = title;
		this.date = date;
		this.content = content;
	}

	@Override
	public String toString() {
		return "[" + num + ". " + "| " + title + " | " + date + " | " + content + "]";
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
