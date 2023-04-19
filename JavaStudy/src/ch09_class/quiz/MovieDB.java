package ch09_class.quiz;

import java.util.ArrayList;

public class MovieDB {
	
	private ArrayList <Movie> movieList = new ArrayList<>();
	
	// 싱글톤 패턴 
	
	// 생성자 생성
	private MovieDB() {
		movieList.add(new Movie("신세계", "거 죽기 딱 좋은 날씨네", "이정재, 황정민, 박성웅", "ㅅㅅㄱ"));
		movieList.add(new Movie("터미네이터", "I will be back", "아놀드 슈워제네거", "ㅌㅁㄴㅇㅌ"));
		movieList.add(new Movie("아저씨", "금니 빼고 다 모조리 씹어먹어줄게", "원빈, 김새론, 김희원", "ㅇㅈㅆ"));
		movieList.add(new Movie("극한직업", "이것은 갈비인가 치킨인가", "류승룡, 이동휘, 이하늬", "ㄱㅎㅈㅇ"));
		movieList.add(new Movie("명량", "신에게는 아직 12척의 배가 남아있습니다", "최민식, 류승룡, 조진웅", "ㅁㄹ"));
		movieList.add(new Movie("엑시트", "따따따-따-따-따-따따따", "조정석, 윤아", "ㅇㅅㅌ"));
		movieList.add(new Movie("베테랑", "어이가 없네?", "황정민, 유아인, 유해진", "ㅂㅌㄹ"));
		movieList.add(new Movie("암살", "내 몸에 일본놈들의 총알이 여섯개나 박혀있습니다.", "이정재, 전지현, 하정우", "ㅇㅅ"));
		movieList.add(new Movie("부당거래", "호의가 계속 되면은 그게 권리인 줄 알아요", "류승범, 황정민, 유해진", "ㅂㄷㄱㄹ"));
		movieList.add(new Movie("친구", "아부지 뭐하시노?", "유오성, 장동건, 김광규", "ㅊㄱ"));
		
	}
	
	// 1. 본인의 생성자를 본인으로 만든다.
	private static MovieDB instance = new MovieDB(); 
	
	// 3. 다른 곳에서 수정할 수 있으니 private로 막아준다
	public static MovieDB getInstance() {
		return instance;
	}
	
	// movieList에 대해서 리턴해주는 메소드
	// 
	public ArrayList<Movie> getMovieList(){
		return movieList;
	}
	
	
	
	
}
