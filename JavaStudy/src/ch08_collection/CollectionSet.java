package ch08_collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CollectionSet {

	public static void main(String[] args) {
		// 집합(Set)
		
		// HashSet의 선언
		HashSet<String> stuSet = new HashSet<String>();
		HashSet<String> coffee = new HashSet<String>();
		
		// 다향성
		// List 중에 ArrayList가 있음
		List<String> stuList = new ArrayList<>();
		ArrayList<String> coffeeList = new ArrayList<>();
		
		// Set중에 HashSet이 있는거라서
		Set<String> stuSet2 = new HashSet<String>();
		
		// .add(값)
		// 값을 추가
		stuSet.add("박진영");
		stuSet.add("유동윤");
		stuSet.add("홍민경");
		
		System.out.println(stuSet);
		
		// 중복된 값이 추가 되지는 않는다.
		stuSet.add("박진영"); // 에러가 나는건 아님
		System.out.println(stuSet);
		
		System.out.println("\n================================================\n");
		
		// .size()
		// Set 내에 데이터 개수를 리턴한다. Set.size ==.length
		System.out.println(stuSet.size());
		
		System.out.println("\n================================================\n");
		
		// .contains(값)
		// 해당 값이 Set 안에 존재하면 true, 없으면 fales
		System.out.println(stuSet.contains("홍민경"));
		
		System.out.println("\n===========================================\n");
		
		// Set 조회
		// 1. Iterator 사용
		// Iterator<타입명 = String, int, ...> 변수명 = 
		Iterator<String> iter = stuSet.iterator();
		while(iter.hasNext()) {
			String name = iter.next();
			System.out.println(name);
		}
		
		// 1. 맨위, 그다음 내용 출력
		// 2. true 라면 계속 실행
		// 3. fales 라면 멈춤
		
		System.out.println("\n==================================\n");
		
		// Set 조회 
		// 향상된 for문 사용
		for(String stu   :   stuSet) {
			System.out.println(stu);
		}
		
		System.out.println("\n=====================================\n");
		
		// Set 조회
		// 3. forEach 사용
		stuSet.forEach(stu -> System.out.println(stu));
		
		System.out.println("\n===============================================\n");
		
		// Set은 집합을 쓰는 경우가 아니라면 잘 쓰지는 않는다.
		// 그나마 Set을 사용한다면
		// Set의 중복을 허용하지 않는 특징을 이요하는 경우이다.
		// 배열은 꾸져서 안쓴다. String(문자열) .split -> 문자 배열로 리턴
		// Map 에서 KeySet을 리턴 (Set)
		
		ArrayList<Integer> intList = new ArrayList<>();
		
		// 15부터 30 사이의 랜덤 숫자를 10개 담기
		// (int)(Math.random) +
		// 1~45 => (int)(Math.random() * 45) + 1;
		// 0~44 => (int)(Math.random() * 45); 경우의 수가 0부터 44까지 총 45개
		// 즉 
		// 0~ 15 => (int)(Math.random() * 16);
		// 15~30 => (int)(Math.random() * 16) + 15; =>> 15부터 시작하고 싶다면 + 15
		for(int i = 0; i < 10; i++) {
			int rand = (int)(Math.random() * 16) + 15;
			intList.add(rand);
		}
		System.out.println(intList);
		
		// ArrayList인 intList를 HashSet에 옮기기
		HashSet<Integer> intSet = new HashSet<>();
		// inSet.addAll(변수명); 을하면 
		// inList의 값이 (변수명)으로 다 추가된다.
		intSet.addAll(intList);
		// 중복된게 있다면 하나만 남는다.
		System.out.println(intSet);
		
		System.out.println("\n================================================\n");
		
		// 반대로
		// HashSet의 값을 ArrayList로 옮기기
		intList.clear(); // intList값 비우기
		intList.addAll(intSet);
		System.out.println(intList);
		// 인덱스의 순서는 보장하지 않는다.
		
		
		
		// 당연하게도 .addAll의 사용법을 몰라도
		// for문을 이용하여 옮길 수 있다.
		intList.clear(); // intList 비우기
		for(int num   :   intSet) {
			intList.add(num);
		}
		System.out.println(intList);
		
		
		
		
		
	} //main 끝
	
	
	
}
