package changyeon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Memo {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i++) {
			if(i%4==0) {
				
			}
			System.out.println(i);
		}
		
		System.out.println("\n============== submit07 ==============");
		
		System.out.println("Q. 01");
		
		// ArrayList에 10 ~ 20 랜덤 숫자 10개 담기
		ArrayList<Integer> intList = new ArrayList<>();
		
		// 15~30 => (int)(Math.random() * 16 ) + 15;
		// 10~20 => (int)(Math.random() * 11 ) + 10;
		// 0~10 => (int)(Math.random() * 11);
		// a~b => (int)(Math.random() * (b-a+1) ) + a;
		for(int i = 0; i < 10; i++) {
			int rand = (int)(Math.random() * 11 ) + 10 ;
			intList.add(rand);   // intList 에다가 .add로 (rand)값을 추가
		}
		
		System.out.println("10 ~ 20 랜덤 정수 : " + intList);
		
		System.out.println("\n================= Q. 01 - @ 문제 =================");
//		int rand = makeRandom(10,20);
//		System.out.println(rand);
		
		System.out.println("\n================= Q. 01 - 2 =================");
		
		// 중복 제거 첫번 째 방법 
		ArrayList<Integer> newList = new ArrayList<>();
		
		for(int i = 0; i < intList.size(); i++) {
			// newList안에 현재의 intList.get(i)가
			//존재하지 않는 경우에만 추가해주기 
			if(!newList.contains(intList.get(i))) {
				newList.add(intList.get(i));
			}
		}
		
		System.out.println("10 ~ 20 중복 제거 : " + newList);
		
		// 중복 제거 두번 째 방법
		for(int i = 0; i < intList.size(); i++) {
			
			for(int k = intList.size()-1; k > i; k--) {
				if(intList.get(i) == intList.get(k)) {
					intList.remove(k);
				}
			}
		}
		
		System.out.println("10 ~ 20 중복 제거2 : " + intList);
		
		System.out.println("\n================= Q. 02 - 1 =================");
		
		// Q. 02
		ArrayList<String> wipeList = new ArrayList<>();
		wipeList.add("냉장고");
		wipeList.add("로봇청소기");
		wipeList.add("세탁기");
		wipeList.add("에어컨");
		wipeList.add("건조기");
		
		ArrayList<String> husList = new ArrayList<>();
		husList.add("노트북");
		husList.add("TV");
		husList.add("에어컨");
		husList.add("플스");
		husList.add("로봇청소기");
		
		ArrayList<String> wantBuy = new ArrayList<>();
		
		// 서로 사고 싶은 물건 목록
		for(int i = 0; i < wipeList.size(); i++) {
			
			if(husList.contains(wipeList.get(i))) {
				wantBuy.add(wipeList.get(i));
			}
		}
		System.out.println("서로 사고 싶은 목록: " + wantBuy);
		
		
		wantBuy.clear(); // 구매목록 전부 지우기
		
		wantBuy.addAll(wipeList); // 아내의 구매록록 전부 담기
		
		// 교집합을 위한 .retainAll()
		wantBuy.retainAll(husList); 
		
		System.out.println(wantBuy);
		
		System.out.println("\n================= Q. 02 - 1 =================");
		
		// 전체 구매 목록 ( 합집합 )
		
		ArrayList<String> allBuy = new ArrayList<>();
		
		allBuy.addAll(wipeList); // allBuy에 wipeList 전부담기
		System.out.println(allBuy); 
		
		for(int i = 0; i < husList.size(); i++) {
			if(!allBuy.contains(husList.get(i))) {
				allBuy.add(husList.get(i));
			}
		}
		
		System.out.println("와이프 + 남편 구매 리스트: " + allBuy);
		
		System.out.println("=================== submit01 ===================");
		
		System.out.println("=================== Q.01 ===================");
		String name = "홍길동";
		int age = 34;
		double feet = 178.1;
		String phone = "010-8248-6987";
		String email = "bebabi@naver.com";
		
		System.out.println("이름: " + name );
		System.out.println("나이: " + age );
		System.out.println("키: " + feet );
		System.out.println("연락처: " + phone );
		System.out.println("이메일: " + email );
		
		System.out.println("=================== Q.01 ===================");
		
		// Q. 01 makeLotto 만들기
		ArrayList<Integer> myLotto = makeLotto();
		System.out.println(myLotto);
		
		System.out.println("=================== Q.02 ===================");
		
		HashMap<String, String> infoMap = new HashMap<>();
		
		infoMap.put("a001", "1234a");
		infoMap.put("b001", "1234b");
		infoMap.put("c001", "1234c");
		infoMap.put("d001", "1234d");
		infoMap.put("e001", "1234e");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("아이디를 입력해주세요.");
		System.out.print(">>> ");
		String id = scan.nextLine();
		System.out.println("비밀번호를 입력해주세요.");
		System.out.print(">>> ");
		String pass = scan.nextLine();
		
		// 입력한 id가 key값 중에 존재하면 true, 없으면 fales
		
		// 입력한 id가 key값 중에 존재하면 value 리턴, 없으면 null 리턴
		// 입력한 id가 key값 중에 존재하면 null이 아님, 없으면 null 리턴
		
		if(infoMap.get(id) != null) {
			// id가 map안에 key값으로 존재
			// TODO 비밀번호 체크
			if(infoMap.get(id).equals(pass)){
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호가 틀립니다.");
			}
			
		} else {
			// id가 map안에 key값으로 존재하지 않음
			System.out.println("존재하지 않는 아이디 입니다.");
		}
		
		
		
	} // main 끝 지점
	
	
	
	
	// method ( 메소드) 시작 지점
	public static ArrayList<Integer> makeLotto(){
		HashSet <Integer> lottoSet = new HashSet<>();
		while (lottoSet.size() < 6) {
			// 랜덤 로또 번호를 lottoSet에 사이즈가 6이 될때 까지
			int rand = (int)(Math.random() * 45) + 1;
			
			lottoSet.add(rand);
			
//			if(lottoSet.size()==6) {
//				break;
//			}
		} 
		
		// HashSet을 ArrayList로 변환 후 ArrayList를 오름차순
		ArrayList <Integer> result = new ArrayList<>();
//		result.addAll(lottoSet);
		
		for ( Integer num : lottoSet ) {
			result.add(num);
		}
		
		// 정렬 
		Collections.sort(result);
		return result;
		
	}
	
	
	/**
	 * 본인이 만들고자 하는걸 생각하고 
	 * 옷가게 프로그램 !!!!!!!!!!!!!!!!!!!!!!!!!
	 * 구현해야 실력향상에 도움이 된다.
	 * (결과물을 먼저 생각하자!!!!!!!!!!!!!!!!!!!!!!!)
	 * 
	 * 지금부터 나는 옷장사를 시작한다.
	 * 하루가 시작되기 전 옷을 구매할 수 있고
	 * 하루가 시작 되면 판매하고 판매수익금이 발생된다.
	 * 영업이 마감되면 현재 자본금과 현재 재고 수량이 출력된다.
	 * 현재 자본금 = 3000000;
	 * 현재 보유하고 있는 티, 아우터, 바지에 대한 재고 수량
	 * 
	 * 선택지 ( 1. 구매 | 2. 장사 | 3. 마감 | 4. 휴업 )
	 * 
	 * 
	 * %%%%% 구매는 총 10번만 할 수 있다. %%%%%
	 * 
	 * 1) 구매 
	 * 구매할 때 선택지 (1. 티 | 2. 아우터 | 3. 바지 | 4. 현재 재고 목록)
	 * 		- 티, 아우터, 바지
	 * 		1) 티 ( 면티, 맨투맨, 후드티, 니트, ....)
	 * 			-- 구매 가격, 수량, 구매 후 재고 수량, 구매 후 잔액
	 * 			-- 면티의 번호, 이름, 가격 ex) 88001, 레어이드티, 4000
	 * 			-- 맨투맨의 번호, 이름, 가격 ex) 88011, 샌프란시스코맨투맨, 10000
	 * 			-- 후드티의 번호, 이름, 가격 ex) 88021, 무지후드, 14000 
	 * 			-- 후드 번호, 이름, 가격
	 * 		2) 아우터 ( 자켓, 점퍼, 코드, ....)
	 * 			-- 구매 가격, 수량, 구매 후 재고 수량, 구매 후 잔액
	 * 		3) 바지 ( 청바지, 면바지, 반바지, ...)
	 * 			-- 구매 가격, 수량, 구매 후 재고 수량, 구매 후 잔액
	 * 
	 * %%%%% 판매는 총 10번만 할 수 있다. %%%%% (랜덤)
	 * %%%%% 판매 가격은 구매 가격의 40% 인상 된 가격 %%%%%
	 * 2) 판매 
	 * 		1) 티 ( 면티, 맨투맨, 후드티, 니트, ....)
	 * 			-- 판매 가격, 수량, 판매 후 재고 수량, 판매 후 잔액
	 * 		2) 아우터 ( 자켓, 점퍼, 코드, ....)
	 * 			-- 판매 가격, 수량, 판매 후 재고 수량, 판매 후 잔액
	 * 		3) 바지 ( 청바지, 면바지, 반바지, ...)
	 * 			-- 판매 가격, 수량, 판매 후 재고 수량, 판매 후 잔액
	 * 3) 마감 
	 * 		1) 영업이 종료 되었습니다.
	 * 		2) 현재 자본금, 현재 재고 수량 출력
	 * 		3) 옷을 구매해주세요. ( 구매 반복 )
	 * 
	 * 어떤 기능이 들어갈지 
	 * ex) 수량을 입력하면 자본금에서 수량 * 상품가격 차감
	 * 
	 *	책 입고를 선택하였다면 어떤것이 출력될것인지
	 **/
	
	/**
	 * 주식관련 프로젝트
	 * 주식을 구매 판매 할 수 있도록
	 * 주식 리스트를 만든다
	 * 1) 주식이름
	 * 2) 주식의 시가
	 * 3) 
	 * */
	
}
